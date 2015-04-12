package com.example.yanchao.myapplication;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.db.sqlite.Selector;
import com.lidroid.xutils.exception.DbException;


import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by yanchao on 15-4-12.
 */
public class GsonHelper {

    private Context mContext;
    protected Gson gson;
    private Group group;
    private String group_id;

    DbUtils dbUtils;

    public GsonHelper(Context context,String json){
        gson = new Gson();
        Type type = new TypeToken<Group>(){}.getType();
        group = gson.fromJson(json,type);

        group_id = group.getIm_group_Id();

        //create database
        dbUtils = DbUtils.create(context);

        try {
            dbUtils.dropDb();
            dbUtils.save(group);
            for(OwnerList ol:group.getOwnerList()){
                ol.setGroup_id(group_id);
                dbUtils.save(ol);
            }
        } catch (DbException e) {
            e.printStackTrace();
        }
    }

    public Group getGroup() {
        try {
          Group gp =   dbUtils.findAll(Group.class).get(0);
            List<OwnerList> ol = dbUtils.findAll(Selector.from(OwnerList.class).where("group_id","=",gp.getIm_group_Id()));
            gp.setOwnerList(ol);
            return gp;
        } catch (DbException e) {
            e.printStackTrace();
        }
        return null;
    }
}

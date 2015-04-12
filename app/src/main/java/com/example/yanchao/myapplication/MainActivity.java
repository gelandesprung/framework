package com.example.yanchao.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Id;
import com.lidroid.xutils.db.annotation.Table;
import com.lidroid.xutils.db.annotation.Transient;
import com.lidroid.xutils.exception.DbException;


public class MainActivity extends Activity {

    private final static String jsonblock = "{\"approval\":true,\"createon\":1422275696661,\"desc\":\"公司所有员工\",\"ent_code\":\"im\",\"group_image\":\"\",\"group_image_thumbnal\":\"\",\"group_name\":\"全体群\",\"id\":\"54c63470a31064913add33d7\",\"ownerList\":[{\"org_code\":\"751021997\",\"owner_id\":\"hecom__18611745901\",\"type\":1,\"user_code\":\"751022314\"},{\"org_code\":\"751021997\",\"owner_id\":\"hecom__151011307108\",\"type\":1,\"user_code\":\"751022382\"},{\"org_code\":\"751021997\",\"owner_id\":\"hecom__13621000001\",\"type\":1,\"user_code\":\"751022263\"}]\n" +
            "\n" +
            ",\"im_group_Id\":\"142227570368171\",\"maxUsers\":3000,\"members\":\"01010101,03030303,1030303,2030303,2020202,1020202,2010101,3010101,1010101,3020202,\",\"non_fixed_members\":\"1111,2222\",\"owner\":\"hecomadmin\",\"owner_org_code\":\"\",\"pub\":true,\"type\":1,\"updateon\":1422275696661}";
    private GsonHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new GsonHelper(this,jsonblock);
        findViewById(R.id.search).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread();
            }

            private void runOnUiThread() {
                Group g = helper.getGroup();
               Log.d("Q",g.toString());
                for(OwnerList ol:g.getOwnerList())
                Log.d("Q",ol.toString());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

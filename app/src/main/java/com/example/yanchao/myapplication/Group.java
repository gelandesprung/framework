package com.example.yanchao.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Transient;
import com.lidroid.xutils.db.annotation.Id;
import com.lidroid.xutils.db.annotation.Table;

import java.util.List;
import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.db.annotation.Transient;

/**
 * Created by yanchao on 15-4-12.
 */
@Table(name = "hecom_group_info")
public class Group implements Parcelable {

    @Id
    private int _id;
    @Column
    private String approval;
    @Column
    private String createon;
    @Column
    String desc;
    @Column
    String ent_code;
    @Column
    String group_image;
    @Column
    String group_image_thumbnal;
    @Column
    String group_name;
    @Column
    String id;
    @Transient
    List<OwnerList> ownerList;
    @Column
    String im_group_Id;
    @Column
    String maxUsers;
    @Column
    String members;
    @Column
    String non_fixed_members;
    @Column
    String owner;
    @Column
    String owner_org_code;
    @Column
    String pub;
    @Column
    String type;
    @Column
    String updateon;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    public String getCreateon() {
        return createon;
    }

    public void setCreateon(String createon) {
        this.createon = createon;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getEnt_code() {
        return ent_code;
    }

    public void setEnt_code(String ent_code) {
        this.ent_code = ent_code;
    }

    public String getGroup_image() {
        return group_image;
    }

    public void setGroup_image(String group_image) {
        this.group_image = group_image;
    }

    public String getGroup_image_thumbnal() {
        return group_image_thumbnal;
    }

    public void setGroup_image_thumbnal(String group_image_thumbnal) {
        this.group_image_thumbnal = group_image_thumbnal;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<OwnerList> getOwnerList() {
        return ownerList;
    }

    public void setOwnerList(List<OwnerList> ownerList) {
        this.ownerList = ownerList;
    }

    public String getIm_group_Id() {
        return im_group_Id;
    }

    public void setIm_group_Id(String im_group_Id) {
        this.im_group_Id = im_group_Id;
    }

    public String getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(String maxUsers) {
        this.maxUsers = maxUsers;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public String getNon_fixed_members() {
        return non_fixed_members;
    }

    public void setNon_fixed_members(String non_fixed_members) {
        this.non_fixed_members = non_fixed_members;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner_org_code() {
        return owner_org_code;
    }

    public void setOwner_org_code(String owner_org_code) {
        this.owner_org_code = owner_org_code;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdateon() {
        return updateon;
    }

    public void setUpdateon(String updateon) {
        this.updateon = updateon;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this._id);
        dest.writeString(this.approval);
        dest.writeString(this.createon);
        dest.writeString(this.desc);
        dest.writeString(this.ent_code);
        dest.writeString(this.group_image);
        dest.writeString(this.group_image_thumbnal);
        dest.writeString(this.group_name);
        dest.writeString(this.id);
        dest.writeTypedList(ownerList);
        dest.writeString(this.im_group_Id);
        dest.writeString(this.maxUsers);
        dest.writeString(this.members);
        dest.writeString(this.non_fixed_members);
        dest.writeString(this.owner);
        dest.writeString(this.owner_org_code);
        dest.writeString(this.pub);
        dest.writeString(this.type);
        dest.writeString(this.updateon);
    }

    public Group() {
    }

    private Group(Parcel in) {
        this._id = in.readInt();
        this.approval = in.readString();
        this.createon = in.readString();
        this.desc = in.readString();
        this.ent_code = in.readString();
        this.group_image = in.readString();
        this.group_image_thumbnal = in.readString();
        this.group_name = in.readString();
        this.id = in.readString();
        in.readTypedList(ownerList, OwnerList.CREATOR);
        this.im_group_Id = in.readString();
        this.maxUsers = in.readString();
        this.members = in.readString();
        this.non_fixed_members = in.readString();
        this.owner = in.readString();
        this.owner_org_code = in.readString();
        this.pub = in.readString();
        this.type = in.readString();
        this.updateon = in.readString();
    }

    public static final Creator<Group> CREATOR = new Creator<Group>() {
        public Group createFromParcel(Parcel source) {
            return new Group(source);
        }

        public Group[] newArray(int size) {
            return new Group[size];
        }
    };

    @Override
    public String toString() {
        return "Group{" +
                "_id=" + _id +
                ", approval='" + approval + '\'' +
                ", createon='" + createon + '\'' +
                ", desc='" + desc + '\'' +
                ", ent_code='" + ent_code + '\'' +
                ", group_image='" + group_image + '\'' +
                ", group_image_thumbnal='" + group_image_thumbnal + '\'' +
                ", group_name='" + group_name + '\'' +
                ", id='" + id + '\'' +
                ", ownerList=" + ownerList +
                ", im_group_Id='" + im_group_Id + '\'' +
                ", maxUsers='" + maxUsers + '\'' +
                ", members='" + members + '\'' +
                ", non_fixed_members='" + non_fixed_members + '\'' +
                ", owner='" + owner + '\'' +
                ", owner_org_code='" + owner_org_code + '\'' +
                ", pub='" + pub + '\'' +
                ", type='" + type + '\'' +
                ", updateon='" + updateon + '\'' +
                '}';
    }
}

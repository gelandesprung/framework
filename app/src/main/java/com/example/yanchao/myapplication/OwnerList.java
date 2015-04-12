package com.example.yanchao.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Id;
import com.lidroid.xutils.db.annotation.Table;

/**
 * Created by yanchao on 15-4-12.
 */
@Table(name = "owner_list")
public  class OwnerList implements Parcelable {
    @Id
    private int _id;
    @Column
    String org_code;
    @Column
    String owner_id;
    @Column
    String type;
    @Column
    String user_code;
    @Column
    String group_id;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getOrg_code() {
        return org_code;
    }

    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this._id);
        dest.writeString(this.org_code);
        dest.writeString(this.owner_id);
        dest.writeString(this.type);
        dest.writeString(this.user_code);
        dest.writeString(this.group_id);
    }

    public OwnerList() {
    }

    private OwnerList(Parcel in) {
        this._id = in.readInt();
        this.org_code = in.readString();
        this.owner_id = in.readString();
        this.type = in.readString();
        this.user_code = in.readString();
        this.group_id = in.readString();
    }

    public static final Creator<OwnerList> CREATOR = new Creator<OwnerList>() {
        public OwnerList createFromParcel(Parcel source) {
            return new OwnerList(source);
        }

        public OwnerList[] newArray(int size) {
            return new OwnerList[size];
        }
    };

    @Override
    public String toString() {
        return "OwnerList{" +
                "org_code='" + org_code + '\'' +
                ", owner_id='" + owner_id + '\'' +
                ", type='" + type + '\'' +
                ", user_code='" + user_code + '\'' +
                ", group_id='" + group_id + '\'' +
                '}';
    }
}

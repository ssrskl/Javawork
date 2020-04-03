package com.maoyan.pojo;

public class User {
    private int uid;
    private String uname;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    private String pwd;

    public User() {
        super();
    }
    public User(int uid,String uname,String pwd) {
        super();
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
    }
}

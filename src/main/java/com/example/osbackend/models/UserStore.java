package com.example.osbackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_store")
public class UserStore {

    @Id
    @Column(name = "u_id", nullable = false)
    private String uId;

    @Id
    @Column(name = "s_id", nullable = false)
    private String sId;

    public void setUId(String uId) {
        this.uId = uId;
    }

    public String getUId() {
        return uId;
    }

    public void setSId(String sId) {
        this.sId = sId;
    }

    public String getSId() {
        return sId;
    }

    @Override
    public String toString() {
        return "UserStore{" +
                "uId=" + uId + '\'' +
                "sId=" + sId + '\'' +
                '}';
    }
}

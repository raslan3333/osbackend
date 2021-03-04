package com.example.osbackend.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Entity(name = "Store")
@Table(name = "store", uniqueConstraints = {
        @UniqueConstraint(name = "store_email_unique", columnNames = "s_email"),
        @UniqueConstraint(name = "store_tel_unique", columnNames = "s_tel")
})
public class Store {

    public Store(String name, String email,
                 String tel, String subject,
                 String regNum, String address,
                 String country, boolean hasDelivery) {
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.subject = subject;
        this.regNum = regNum;
        this.address = address;
        this.country = country;
        this.hasDelivery = hasDelivery;
    }

    public Store() {
    }

    @Id
    @Column(name = "s_id")
    private UUID id;
    @Column(name = "s_name", nullable = false, length = 50)
    private String name;
    @Column(name = "s_email", length = 100)
    private String email;
    @Column(name = "s_tel", length = 20)
    private String tel;
    @Column(name = "s_subject", nullable = false, length = 50)
    private String subject;
    @Column(name = "s_description", nullable = false, length = 512)
    private String description;
    @Column(name = "s_reg_num", nullable = false)
    private String regNum;
    @Column(name = "s_address", nullable = false)
    private String address;
    @Column(name = "s_country", nullable = false)
    private String country;
    @Column(name = "s_has_delivery", nullable = false)
    private boolean hasDelivery;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean getHasDelivery() {
        return hasDelivery;
    }

    public void setHasDelivery(boolean hasDelivery) {
        this.hasDelivery = hasDelivery;
    }
}

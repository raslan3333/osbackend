package com.example.osbackend.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "o_id", nullable = false)
    private Long oId;

    @Column(name = "o_userId")
    private String oUserid;

    @Column(name = "o_sessionId", nullable = false)
    private String oSessionid;

    @Column(name = "o_token", nullable = false)
    private String oToken;

    @Column(name = "o_status", nullable = false)
    private Integer oStatus;

    @Column(name = "o_subTotal", nullable = false)
    private Float oSubtotal;

    @Column(name = "o_itemDiscount", nullable = false)
    private Float oItemdiscount;

    @Column(name = "o_tax", nullable = false)
    private Float oTax;

    @Column(name = "o_shipping", nullable = false)
    private Float oShipping;

    @Column(name = "o_total", nullable = false)
    private Float oTotal;

    @Column(name = "o_promo")
    private String oPromo;

    @Column(name = "o_discount", nullable = false)
    private Float oDiscount;

    @Column(name = "o_grandTotal", nullable = false)
    private Float oGrandtotal;

    @Column(name = "o_firstName")
    private String oFirstname;

    @Column(name = "o_lastName")
    private String oLastname;

    @Column(name = "o_mobile")
    private String oMobile;

    @Column(name = "o_email")
    private String oEmail;

    @Column(name = "o_address")
    private String oAddress;

    @Column(name = "o_city")
    private String oCity;

    @Column(name = "o_country")
    private String oCountry;

    @Column(name = "o_createdAt", nullable = false)
    private Date oCreatedat;

    @Column(name = "o_updatedAt")
    private Date oUpdatedat;

    @Column(name = "o_content")
    private String oContent;

    public void setOId(Long oId) {
        this.oId = oId;
    }

    public Long getOId() {
        return oId;
    }

    public void setOUserid(String oUserid) {
        this.oUserid = oUserid;
    }

    public String getOUserid() {
        return oUserid;
    }

    public void setOSessionid(String oSessionid) {
        this.oSessionid = oSessionid;
    }

    public String getOSessionid() {
        return oSessionid;
    }

    public void setOToken(String oToken) {
        this.oToken = oToken;
    }

    public String getOToken() {
        return oToken;
    }

    public void setOStatus(Integer oStatus) {
        this.oStatus = oStatus;
    }

    public Integer getOStatus() {
        return oStatus;
    }

    public void setOSubtotal(Float oSubtotal) {
        this.oSubtotal = oSubtotal;
    }

    public Float getOSubtotal() {
        return oSubtotal;
    }

    public void setOItemdiscount(Float oItemdiscount) {
        this.oItemdiscount = oItemdiscount;
    }

    public Float getOItemdiscount() {
        return oItemdiscount;
    }

    public void setOTax(Float oTax) {
        this.oTax = oTax;
    }

    public Float getOTax() {
        return oTax;
    }

    public void setOShipping(Float oShipping) {
        this.oShipping = oShipping;
    }

    public Float getOShipping() {
        return oShipping;
    }

    public void setOTotal(Float oTotal) {
        this.oTotal = oTotal;
    }

    public Float getOTotal() {
        return oTotal;
    }

    public void setOPromo(String oPromo) {
        this.oPromo = oPromo;
    }

    public String getOPromo() {
        return oPromo;
    }

    public void setODiscount(Float oDiscount) {
        this.oDiscount = oDiscount;
    }

    public Float getODiscount() {
        return oDiscount;
    }

    public void setOGrandtotal(Float oGrandtotal) {
        this.oGrandtotal = oGrandtotal;
    }

    public Float getOGrandtotal() {
        return oGrandtotal;
    }

    public void setOFirstname(String oFirstname) {
        this.oFirstname = oFirstname;
    }

    public String getOFirstname() {
        return oFirstname;
    }

    public void setOLastname(String oLastname) {
        this.oLastname = oLastname;
    }

    public String getOLastname() {
        return oLastname;
    }

    public void setOMobile(String oMobile) {
        this.oMobile = oMobile;
    }

    public String getOMobile() {
        return oMobile;
    }

    public void setOEmail(String oEmail) {
        this.oEmail = oEmail;
    }

    public String getOEmail() {
        return oEmail;
    }

    public void setOAddress(String oAddress) {
        this.oAddress = oAddress;
    }

    public String getOAddress() {
        return oAddress;
    }

    public void setOCity(String oCity) {
        this.oCity = oCity;
    }

    public String getOCity() {
        return oCity;
    }

    public void setOCountry(String oCountry) {
        this.oCountry = oCountry;
    }

    public String getOCountry() {
        return oCountry;
    }

    public void setOCreatedat(Date oCreatedat) {
        this.oCreatedat = oCreatedat;
    }

    public Date getOCreatedat() {
        return oCreatedat;
    }

    public void setOUpdatedat(Date oUpdatedat) {
        this.oUpdatedat = oUpdatedat;
    }

    public Date getOUpdatedat() {
        return oUpdatedat;
    }

    public void setOContent(String oContent) {
        this.oContent = oContent;
    }

    public String getOContent() {
        return oContent;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oId=" + oId + '\'' +
                "oUserid=" + oUserid + '\'' +
                "oSessionid=" + oSessionid + '\'' +
                "oToken=" + oToken + '\'' +
                "oStatus=" + oStatus + '\'' +
                "oSubtotal=" + oSubtotal + '\'' +
                "oItemdiscount=" + oItemdiscount + '\'' +
                "oTax=" + oTax + '\'' +
                "oShipping=" + oShipping + '\'' +
                "oTotal=" + oTotal + '\'' +
                "oPromo=" + oPromo + '\'' +
                "oDiscount=" + oDiscount + '\'' +
                "oGrandtotal=" + oGrandtotal + '\'' +
                "oFirstname=" + oFirstname + '\'' +
                "oLastname=" + oLastname + '\'' +
                "oMobile=" + oMobile + '\'' +
                "oEmail=" + oEmail + '\'' +
                "oAddress=" + oAddress + '\'' +
                "oCity=" + oCity + '\'' +
                "oCountry=" + oCountry + '\'' +
                "oCreatedat=" + oCreatedat + '\'' +
                "oUpdatedat=" + oUpdatedat + '\'' +
                "oContent=" + oContent + '\'' +
                '}';
    }
}

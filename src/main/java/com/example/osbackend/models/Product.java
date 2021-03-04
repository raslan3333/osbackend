package com.example.osbackend.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "product")
public class Product  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id", nullable = false)
    private Long pId;

    @Column(name = "p_title", nullable = false)
    private String pTitle;

    @Column(name = "p_userId", nullable = false)
    private String pUserid;

    @Column(name = "p_metaTitle")
    private String pMetatitle;

    @Column(name = "p_slug", nullable = false)
    private String pSlug;

    @Column(name = "p_summary")
    private String pSummary;

    @Column(name = "p_type", nullable = false)
    private Integer pType;

    @Column(name = "p_sku", nullable = false)
    private String pSku;

    @Column(name = "p_price", nullable = false)
    private Float pPrice;

    @Column(name = "p_discount", nullable = false)
    private Float pDiscount;

    @Column(name = "p_quantity", nullable = false)
    private Integer pQuantity;

    @Column(name = "p_shop", nullable = false)
    private Integer pShop;

    @Column(name = "p_createdAt", nullable = false)
    private Date pCreatedat;

    @Column(name = "p_updatedAt")
    private Date pUpdatedat;

    @Column(name = "p_publishedAT")
    private Date pPublishedat;

    @Column(name = "p_startsAt")
    private Date pStartsat;

    @Column(name = "p_endsAt")
    private Date pEndsat;

    @Column(name = "p_content")
    private String pContent;

    public void setPId(Long pId) {
        this.pId = pId;
    }

    public Long getPId() {
        return pId;
    }

    public void setPTitle(String pTitle) {
        this.pTitle = pTitle;
    }

    public String getPTitle() {
        return pTitle;
    }

    public void setPUserid(String pUserid) {
        this.pUserid = pUserid;
    }

    public String getPUserid() {
        return pUserid;
    }

    public void setPMetatitle(String pMetatitle) {
        this.pMetatitle = pMetatitle;
    }

    public String getPMetatitle() {
        return pMetatitle;
    }

    public void setPSlug(String pSlug) {
        this.pSlug = pSlug;
    }

    public String getPSlug() {
        return pSlug;
    }

    public void setPSummary(String pSummary) {
        this.pSummary = pSummary;
    }

    public String getPSummary() {
        return pSummary;
    }

    public void setPType(Integer pType) {
        this.pType = pType;
    }

    public Integer getPType() {
        return pType;
    }

    public void setPSku(String pSku) {
        this.pSku = pSku;
    }

    public String getPSku() {
        return pSku;
    }

    public void setPPrice(Float pPrice) {
        this.pPrice = pPrice;
    }

    public Float getPPrice() {
        return pPrice;
    }

    public void setPDiscount(Float pDiscount) {
        this.pDiscount = pDiscount;
    }

    public Float getPDiscount() {
        return pDiscount;
    }

    public void setPQuantity(Integer pQuantity) {
        this.pQuantity = pQuantity;
    }

    public Integer getPQuantity() {
        return pQuantity;
    }

    public void setPShop(Integer pShop) {
        this.pShop = pShop;
    }

    public Integer getPShop() {
        return pShop;
    }

    public void setPCreatedat(Date pCreatedat) {
        this.pCreatedat = pCreatedat;
    }

    public Date getPCreatedat() {
        return pCreatedat;
    }

    public void setPUpdatedat(Date pUpdatedat) {
        this.pUpdatedat = pUpdatedat;
    }

    public Date getPUpdatedat() {
        return pUpdatedat;
    }

    public void setPPublishedat(Date pPublishedat) {
        this.pPublishedat = pPublishedat;
    }

    public Date getPPublishedat() {
        return pPublishedat;
    }

    public void setPStartsat(Date pStartsat) {
        this.pStartsat = pStartsat;
    }

    public Date getPStartsat() {
        return pStartsat;
    }

    public void setPEndsat(Date pEndsat) {
        this.pEndsat = pEndsat;
    }

    public Date getPEndsat() {
        return pEndsat;
    }

    public void setPContent(String pContent) {
        this.pContent = pContent;
    }

    public String getPContent() {
        return pContent;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId=" + pId + '\'' +
                "pTitle=" + pTitle + '\'' +
                "pUserid=" + pUserid + '\'' +
                "pMetatitle=" + pMetatitle + '\'' +
                "pSlug=" + pSlug + '\'' +
                "pSummary=" + pSummary + '\'' +
                "pType=" + pType + '\'' +
                "pSku=" + pSku + '\'' +
                "pPrice=" + pPrice + '\'' +
                "pDiscount=" + pDiscount + '\'' +
                "pQuantity=" + pQuantity + '\'' +
                "pShop=" + pShop + '\'' +
                "pCreatedat=" + pCreatedat + '\'' +
                "pUpdatedat=" + pUpdatedat + '\'' +
                "pPublishedat=" + pPublishedat + '\'' +
                "pStartsat=" + pStartsat + '\'' +
                "pEndsat=" + pEndsat + '\'' +
                "pContent=" + pContent + '\'' +
                '}';
    }
}

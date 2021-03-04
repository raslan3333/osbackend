package com.example.osbackend.models;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id", nullable = false)
    private Integer cId;

    @Column(name = "c_parent_id")
    private Integer cParentId;

    @Column(name = "c_title", nullable = false)
    private String cTitle;

    @Column(name = "c_metaTitle")
    private String cMetatitle;

    @Column(name = "c_slug", nullable = false)
    private String cSlug;

    @Column(name = "c_content")
    private String cContent;

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public Integer getCId() {
        return cId;
    }

    public void setCParentId(Integer cParentId) {
        this.cParentId = cParentId;
    }

    public Integer getCParentId() {
        return cParentId;
    }

    public void setCTitle(String cTitle) {
        this.cTitle = cTitle;
    }

    public String getCTitle() {
        return cTitle;
    }

    public void setCMetatitle(String cMetatitle) {
        this.cMetatitle = cMetatitle;
    }

    public String getCMetatitle() {
        return cMetatitle;
    }

    public void setCSlug(String cSlug) {
        this.cSlug = cSlug;
    }

    public String getCSlug() {
        return cSlug;
    }

    public void setCContent(String cContent) {
        this.cContent = cContent;
    }

    public String getCContent() {
        return cContent;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cId=" + cId + '\'' +
                "cParentId=" + cParentId + '\'' +
                "cTitle=" + cTitle + '\'' +
                "cMetatitle=" + cMetatitle + '\'' +
                "cSlug=" + cSlug + '\'' +
                "cContent=" + cContent + '\'' +
                '}';
    }
}

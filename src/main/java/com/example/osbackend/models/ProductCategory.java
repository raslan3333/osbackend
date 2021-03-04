package com.example.osbackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_category")
public class ProductCategory  {

    @Id
    @Column(name = "p_id", nullable = false)
    private Long pId;

    @Id
    @Column(name = "c_id", nullable = false)
    private Integer cId;

    public void setPId(Long pId) {
        this.pId = pId;
    }

    public Long getPId() {
        return pId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public Integer getCId() {
        return cId;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "pId=" + pId + '\'' +
                "cId=" + cId + '\'' +
                '}';
    }
}

package com.portfolio.portfoliospring.model;

import jakarta.persistence.*;

@Entity
@Table(name="extrasimg")
public class ExtrasImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ExtrasImgID;
    private String ImgURL;

    // Getters y setters
    public Long getExtrasImgId() {
        return ExtrasImgID;
    }

    public void setExtrasImgId(Long extrasImgId) {
        this.ExtrasImgID = extrasImgId;
    }

    public String getImgURL() {
        return ImgURL;
    }

    public void setImgURL(String imgURL) {
        this.ImgURL = imgURL;
    }
}


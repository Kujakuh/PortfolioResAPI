package com.portfolio.portfoliospring.model;

import jakarta.persistence.*;

@Entity
@Table(name="whoisthisguy")
public class WhoIsThisGuy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long WhoIsThisGuyID;
    private String Description;
    private String ImageURL;

    public Long getWhoIsThisGuyId() {
        return WhoIsThisGuyID;
    }

    public void setWhoIsThisGuyId(Long whoIsThisGuyId) {
        this.WhoIsThisGuyID = whoIsThisGuyId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        this.ImageURL = imageURL;
    }
}

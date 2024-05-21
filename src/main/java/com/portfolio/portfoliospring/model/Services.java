package com.portfolio.portfoliospring.model;

import jakarta.persistence.*;

@Entity
@Table(name="services")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ServiceID;
    private String Title;
    private String Description;
    private String ImageURL;

    public Long getServiceId() {
        return ServiceID;
    }

    public void setServiceId(Long serviceId) {
        this.ServiceID = serviceId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
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


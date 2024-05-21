package com.portfolio.portfoliospring.model;

import jakarta.persistence.*;

@Entity
@Table(name="header")
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long HeaderID;
    private String WelcomeText;
    private String Name;

    public Long getHeaderId() {
        return HeaderID;
    }

    public void setHeaderId(Long headerId) {
        this.HeaderID = headerId;
    }

    public String getWelcomeText() {
        return WelcomeText;
    }

    public void setWelcomeText(String welcomeText) {
        this.WelcomeText = welcomeText;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
}

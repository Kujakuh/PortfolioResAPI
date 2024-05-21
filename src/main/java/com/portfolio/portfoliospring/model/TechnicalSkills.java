package com.portfolio.portfoliospring.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="technicalskills")
public class TechnicalSkills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SkillName")
    private String SkillName;
    @Column(name = "SkillCategory")
    private String SkillCategory;
    @Column(name = "SkillLevel")
    private String SkillLevel;

    public String getSkillName() {
        return SkillName;
    }

    public void setSkillName(String SkillName) {
        this.SkillName = SkillName;
    }

    public String getSkillCategory() {
        return SkillCategory;
    }

    public void setSkillCategory(String SkillCategory) {
        this.SkillCategory = SkillCategory;
    }

    public String getSkillLevel() {
        return SkillLevel;
    }

    public void setSkillLevel(String SkillLevel) {
        this.SkillLevel = SkillLevel;
    }
}

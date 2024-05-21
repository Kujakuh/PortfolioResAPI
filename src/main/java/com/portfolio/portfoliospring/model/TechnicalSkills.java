package com.portfolio.portfoliospring.model;

import jakarta.persistence.*;

@Entity
@Table(name="technicalskills")
public class TechnicalSkills {
    @Id
    private String SkillName;
    private String SkillCategory;
    private String SkillLevel;

    public String getSkillName() {
        return SkillName;
    }

    public void setSkillName(String skillName) {
        this.SkillName = skillName;
    }

    public String getSkillCategory() {
        return SkillCategory;
    }

    public void setSkillCategory(String skillCategory) {
        this.SkillCategory = skillCategory;
    }

    public String getSkillLevel() {
        return SkillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.SkillLevel = skillLevel;
    }
}

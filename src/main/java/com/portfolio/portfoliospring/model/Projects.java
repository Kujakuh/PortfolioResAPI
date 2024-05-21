package com.portfolio.portfoliospring.model;

import jakarta.persistence.*;

@Entity
@Table(name="projects")
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ProjectID;
    private String ProjectName;
    private String Description;
    private String GitURL;
    private String ImageURL;

    // Getters y setters
    public Long getProjectId() {
        return ProjectID;
    }

    public void setProjectId(Long projectId) {
        this.ProjectID = projectId;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        this.ProjectName = projectName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getGitURL() {
        return GitURL;
    }

    public void setGitURL(String gitURL) { this.GitURL = gitURL; }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        this.ImageURL = imageURL;
    }
}


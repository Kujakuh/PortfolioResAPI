package com.portfolio.portfoliospring.model;

import jakarta.persistence.*;

@Entity
@Table(name="contactme")
public class ContactMe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ContactID;
    private String ContactText;
    private String FormNamePlaceholder;
    private String FormEmailPlaceholder;
    private String FormMessagePlaceholder;

    public Long getContactId() {
        return ContactID;
    }

    public void setContactId(Long contactId) {
        this.ContactID = contactId;
    }

    public String getContactText() {
        return ContactText;
    }

    public void setContactText(String contactText) {
        this.ContactText = contactText;
    }

    public String getFormNamePlaceholder() {
        return FormNamePlaceholder;
    }

    public void setFormNamePlaceholder(String formNamePlaceholder) {
        this.FormNamePlaceholder = formNamePlaceholder;
    }

    public String getFormEmailPlaceholder() {
        return FormEmailPlaceholder;
    }

    public void setFormEmailPlaceholder(String formEmailPlaceholder) {
        this.FormEmailPlaceholder = formEmailPlaceholder;
    }

    public String getFormMessagePlaceholder() {
        return FormMessagePlaceholder;
    }

    public void setFormMessagePlaceholder(String formMessagePlaceholder) {
        this.FormMessagePlaceholder = formMessagePlaceholder;
    }
}


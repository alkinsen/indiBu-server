package com.indibu.indiBuserver.model;

import com.indibu.indiBuserver.data.entity.Deal;
import com.indibu.indiBuserver.data.entity.User;

import java.util.Date;
import java.util.Set;

public class DealInformation {
    private String title;
    private String description;
    private Set<Category> categories;
    private Date dateOfCreation;
    private Date dateOfUpdate;
    private User user;
    private int hotVoteCounter;
    private int coldVoteCounter;
    private String photoUrl;

    public DealInformation(Deal deal) {
        this.title = deal.getTitle();
        this.description = deal.getDescription();
        this.categories = deal.getCategories();
        this.dateOfCreation = deal.getDateOfCreation();
        this.dateOfUpdate = deal.getDateOfUpdate();
        this.hotVoteCounter = deal.getHotVoteCounter();
        this.coldVoteCounter = deal.getColdVoteCounter();
        this.photoUrl = deal.getPhotoUrl();
    }

    public DealInformation() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Date getDateOfUpdate() {
        return dateOfUpdate;
    }

    public void setDateOfUpdate(Date dateOfUpdate) {
        this.dateOfUpdate = dateOfUpdate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getHotVoteCounter() {
        return hotVoteCounter;
    }

    public void setHotVoteCounter(int hotVoteCounter) {
        this.hotVoteCounter = hotVoteCounter;
    }

    public int getColdVoteCounter() {
        return coldVoteCounter;
    }

    public void setColdVoteCounter(int coldVoteCounter) {
        this.coldVoteCounter = coldVoteCounter;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
package com.indibu.indiBuserver.model;


import com.indibu.indiBuserver.data.entity.Deal;

import java.util.Date;
import java.util.Set;

public class DealResponseModel {

    private long id;
    private String title;
    private String description;
    private Set<Category> categories;
    private Date created;
    private Date updated;
    private int hotVoteCounter;
    private int coldVoteCounter;
    private String photoUrl;

    private String author;
    private double referencePoint;
    private int referenceCount;
    private int commentCount;

    public DealResponseModel() {
    }

    public DealResponseModel(Deal deal) {

        id = deal.getId();
        title = deal.getTitle();
        description = deal.getDescription();
        categories = deal.getCategories();
        created = deal.getDateOfCreation();
        updated = deal.getDateOfUpdate();
        hotVoteCounter = deal.getHotVoteCounter();
        coldVoteCounter = deal.getColdVoteCounter();
        photoUrl = deal.getPhotoUrl();
        commentCount = deal.getCommentCount();

        author = deal.getUser().getNickName();
        referencePoint = deal.getUser().getAverageRating();
        referenceCount = deal.getUser().getReviewNumberCounter();

    }

    public int getReferenceCount() {
        return referenceCount;
    }

    public void setReferenceCount(int referenceCount) {
        this.referenceCount = referenceCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getReferencePoint() {
        return referencePoint;
    }

    public void setReferencePoint(double referencePoint) {
        this.referencePoint = referencePoint;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
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

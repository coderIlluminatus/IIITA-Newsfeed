package com.geekhaven.iiitanewsfeed.Models;

import java.util.Calendar;

/**
 * Created by better_clever on 17/9/16.
 */
public class NewsItem {

    private String title;
    private String society;
    private String description;
    private String imageUrl;
    private String date;
    private String time;
    private boolean hasImage;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        society = society;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isHasImage() {
        return hasImage;
    }

    public void setHasImage(boolean hasImage) {
        this.hasImage = hasImage;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

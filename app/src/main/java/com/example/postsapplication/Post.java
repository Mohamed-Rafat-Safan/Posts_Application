package com.example.postsapplication;

import java.io.Serializable;
import java.security.PrivateKey;

public class Post implements Serializable {

    private String date ;
    private String name ;
    private String message_user ;
    private int following ;
    private int posts ;
    private int followers ;

    public Post(String date, String name, String message_user, int following, int posts, int followers) {
        this.date = date;
        this.name = name;
        this.message_user = message_user;
        this.following = following;
        this.posts = posts;
        this.followers = followers;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage_user() {
        return message_user;
    }

    public void setMessage_user(String message_user) {
        this.message_user = message_user;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getPosts() {
        return posts;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }
}

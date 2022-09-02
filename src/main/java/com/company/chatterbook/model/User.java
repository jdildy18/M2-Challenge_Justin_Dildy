package com.company.chatterbook.model;

import java.util.List;
public class User {
    private String name;
    private List<ChatterPost> ChatterPosts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ChatterPost> getChatterPosts() {
        return ChatterPosts;
    }

    public void setChatterPosts(List<ChatterPost> chatterPosts) {
        ChatterPosts = chatterPosts;
    }

    public User(String name) {
        this.name = name;
    }
}

package com.example.demo.entity;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Post")
public class Post {
    private String company;
    private int vacansy;
    private String location;
    private String Type;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getVacansy() {
        return vacansy;
    }

    public void setVacansy(int vacansy) {
        this.vacansy = vacansy;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}

package com.example.tourguide;

public class Location {
    private String name;
    private String description;
    private String image;

    public Location(String sName, String sDescription, String sImage){
        name = sName;
        description = sDescription;
        image = sImage;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getImage(){
        return  image;
    }
}

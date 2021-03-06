package com.development.aspire.comp313_customlist;

/**
 * Created by ASPIRE on 11-02-2018.
 */

//Base class to hold information about our property
public class Property {

    //property basics
    private String title;
    private String description;
    private String image;
    private Double price;
    private Boolean featured;

    //constructor
    public Property(
            String title, String description, Double price, String image, Boolean featured){

        this.title = title;
        this.description = description;
        this.price = price;
        this.image = image;
        this.featured = featured;
    }

    //getters
    public String getTitle() { return title; }
    public String getDescription() {return description; }
    public Double getPrice() {return price; }
    public String getImage() { return image; }
    public Boolean getFeatured(){return featured; }
}

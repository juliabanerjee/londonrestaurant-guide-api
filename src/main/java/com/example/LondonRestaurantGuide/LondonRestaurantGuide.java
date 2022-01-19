package com.example.LondonRestaurantGuide;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class LondonRestaurantGuide {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private String cuisine;
    private String priceRating;
    private String myRating;

public LondonRestaurantGuide(){

}

public LondonRestaurantGuide(String name, String address, String phoneNumber, String cuisine, String priceRating, String myRating){
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.cuisine = cuisine;
    this.priceRating = priceRating;
    this.myRating = myRating;
}
//Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
    return phoneNumber;
    }
    public String getCuisine() {
        return cuisine;
    }
    public String getPriceRating() {
        return priceRating;
    }
    public String getMyRating() {
        return myRating;
    }

}

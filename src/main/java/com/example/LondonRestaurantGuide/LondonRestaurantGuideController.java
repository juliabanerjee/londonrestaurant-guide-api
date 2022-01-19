package com.example.LondonRestaurantGuide;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RestController
public class LondonRestaurantGuideController {
    @Autowired
           LondonRestaurantGuideRepository repository;

    ArrayList<LondonRestaurantGuide> londonRestaurants = new ArrayList<>();

//    @GetMapping("/home")
//    public String home() {
//        return "Welcome";
//    }

    @GetMapping("/restaurants")
    public List<LondonRestaurantGuide> getRestaurants(){
        return repository.findAll();
    }

    @PostMapping("/restaurant")
    public String createRestaurant(@RequestBody LondonRestaurantGuide restaurant){
        repository.save(restaurant);
        londonRestaurants.add(restaurant);
        return "Restaurant " + restaurant.getName() + " has been added";
    }

//    @DeleteMapping("restaurant/{id}")
//    @Transactional
//    public String deleteRestaurant(@PathVariable int id){
//        londonRestaurants.deleteRestaurantByid();
//        return "Restaurant" + id + "has been deleted";
//    }

//    @PostMapping("restaurant/")




}

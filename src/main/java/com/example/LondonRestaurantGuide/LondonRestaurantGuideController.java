package com.example.LondonRestaurantGuide;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins  =  "http://localhost:3000")
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

    @GetMapping("/restaurant/{id}")
    public LondonRestaurantGuide getRestaurantByid(@PathVariable String id){
       return repository.findRestaurantByid(Integer.parseInt(id));
    }

    @PostMapping("/restaurant")
    public String createRestaurant(@RequestBody LondonRestaurantGuide restaurant){
        repository.save(restaurant);
        londonRestaurants.add(restaurant);
        return "Restaurant " + restaurant.getName() + " has been added";
    }

    @DeleteMapping("restaurant/{id}")
    @Transactional
    public String deleteRestaurant(@PathVariable String id){
        repository.deleteRestaurantByid(Integer.parseInt(id));
        return "Restaurant" + id + "has been deleted";
    }

    //edit endpoint




}

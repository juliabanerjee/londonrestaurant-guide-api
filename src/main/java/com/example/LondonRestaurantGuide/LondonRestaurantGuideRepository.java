package com.example.LondonRestaurantGuide;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LondonRestaurantGuideRepository extends JpaRepository<LondonRestaurantGuide, String>
{
    //where we write custom methods
//    LondonRestaurantGuide findRestaurantByid(int id);

}

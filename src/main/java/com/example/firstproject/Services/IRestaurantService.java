package com.example.firstproject.Services;

import com.example.firstproject.Entities.Restaurant;

import java.util.List;
import java.util.Optional;

public interface IRestaurantService {
    List<Restaurant> retrieveAllRestaurants();
    Restaurant addRestaurant(Restaurant c);
    Restaurant updateRestaurant(Restaurant c);
    Optional<Restaurant> retrieveRestaurant(Long idRestau);
    void removeRestaurant(Long idRestau);
    List<Restaurant> addRestaurants(List<Restaurant> Restaurants);
}

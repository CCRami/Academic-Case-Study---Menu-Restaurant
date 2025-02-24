package com.example.firstproject.Services;

import com.example.firstproject.Entities.Restaurant;
import com.example.firstproject.Repositories.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RestaurantService implements IRestaurantService{
    private RestaurantRepository restaurantRepository;

    @Override
    public List<Restaurant> retrieveAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant addRestaurant(Restaurant e) {
        return restaurantRepository.save(e);
    }

    @Override
    public Restaurant updateRestaurant(Restaurant e) {
        return restaurantRepository.save(e);
    }

    @Override
    public Optional<Restaurant> retrieveRestaurant(Long idRestaurant) {
        return restaurantRepository.findById(idRestaurant);
    }

    @Override
    public void removeRestaurant(Long idRestaurant) {
        restaurantRepository.deleteById(idRestaurant);
    }

    @Override
    public List<Restaurant> addRestaurants(List<Restaurant> Restaurants) {
        return restaurantRepository.saveAll(Restaurants);
    }
}

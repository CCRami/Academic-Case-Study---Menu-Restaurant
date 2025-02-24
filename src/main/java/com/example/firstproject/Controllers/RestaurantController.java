package com.example.firstproject.Controllers;

import com.example.firstproject.Services.IRestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class RestaurantController {
    IRestaurantService restaurantService;
}

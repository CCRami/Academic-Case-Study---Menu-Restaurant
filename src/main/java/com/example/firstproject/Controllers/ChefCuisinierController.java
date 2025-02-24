package com.example.firstproject.Controllers;

import com.example.firstproject.Repositories.ChefCuisinierRepository;
import com.example.firstproject.Services.ChefCuisinierService;
import com.example.firstproject.Services.IChefCuisinier;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ChefCuisinierController {
    IChefCuisinier chefCuisinierService;
}

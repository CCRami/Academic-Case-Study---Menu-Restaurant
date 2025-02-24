package com.example.firstproject.Controllers;

import com.example.firstproject.Services.ComposantService;
import com.example.firstproject.Services.IComposantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ComposantController {
    IComposantService composantService;
}

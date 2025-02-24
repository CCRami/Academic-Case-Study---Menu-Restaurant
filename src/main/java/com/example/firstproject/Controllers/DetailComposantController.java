package com.example.firstproject.Controllers;

import com.example.firstproject.Services.IDetailComposantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class DetailComposantController {
    IDetailComposantService detailComposantService;
}

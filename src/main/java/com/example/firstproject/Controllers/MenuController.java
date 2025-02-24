package com.example.firstproject.Controllers;

import com.example.firstproject.Services.IMenuService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class MenuController {
    IMenuService menuService;
}

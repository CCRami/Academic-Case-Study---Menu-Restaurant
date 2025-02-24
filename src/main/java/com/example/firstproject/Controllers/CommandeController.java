package com.example.firstproject.Controllers;

import com.example.firstproject.Services.CommandeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class CommandeController {
    CommandeService commandeService;
}

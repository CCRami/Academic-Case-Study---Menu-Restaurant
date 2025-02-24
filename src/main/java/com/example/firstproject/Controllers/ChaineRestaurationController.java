package com.example.firstproject.Controllers;

import com.example.firstproject.Services.ChaineRestaurationService;
import com.example.firstproject.Services.IChaineRestaurationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ChaineRestaurationController {
    IChaineRestaurationService chaineRestaurationService;
}

package com.example.firstproject.Controllers;

import com.example.firstproject.Services.ClientService;
import com.example.firstproject.Services.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ClientController {
    IClientService clientService;
}

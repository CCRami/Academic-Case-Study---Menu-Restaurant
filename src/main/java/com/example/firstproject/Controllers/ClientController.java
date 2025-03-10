    package com.example.firstproject.Controllers;

    import com.example.firstproject.Entities.Client;
    import com.example.firstproject.Services.ClientService;
    import com.example.firstproject.Services.IClientService;
    import lombok.AllArgsConstructor;
    import org.springframework.http.ResponseEntity;
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @AllArgsConstructor
    @RequestMapping("/client")
    public class ClientController {
        IClientService clientService;
        @GetMapping("/retrieve-all-clients")
        public ResponseEntity<List<Client>> getAllClients() {
            List<Client> clients = clientService.retrieveAllClients();
            System.out.println(clients);
            return ResponseEntity.ok(clients);
        }
        @PostMapping("/add-client")
        public void addClient(@RequestBody Client c){
            System.out.println("Received Client: " + c.getIdentifiant());
            clientService.addClient(c);
        }
    }

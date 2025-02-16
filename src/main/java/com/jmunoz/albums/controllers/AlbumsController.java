package com.jmunoz.albums.controllers;

import com.jmunoz.albums.model.Player;
import com.jmunoz.albums.webclient.FootballClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumsController {

    // Inyectamos la interface de cliente Feign en mi componente Spring
    // y lo usamos para hacer peticiones HTTP.
    private final FootballClient footballClient;

    public AlbumsController(FootballClient footballClient) {
        this.footballClient = footballClient;
    }

    @GetMapping("/players")
    public List<Player> getPlayers() {
        return footballClient.getPlayers();
    }
}

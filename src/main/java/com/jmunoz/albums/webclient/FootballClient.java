package com.jmunoz.albums.webclient;

import com.jmunoz.albums.model.Player;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

// Se crea un cliente Feign definiendo una interface que especifica las
// peticiones HTTP que queremos hacer a un servicio en particular.
@FeignClient(name = "football", url = "http://localhost:8080")
public interface FootballClient {

    // Se usan las mismas anotaciones que en aplicaciones del lado del servidor.
    @RequestMapping(method = RequestMethod.GET, value = "/players")
    List<Player> getPlayers();
}

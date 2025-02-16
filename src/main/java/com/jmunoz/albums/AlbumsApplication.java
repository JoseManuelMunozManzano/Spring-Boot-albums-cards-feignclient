package com.jmunoz.albums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// Usando la anotación @EnableFeignClients, se escanea la aplicación
// buscando interfaces con la anotación @FeignClient y genera el cliente.
@EnableFeignClients
@SpringBootApplication
public class AlbumsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbumsApplication.class, args);
	}

}

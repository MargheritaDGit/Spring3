/*scrivi una applicazione web Spring Boot con:
		NameController dove si mappa il parametro name per:
		restituire il nome alla chiamata GET
		restuiture il nome al contrario
		(es. da John a nhoJ, usando StringBuilder) alla chiamata POST
		testare le chiamate del API endpoint usando Postman*/


package com.example.Es3Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Es3SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Es3SpringApplication.class, args);
	}

}

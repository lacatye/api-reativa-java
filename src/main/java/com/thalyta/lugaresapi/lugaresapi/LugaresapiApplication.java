package com.thalyta.lugaresapi.lugaresapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.thalyta.lugares.config", "com.thalyta.lugares.api", "com.thalyta.lugares.domain", "com.thalyta.lugares.lugaresapi"})
public class LugaresapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LugaresapiApplication.class, args);
	}

}

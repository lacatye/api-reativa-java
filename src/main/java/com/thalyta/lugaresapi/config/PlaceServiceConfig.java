package com.thalyta.lugaresapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

import com.thalyta.lugaresapi.domain.PlaceRepository;
import com.thalyta.lugaresapi.domain.PlaceService;

@Configuration
@EnableR2dbcAuditing
public class PlaceServiceConfig {
	
  @Bean
  PlaceService placeService(PlaceRepository placeRepository) {
    return new PlaceService(placeRepository);
  }
}
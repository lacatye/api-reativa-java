package com.thalyta.lugaresapi.lugaresapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thalyta.lugaresapi.api.PlaceRequest;
import com.thalyta.lugaresapi.api.PlaceResponse;
import com.thalyta.lugaresapi.domain.PlaceService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/places")
public class PlaceController {
	
	PlaceService placeService;
	public PlaceController(PlaceService placeService) {
		this.placeService = placeService;
	}

	@PostMapping
	public ResponseEntity<Mono<PlaceResponse>> create (@RequestBody PlaceRequest request) {
		var createdPlace = placeService.create();
		return ResponseEntity.status(HttpStatus.CREATED).body();
	}
}

package com.thalyta.lugaresapi.lugaresapi;

import com.thalyta.lugaresapi.api.PlaceResponse;
import com.thalyta.lugaresapi.domain.Place;

public class PlaceMapper {
	public static PlaceResponse toResponse(Place place) {
		return new PlaceResponse(place.name(), place.slug(), place.state(), place.city(), place.createdAt(), place.updatedAt());
	}
}

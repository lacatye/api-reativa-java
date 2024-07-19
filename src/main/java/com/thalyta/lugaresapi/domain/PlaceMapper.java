package com.thalyta.lugaresapi.domain;

import org.springframework.util.StringUtils;

import com.thalyta.lugaresapi.api.PlaceRequest;
import com.thalyta.lugaresapi.api.PlaceResponse;



public class PlaceMapper {
  public static Place updatePlaceFromDTO(PlaceRequest placeRequest, Place place) {
    final String name = StringUtils.hasText(placeRequest.name()) ? placeRequest.name() : place.name();
    final String state = StringUtils.hasText(placeRequest.state()) ? placeRequest.state() : place.state();
    final String city = StringUtils.hasText(placeRequest.city()) ? placeRequest.city() : place.city();

    return new Place(place.id(), name, place.slug(), state, city, place.createdAt(), place.updatedAt());
  }

  public static PlaceResponse toResponse(Place place) {
    return new PlaceResponse(place.name(), place.slug(),
        place.city(), place.state(), place.createdAt(), place.updatedAt());
  }
}

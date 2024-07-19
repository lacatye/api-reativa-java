package com.thalyta.lugaresapi.lugaresapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.thalyta.lugaresapi.api.PlaceRequest;
import com.thalyta.lugaresapi.domain.PlaceRepository;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PlaceServiceTests {
    
  @Autowired
  WebTestClient webTestClient;
  
  @Autowired
  PlaceRepository placeRepository;

  @Test
  public void testCreatePlaceSuccess() {
    final String name = "Valid Name";
    final String city = "Valid City";
    final String state = "Valid State";
    final String slug = "valid-name";

    webTestClient
        .post()
        .uri("/places")
        .bodyValue(
            new PlaceRequest(name, city, state))
        .exchange()
        .expectStatus().isCreated()
        .expectBody()
        .jsonPath("name").isEqualTo(name)
        .jsonPath("state").isEqualTo(state)
        .jsonPath("city").isEqualTo(city)
        .jsonPath("slug").isEqualTo(slug)
        .jsonPath("createdAt").isNotEmpty()
        .jsonPath("updatedAt").isNotEmpty();
  }

  @Test
  public void testCreatePlaceFailure() {
    final String name = "";
    final String state = "";
    final String city = "";

    webTestClient
        .post()
        .uri("/places")
        .bodyValue(
            new PlaceRequest(name, city, state))
        .exchange()
        .expectStatus().isBadRequest();
  }
}
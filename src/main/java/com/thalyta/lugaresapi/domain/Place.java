package com.thalyta.lugaresapi.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

public record Place(Long id, String name, String slug, String state, String city, @CreatedDate LocalDateTime createdAt, @LastModifiedDate LocalDateTime updatedAt) {

}

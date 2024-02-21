package com.stacktips.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies")
public record Movie(
        @Id
        String id,
        String title,
        String headline,
        String thumbnail,
        String language,
        String region,
        List<String> actors,
        List<String> genres) {
}
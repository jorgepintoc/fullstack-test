package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DogDto {
    @JsonProperty("message")
    private String dogImageUrl;
    private String status;
}



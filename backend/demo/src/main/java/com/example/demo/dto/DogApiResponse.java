package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DogApiResponse {
  @JsonProperty("message")
  private String message;
  private String status;
}

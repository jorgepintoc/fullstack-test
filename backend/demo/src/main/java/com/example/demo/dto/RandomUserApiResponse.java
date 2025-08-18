package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomUserApiResponse {
  private List<UserWrapper> results;

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class UserWrapper {
    private Name name;
    private String email;
    private Login login;
    private Picture picture;
  }

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Name {
    private String first;
    private String last;
    private String title;
  }

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Login {
    private String uuid;
  }

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Picture {
    private String large;
  }
}

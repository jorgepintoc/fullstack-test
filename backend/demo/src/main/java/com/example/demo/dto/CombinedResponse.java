package com.example.demo.dto;

import com.example.demo.model.AppUser;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CombinedResponse {
  private AppUser user;
  private String dogImageUrl;
}

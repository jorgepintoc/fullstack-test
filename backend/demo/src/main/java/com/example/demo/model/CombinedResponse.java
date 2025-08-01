package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CombinedResponse {
    private User user;
    private String dogImageUrl;
}



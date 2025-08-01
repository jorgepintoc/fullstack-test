package com.example.demo.model;

import lombok.Data;

@Data
public class SimpleUserDto {
    private String uuid;
    private String fullName;
    private String email;
    private String pictureUrl;
}

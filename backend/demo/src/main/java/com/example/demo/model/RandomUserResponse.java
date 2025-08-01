package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomUserResponse {
    private List<Result> results;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {
        private Name name;
        private String email;
        private Login login;
        private Picture picture;

        public SimpleUserDto toDto() {
            SimpleUserDto dto = new SimpleUserDto();
            dto.setUuid(login.getUuid());
            dto.setFullName(name.getFirst() + " " + name.getLast());
            dto.setEmail(email);
            dto.setPictureUrl(picture.getLarge());
            return dto;
        }
    }

    @Data
    public static class Name {
        private String first;
        private String last;
    }

    @Data
    public static class Login {
        private String uuid;
    }

    @Data
    public static class Picture {
        private String large;
    }
}

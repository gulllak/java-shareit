package ru.practicum.server.user.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseUserDto {
    private long id;
    private String name;
    private String email;
}

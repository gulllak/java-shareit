package ru.practicum.shareit.item.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseItemDto {
    private Long id;
    private String name;
    private String description;
    private Boolean available;
}

package ru.practicum.shareit.item.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import ru.practicum.shareit.item.dto.RequestCommentDto;
import ru.practicum.shareit.item.dto.ResponseCommentDto;
import ru.practicum.shareit.item.model.Comment;
import ru.practicum.shareit.item.entity.CommentEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CommentMapper {
    @Mapping(target = "item.id", source = "itemId")
    @Mapping(target = "author.id", source = "userId")
    @Mapping(target = "created", expression = "java(LocalDateTime.now())")
    Comment toComment(RequestCommentDto requestCommentDto, Long itemId, Long userId);

    @Mapping(target = "authorName", source = "comment.author.name")
    ResponseCommentDto toResponseComment(Comment comment);

    Comment toComment(CommentEntity commentEntity);

    CommentEntity toCommentEntity(Comment comment);
}
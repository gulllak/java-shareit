package ru.practicum.shareit.user.service;

import ru.practicum.shareit.user.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User create(User user);

    User update(User user);

    User getById(long id);

    void delete(long id);
}

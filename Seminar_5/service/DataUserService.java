package Seminar_5.service;

import java.util.List;

import Seminar_5.dto.User;

public interface DataUserService<E extends User> {
    void write(E user);

    List<E> read(String path);

    void saveUser(E user);

    void deleteUser(E user);
}

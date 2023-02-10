package Seminar_5.service;

import Seminar_5.dto.User;

public interface DataService {
    void create(User user);

    User read(User user);
}

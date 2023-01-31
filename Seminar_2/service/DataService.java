package Seminar_2.service;

import Seminar_2.data.User;

public interface DataService {
    void create(User user);

    User read(User user);
}

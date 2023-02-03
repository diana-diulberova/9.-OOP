package Seminar_3.service;

import Seminar_3.data.User;

public interface DataService {
    void create(User user);

    User read(User user);
}

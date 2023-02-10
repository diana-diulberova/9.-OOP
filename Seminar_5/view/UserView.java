package Seminar_5.view;

import java.util.List;

import Seminar_5.dto.User;

public abstract class UserView {
    public void showTheBest(List<User> userList) {
        User user = findTheBest(userList);
        System.out.println(user);
    }

    protected abstract User findTheBest(List<User> userList);
}

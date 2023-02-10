package Seminar_5.view;

import java.util.List;

import Seminar_5.dto.User;

public class TeacherView extends UserView {
    
    @Override
    protected User findTheBest(List<User> userList) {
        // логика для преподавателей
        return null;
    }
}
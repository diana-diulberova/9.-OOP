package Seminar_5.data;

import java.util.List;

public abstract class User implements List<User> {
    private String fio;
    private int age;
    private int passport;
    
    public User(String fio) {
        this.fio = fio;
        }


    public User(String fio, int age, int passport) {
        this.fio = fio;
        this.age = age;
        this.passport = passport;

    }
   

}
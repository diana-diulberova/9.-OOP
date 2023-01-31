package Seminar_2.data;

public abstract class User {

    public User(String fio, int age, int passport) {
        this.fio = fio;
        this.age = age;
        this.passport = passport;
    }
   
    private String fio;
    private int age;
    private int passport;

}
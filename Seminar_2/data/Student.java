package Seminar_2.data;

import Seminar_2.service.DataService;

public class Student extends User {
    private int groupNumber;

    public Student(String fio, int age, int passport, int groupNumber) {
        super(fio, age, passport);
        this.groupNumber = groupNumber;
    }


}

package Seminar_2.service;

import Seminar_2.data.StudentGroup;

public interface StudentGroupInterface {

    StudentGroup writer(StudentGroup studentGroup);

    StudentGroup read(StudentGroup studentGroup);
    StudentGroup getGroup();
    StudentGroup getGroup(int number);
}
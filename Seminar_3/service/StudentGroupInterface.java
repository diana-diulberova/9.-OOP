package Seminar_3.service;

import Seminar_3.data.StudentGroup;

public interface StudentGroupInterface {

    StudentGroup writer(StudentGroup studentGroup);

    StudentGroup read(StudentGroup studentGroup);
    StudentGroup getGroup();
    StudentGroup getGroup(int number);
}
package Seminar_5.service;

import Seminar_5.dto.StudentGroup;

public interface StudentGroupInterface {

    StudentGroup writer(StudentGroup studentGroup);

    StudentGroup read(StudentGroup studentGroup);
    StudentGroup getGroup();
    StudentGroup getGroup(int number);
}
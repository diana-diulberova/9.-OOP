package Seminar_2.controller;

import Seminar_2.data.Student;
import Seminar_2.data.StudentGroup;
import Seminar_2.service.DataService;
import Seminar_2.service.StudentServiceImpl;

public class Controller {
    private DataService studentService;

    public Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }
    public Student createStudent(Student student) {
        studentService.create(student);
        return (Student) studentService.read(student);
    }

    public StudentGroup createGroup(int groupNumber){
        return StudentGroup.getGroup(groupNumber);

    }
}
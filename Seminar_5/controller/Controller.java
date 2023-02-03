package Seminar_5.controller;

import Seminar_5.data.Student;
import Seminar_5.data.StudentGroup;
import Seminar_5.service.DataService;
import Seminar_5.service.StudentServiceImpl;

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
package Seminar_5.terminal;

import Seminar_5.data.Student;
import Seminar_5.service.StudentService;

public class CreateStudentExecutable implements CommandExecutable {

    private StudentService studentService;
    private Student student;

    public CreateStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.createStudent(student);

    }

}

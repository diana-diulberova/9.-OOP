package Seminar_5.terminal.executable;

import Seminar_5.dto.Student;
import Seminar_5.service.StudentService;

public class CreateStudentExecutable implements CommandExecutable {
    private StudentService studentService;
    private Student student;

    public CreateStudentExecutable(StudentService studentService, Student student) {
        this.student = student;
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        studentService.saveUser(student);
    }
}

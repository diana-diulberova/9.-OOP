package Seminar_5.terminal.executable;

import Seminar_5.data.Student;
import Seminar_5.service.StudentService;
import Seminar_5.service.StudentServiceImpl;

public class DeleteStudentExecutable implements CommandExecutable {

    private StudentService studentService;

    private Student student;

    
    public DeleteStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.deleteStudent(student);
    }
}
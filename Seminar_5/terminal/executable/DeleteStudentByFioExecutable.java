package Seminar_5.terminal.executable;

import Seminar_5.dto.Student;
import Seminar_5.service.StudentService;

public class DeleteStudentByFioExecutable implements CommandExecutable {
    private StudentService studentService;
    private String fio;

    public DeleteStudentByFioExecutable(StudentService studentService, String fio) {
        this.fio = fio;
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        studentService.deleteStudentByFio(fio);
    }
}
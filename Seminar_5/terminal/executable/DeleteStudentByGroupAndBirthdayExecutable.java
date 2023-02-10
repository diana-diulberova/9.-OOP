package Seminar_5.terminal.executable;

import Seminar_5.dto.Student;
import Seminar_5.service.StudentService;

public class DeleteStudentByGroupAndBirthdayExecutable implements CommandExecutable {
    private StudentService studentService;
    private int groupNumber;
    private int birthday;

    public DeleteStudentByGroupAndBirthdayExecutable(StudentService studentService, int groupNumber, int birthday) {
        this.groupNumber = groupNumber;
        this.birthday = birthday;
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        studentService.deleteStudentByGroupAndBirthday(groupNumber, birthday);
    }

}
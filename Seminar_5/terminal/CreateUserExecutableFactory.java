package Seminar_5.terminal;

import Seminar_5.data.Student;
import Seminar_5.data.User;
import Seminar_5.service.StudentService;

public class CreateUserExecutableFactory implements CommandUserExecutableFactory{
    private final StudentService studentService;

    public CreateUserExecutableFactory(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public CommandExecutable createCommandExecutable(User user) {
        if (user instanceof Student){
            return new CreateStudentExecutable(studentService, (Student) user);
        } return new NoneCommandExecutable();
    }

    @Override
    public CommandExecutable createCommandExecutable(User user) {
        // TODO Auto-generated method stub
        return null;
    }
}
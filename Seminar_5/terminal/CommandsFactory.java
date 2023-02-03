package Seminar_5.terminal;

import Seminar_5.service.StudentService;

public class CommandsFactory {
    private final StudentService studentService;
    public CommandsFactory(StudentService studentService) {
        this.studentService = studentService;
    }
    public CommandUserExecutableFactory createCommandFactory(Command command){
        if(command.isAddCommand()){
            return new CreateUserExecutableFactory(studentService);
        } else if (command.isDeleteCommand()){
            return new DeleteUserExecutableFactory(studentService);
        } else return new NoneCommandUserExecutableFactory();
    }
}
package Seminar_5.terminal.executable;

import Seminar_5.service.StudentService;
import Seminar_5.terminal.Command;

public class CommandsFactory {
    private final StudentService studentService;
    public CommandsFactory(StudentService studentService) {
        this.studentService = studentService;
    }
    public CommandUserExecutableFactory createCommandFactory(Command command){
        if(command.isCreateCommand()){
            return new CreateUserExecutableFactory(studentService);
        } else if (command.isDeleteCommand()){
            return new DeleteUserExecutableFactory(studentService);
        } else return new NoneCommandUserExecutableFactory();
    }
}
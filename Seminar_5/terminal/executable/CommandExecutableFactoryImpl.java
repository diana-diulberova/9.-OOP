package Seminar_5.terminal.executable;

import Seminar_5.dto.Student;
import Seminar_5.repository.StudentRepository;
import Seminar_5.service.StudentService;
import Seminar_5.terminal.Command;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
     
    @Override
    public CommandExecutable create(Command command) {
        Student student = new StudentFormer(command.getMainFirstCommand()).createStudent();
        if (command.isAddCommand() && student != null) {
            return new CreateStudentExecutable(new StudentService(new StudentRepository()), student);
        }else if (command.isDeleteCommand(new StudentService(new StudentRepository()), student);
    }

    @Override
    public CommandExecutable command(Command parseCommand) {
        // TODO Auto-generated method stub
        return null;
    } else return new NoneCommandUserExecutableFactory();
}
}

package Seminar_5.terminal.executable;

import Seminar_5.data.Student;
import Seminar_5.repository.StudentRepository;
import Seminar_5.service.StudentService;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
     
    @Override
    public CommandExecutableFactory create(Command command) {
        Studant student = new StudentFormer(command.getMainFirstCommand()).createStudent();
        if (command.isAddCommand() && student != null) {
            return new CreateStudentExecutable(new StudentService(new StudentRepository()), student);
        }else if (command.isDeleteCommand(new StudentService(new StudentRepository()), student);
    } else return new NoneCommandUserExecutableFactory();
}
}

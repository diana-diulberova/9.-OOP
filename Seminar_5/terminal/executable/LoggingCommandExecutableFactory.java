package Seminar_5.terminal.executable;

import java.sql.ResultSetMetaData;

import javax.naming.spi.DirStateFactory.Result;

import Seminar_5.terminal.Command;

public class LoggingCommandExecutableFactory extends CommandExecutableFactoryImpl {
    public LoggingCommandExecutableFactory(){
        
    @Override
    public CommandExecutable create(Command command) {
        System.out.println(command);
        CommandExecutable commandExecutable = super.create(command);
        System.out.printf("Ok");

        ResultDisplayedFactory resultDisplayedFactory = new ResultDisplayedFactory();
        ResultDisplayed resultDisplayed = ResultDisplayedFactory.create(command.getMainFirstCommand, commandExecutable);
        resultDisplayed.desplay();

        return commandExecutable;
    }

}
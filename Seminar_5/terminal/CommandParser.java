package Seminar_5.terminal;

public interface CommandParser<E> {
    Command parseCommand(E inputCommand);
}

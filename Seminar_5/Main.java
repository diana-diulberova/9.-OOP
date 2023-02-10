package Seminar_5;

import Seminar_5.terminal.CommandParserImpl;
import Seminar_5.terminal.TerminalReader;
import Seminar_5.terminal.executable.CommandExecutableFactoryImpl;

public abstract class Main {
    public static void main(String[] args) {
        TerminalReader
                .getInstance(new CommandParserImpl(),
                        new CommandExecutableFactoryImpl())
                .runReader();
    }
}

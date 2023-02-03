package Seminar_5.terminal;

import Seminar_5.data.User;

public interface CommandUserExecutableFactory  {
    CommandExecutable createCommandExecutable(User user);
}

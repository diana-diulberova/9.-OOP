package Seminar_5.terminal.executable;

import Seminar_5.dto.User;

public interface CommandUserExecutableFactory  {
    CommandExecutable createCommandExecutable(User user);
}

package Seminar_5.service;

import Seminar_5.dto.User;
import Seminar_5.util.ReaderFromTxt;
import Seminar_5.util.WriterToTxt;

public class StudentServiceImpl implements DataService {

    @Override
    public void create(User user) {
        WriterToTxt.write(user);
        
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
        
    }
    
}

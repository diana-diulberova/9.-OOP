package Seminar_2.service;

import Seminar_2.data.User;
import Seminar_2.util.ReaderFromTxt;
import Seminar_2.util.WriterToTxt;

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

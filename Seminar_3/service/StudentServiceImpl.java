package Seminar_3.service;

import Seminar_3.data.User;
import Seminar_3.util.ReaderFromTxt;
import Seminar_3.util.WriterToTxt;

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

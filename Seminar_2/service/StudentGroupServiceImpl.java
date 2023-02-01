package Seminar_2.service;

import java.util.List;

import Seminar_2.data.Student;
import Seminar_2.data.StudentGroup;
import Seminar_2.data.Teacher;
import Seminar_2.data.User;
import Seminar_2.util.ReadFromTxt;

public class StudentGroupServiceImpl implements DataService {

    @Override
    public void create(User user) {
               
    }

    @Override
    public User read(User user) {
        return null;
    }
    
    public StudentGroup getGroup() {
        return new StudentGroup(getTeacherFromTxt(), getStudentsFromTxt());
    }

    private List<Student> getStudentsFromTxt() {
        return null;
    }

    private Teacher getTeacherFromTxt() {
        return null;
    }

    public StudentGroup createGroup(int groupNumber) {
        final Teacher teacher = ReadFromTxt.readTeacher(groupNumber);
        List<Student> students = ReadFromTxt.readStudents(groupNumber);
        return new StudentGroup(teacher, students);
    }
}
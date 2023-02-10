package Seminar_5.service;

import java.util.List;

import Seminar_5.dto.Student;
import Seminar_5.dto.StudentGroup;
import Seminar_5.dto.Teacher;
import Seminar_5.dto.User;
import Seminar_5.util.ReadFromTxt;

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
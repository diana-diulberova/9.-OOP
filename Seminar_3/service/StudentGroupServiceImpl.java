package Seminar_3.service;

import java.util.Iterator;
import java.util.List;

import Seminar_3.data.Student;
import Seminar_3.data.StudentGroup;
import Seminar_3.data.Teacher;
import Seminar_3.data.User;
import Seminar_3.util.ReadFromTxt;

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
    // @Override
    public void remove(Student fio) {
        Iterator<Student> studentGroup = getGroup().iterator();
        while (studentGroup.hasNext()){
            Student student = studentGroup.next();
            if(fio.equals(student.getFio())) {
                studentGroup.remove();
            }
        }
    }
}
package Seminar_3.data;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private Teacher teacher;
    private List<Student> studentList;
    private int groupNumber;
    
    public StudentGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public StudentGroup(Teacher teacher, List<Student> studentList, int groupNumber) {

        this.teacher = teacher;
        this.studentList = studentList;
        this.groupNumber = groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public static StudentGroup getGroup(int groupNumber) {
        return null;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}

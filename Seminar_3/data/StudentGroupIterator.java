package Seminar_3.data;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private StudentGroup studentGroup;
    // private Iterator<Student> students;
    private List<Student> students;
    private int cursor;

    public StudentGroupIterator(StudentGroup studentGroup) {
    //    this.studentGroup = studentGroup;
    //    this.students = studentGroup.getStudentList().iterator();
    }

    @Override
    public boolean hasNext() {
        return this.studentGroup.getStudentList().iterator().hasNext();
    }

    @Override
    public Student next() {
        return students.get(cursor);
    }

}

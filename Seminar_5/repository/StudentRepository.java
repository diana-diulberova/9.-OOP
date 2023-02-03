package Seminar_5.repository;

import java.util.List;

import Seminar_5.data.Student;
import Seminar_5.db.StudentTable;

public class StudentRepository implements Repository<Student> {

    private final StudentTable studentTable;

    public StudentRepository() {
        this.studentTable = new StudentTable();
    }

    @Override
    public void delete(Student entity) {
        studentTable.removeByName((String) entity.getFio());

    }

    @Override
    public void save(Student entity) {
        studentTable.save(entity);

    }

    public List<Student> getUsersList() {
        return studentTable.getElements();
    }

}

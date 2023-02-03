package Seminar_5.data;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import Seminar_5.service.DataService;

public class Student extends User implements Comparable<Student>{
    private int groupNumber;

    public Student(String fio) {
        super(fio);
    }

    public Student(String fio, int age, int passport, int groupNumber) {
        super(fio, age, passport);
        this.groupNumber = groupNumber;
    }

    public Object getFio() {
        return null;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterator<User> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean add(User e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends User> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends User> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User set(int index, User element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(int index, User element) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ListIterator<User> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ListIterator<User> listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<User> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return 0;
    }


}

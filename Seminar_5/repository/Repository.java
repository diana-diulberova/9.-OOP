package Seminar_5.repository;

public interface Repository<E> {
    void save(E entity);

    void delete(E entity);

}
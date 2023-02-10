package Seminar_5.repository;

import Seminar_5.dto.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    public abstract E findByFio(String fio);
}

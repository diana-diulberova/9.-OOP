package Seminar_5.controller;

public interface InterfaceController<E, I> {
    E save(E entity);

    E find(I id);
}

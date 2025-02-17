package huy.module4finaltest.service;

import java.util.List;
import java.util.Optional;

public interface IGenericService<T> {
    List<T> findAll();
    Optional<T> findById(Long id);
    void save(T t);
    void delete(T t);
}

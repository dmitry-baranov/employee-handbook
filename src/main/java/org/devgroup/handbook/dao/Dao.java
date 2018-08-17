package org.devgroup.handbook.dao;

import java.util.List;

public interface Dao <K, E>{

    public K create(E entity);

    public E findById(K id);

    public void update(E entity);

    public void delete(E entity);

    public List<E> getAll();
}

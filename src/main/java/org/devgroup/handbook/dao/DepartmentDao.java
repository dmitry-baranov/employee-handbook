package org.devgroup.handbook.dao;

import org.devgroup.handbook.entity.Department;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class DepartmentDao implements Dao<Long, Department> {

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public Long create(Department entity) {
        return null;
    }

    @Override
    public Department findById(Long id) {
        return null;
    }

    @Override
    public void update(Department entity) {

    }

    @Override
    public void delete(Department entity) {

    }

    @Override
    public List<Department> getAll() {
        return null;
    }
}

package dao;

import models.Department;

import java.util.List;

public interface DepartmentDao {
    void add(Department department);

    List<Department> getAll();

    Department findById(int id);

    void deleteById(int id);
    void clearAll();
}

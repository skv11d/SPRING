package hrm.persistence.dao.services.interfaces;

import hrm.persistence.models.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    List<Department> findAll();
    Department addDepartment(Department department);
    void removeByID(int id);
    void removeByName(String name);
    void listAllDepartment();
    List<Department> findDepartmentByName(String name);
    List<Department> findDepartmentByID(int id);
}

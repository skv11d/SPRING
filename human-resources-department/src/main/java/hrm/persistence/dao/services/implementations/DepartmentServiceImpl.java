package hrm.persistence.dao.services.implementations;

import com.google.common.collect.Lists;
import hrm.persistence.dao.repositories.DepartmentRepository;
import hrm.persistence.dao.services.interfaces.DepartmentService;
import hrm.persistence.models.Department;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> findAll() {
        return Lists.newArrayList(departmentRepository.findAll());
    }

    @Override
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void removeByID(int id) {
        departmentRepository.deleteById((long) id);
    }
    @Override
    public void removeByName(String name) {
        departmentRepository.delete((Department) departmentRepository.findDepartmentByName(name));
    }

    @Override
    public void listAllDepartment() {

    }

    @Override
    public List<Department> findDepartmentByName(String name) {
        return departmentRepository.findDepartmentByName(name);
    }

    @Override
    public List<Department> findDepartmentByID(int id) {
        return departmentRepository.findDepartmentByID(id);
    }

    @Autowired
    public void setDepartmentRepository(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
}

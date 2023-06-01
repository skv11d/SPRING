package hrm.persistence.dao.repositories;

import hrm.persistence.models.Department;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface DepartmentRepository extends CrudRepository<Department, Long> {

    List<Department> findDepartmentByID(int id);
    List<Department> findDepartmentByName(String name);
}

package hrm.persistence.dao.repositories;

import hrm.persistence.models.EmployeeDepartment;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface EmployeeDepartmentRepository extends CrudRepository<EmployeeDepartment, Long> {

    List<EmployeeDepartment> findEmployeeDepartmentByEmployeeIDAndDepartmentID(int employeeID, int departmentID);
}

package hrm.persistence.dao.repositories;

import hrm.persistence.models.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findEmployeeByID(int id);
    List<Employee> findEmployeeByFullName(String lastName, String firstName, String middleName);
    List<Employee> findEmployeeByPhone(String phone);
}

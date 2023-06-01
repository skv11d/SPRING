package hrm.persistence.dao.repositories;

import hrm.persistence.models.EmployeeDivision;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface EmployeeDivisionRepository extends CrudRepository<EmployeeDivision, Long> {

    List<EmployeeDivision> findEmployeeDivisionByEmployeeIDAndDivisionID(int employeeID, int divisionID);
}

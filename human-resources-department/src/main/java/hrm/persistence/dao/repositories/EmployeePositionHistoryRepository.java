package hrm.persistence.dao.repositories;

import hrm.persistence.models.EmployeePositionHistory;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface EmployeePositionHistoryRepository extends CrudRepository<EmployeePositionHistory, Long> {

    List<EmployeePositionHistory> findEmployeePositionHistoriesByEmployeeIDAndPositionID(int employeeID, int positionID);
}

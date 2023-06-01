package hrm.persistence.dao.services.interfaces;

import hrm.persistence.models.EmployeePositionHistory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeePositionHistoryService {
    List<EmployeePositionHistory> findAll();
    EmployeePositionHistory addEmployeePositionHistory(EmployeePositionHistory employeePositionHistory);
    void removeByEmployeeIDAndPositionID(int employeeID, int positionID);
    void listAllEmployeePositionHistory();
    List<EmployeePositionHistory> findEmployeePositionHistoryByEmployeeIDAndPositionID(int employeeID, int positionID);
}

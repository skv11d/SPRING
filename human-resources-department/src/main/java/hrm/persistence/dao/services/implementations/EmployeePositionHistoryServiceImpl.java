package hrm.persistence.dao.services.implementations;

import com.google.common.collect.Lists;
import hrm.persistence.dao.repositories.EmployeePositionHistoryRepository;
import hrm.persistence.dao.services.interfaces.EmployeePositionHistoryService;
import hrm.persistence.models.EmployeePositionHistory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmployeePositionHistoryServiceImpl implements EmployeePositionHistoryService {
    private EmployeePositionHistoryRepository employeePositionHistoryRepository;

    @Override
    public List<EmployeePositionHistory> findAll() {
        return Lists.newArrayList(employeePositionHistoryRepository.findAll());
    }

    @Override
    public EmployeePositionHistory addEmployeePositionHistory(EmployeePositionHistory employeePositionHistory) {
        return employeePositionHistoryRepository.save(employeePositionHistory);
    }

    @Override
    public void removeByEmployeeIDAndPositionID(int employeeID, int positionID) {
        employeePositionHistoryRepository.delete((EmployeePositionHistory) findEmployeePositionHistoryByEmployeeIDAndPositionID(employeeID, positionID));
    }

    @Override
    public void listAllEmployeePositionHistory() {

    }

    @Override
    public List<EmployeePositionHistory> findEmployeePositionHistoryByEmployeeIDAndPositionID(int employeeID, int positionID) {
        return employeePositionHistoryRepository.findEmployeePositionHistoriesByEmployeeIDAndPositionID(employeeID, positionID);
    }

    @Autowired
    public void setEmployeePositionHistoryRepository(EmployeePositionHistoryRepository employeePositionHistoryRepository){
        this.employeePositionHistoryRepository = employeePositionHistoryRepository;
    }
}

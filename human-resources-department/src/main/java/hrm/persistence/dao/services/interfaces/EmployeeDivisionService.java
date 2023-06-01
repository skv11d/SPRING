package hrm.persistence.dao.services.interfaces;

import hrm.persistence.models.EmployeeDivision;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeDivisionService {
    List<EmployeeDivision> findAll();
    EmployeeDivision addEmployeeDivision(EmployeeDivision employeeDivision);
    void removeByEmployeeIDAndDivisionID(int employeeID, int divisionID);
    void listAllEmployeeIDAndDivision();
    List<EmployeeDivision> findEmployeeDivisionByEmployeeIDAndDivisionID(int employeeID, int divisionID);
}

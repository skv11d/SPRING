package hrm.persistence.dao.services.interfaces;

import hrm.persistence.models.EmployeeDepartment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeDepartmentService {
    List<EmployeeDepartment> findAll();
    EmployeeDepartment addEmployeeDepartment(EmployeeDepartment employeeDepartment);
    void removeByEmployeeIDAndDepartmentID(int employeeID, int departmentID);
    void listAllEmployeeDepartment();
    List<EmployeeDepartment> findEmployeeDepartmentByEmployeeIDAndDepartmentID(int employeeID, int departmentID);
}

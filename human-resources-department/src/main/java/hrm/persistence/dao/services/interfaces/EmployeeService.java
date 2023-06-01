package hrm.persistence.dao.services.interfaces;

import hrm.persistence.models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> findAll();
    Employee addEmployee(Employee employee);
    void removeByID(int id);
    void removeByFullName(String lastName, String firstName, String middleName);
    void listAllEmployee();
    List<Employee> findEmployeeByFullName(String lastName, String firstName, String middleName);
    List<Employee> findEmployeeByID(int id);
    List<Employee> findEmployeeByPhone(String phone);
}

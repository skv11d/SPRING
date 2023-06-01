package hrm.persistence.dao.services.implementations;

import com.google.common.collect.Lists;
import hrm.persistence.dao.repositories.EmployeeRepository;
import hrm.persistence.dao.services.interfaces.EmployeeService;
import hrm.persistence.models.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return Lists.newArrayList(employeeRepository.findAll());
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void removeByID(int id) {
        employeeRepository.deleteById((long) id);
    }

    @Override
    public void removeByFullName(String lastName, String firstName, String middleName) {
        employeeRepository.delete((Employee) employeeRepository.findEmployeeByFullName(lastName, firstName, middleName));
    }

    @Override
    public void listAllEmployee() {

    }

    @Override
    public List<Employee> findEmployeeByFullName(String lastName, String firstName, String middleName) {
        return employeeRepository.findEmployeeByFullName(lastName, firstName, middleName);
    }

    @Override
    public List<Employee> findEmployeeByID(int id) {
        return employeeRepository.findEmployeeByID(id);
    }

    @Override
    public List<Employee> findEmployeeByPhone(String phone) {
        return employeeRepository.findEmployeeByPhone(phone);
    }

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}

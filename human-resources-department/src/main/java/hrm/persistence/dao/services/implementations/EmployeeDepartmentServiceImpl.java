package hrm.persistence.dao.services.implementations;

import com.google.common.collect.Lists;
import hrm.persistence.dao.repositories.EmployeeDepartmentRepository;
import hrm.persistence.dao.services.interfaces.EmployeeDepartmentService;
import hrm.persistence.models.EmployeeDepartment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmployeeDepartmentServiceImpl implements EmployeeDepartmentService {
    private EmployeeDepartmentRepository employeeDepartmentRepository;

    @Override
    public List<EmployeeDepartment> findAll() {
        return Lists.newArrayList(employeeDepartmentRepository.findAll());
    }

    @Override
    public EmployeeDepartment addEmployeeDepartment(EmployeeDepartment employeeDepartment) {
        return employeeDepartmentRepository.save(employeeDepartment);
    }

    @Override
    public void removeByEmployeeIDAndDepartmentID(int employeeID, int departmentID) {
        employeeDepartmentRepository.delete((EmployeeDepartment) employeeDepartmentRepository.findEmployeeDepartmentByEmployeeIDAndDepartmentID(employeeID, departmentID));
    }

    @Override
    public void listAllEmployeeDepartment() {

    }

    @Override
    public List<EmployeeDepartment> findEmployeeDepartmentByEmployeeIDAndDepartmentID(int employeeID, int departmentID) {
        return employeeDepartmentRepository.findEmployeeDepartmentByEmployeeIDAndDepartmentID(employeeID, departmentID);
    }

    @Autowired
    public void setEmployeeDepartmentRepository(EmployeeDepartmentRepository employeeDepartmentRepository) {
        this.employeeDepartmentRepository = employeeDepartmentRepository;
    }
}

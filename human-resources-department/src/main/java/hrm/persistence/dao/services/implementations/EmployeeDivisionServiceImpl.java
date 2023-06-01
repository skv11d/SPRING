package hrm.persistence.dao.services.implementations;

import com.google.common.collect.Lists;
import hrm.persistence.dao.repositories.EmployeeDivisionRepository;
import hrm.persistence.dao.services.interfaces.EmployeeDivisionService;
import hrm.persistence.models.EmployeeDivision;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmployeeDivisionServiceImpl implements EmployeeDivisionService {
    private EmployeeDivisionRepository employeeDivisionRepository;

    @Override
    public List<EmployeeDivision> findAll() {
        return Lists.newArrayList(employeeDivisionRepository.findAll());
    }

    @Override
    public EmployeeDivision addEmployeeDivision(EmployeeDivision employeeDivision) {
        return employeeDivisionRepository.save(employeeDivision);
    }

    @Override
    public void removeByEmployeeIDAndDivisionID(int employeeID, int divisionID) {
        employeeDivisionRepository.delete((EmployeeDivision) employeeDivisionRepository.findEmployeeDivisionByEmployeeIDAndDivisionID(employeeID, divisionID));
    }

    @Override
    public void listAllEmployeeIDAndDivision() {

    }

    @Override
    public List<EmployeeDivision> findEmployeeDivisionByEmployeeIDAndDivisionID(int employeeID, int divisionID) {
        return employeeDivisionRepository.findEmployeeDivisionByEmployeeIDAndDivisionID(employeeID, divisionID);
    }

    @Autowired
    public void setEmployeeDivisionRepository(EmployeeDivisionRepository employeeDivisionRepository) {
        this.employeeDivisionRepository = employeeDivisionRepository;
    }
}

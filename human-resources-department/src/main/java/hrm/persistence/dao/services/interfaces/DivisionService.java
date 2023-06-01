package hrm.persistence.dao.services.interfaces;

import hrm.persistence.models.Division;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DivisionService {
    List<Division> findAll();
    Division addDivision(Division division);
    void removeByID(int id);
    void removeByName(String name);
    void listAllDivision();
    List<Division> findDivisionByName(String name);
    List<Division> findDivisionByID(int id);
}

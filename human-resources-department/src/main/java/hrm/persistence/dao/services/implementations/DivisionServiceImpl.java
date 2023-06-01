package hrm.persistence.dao.services.implementations;

import com.google.common.collect.Lists;
import hrm.persistence.dao.repositories.DivisionRepository;
import hrm.persistence.dao.services.interfaces.DivisionService;
import hrm.persistence.models.Division;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DivisionServiceImpl implements DivisionService {
    private DivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return Lists.newArrayList(divisionRepository.findAll());
    }

    @Override
    public Division addDivision(Division division) {
        return divisionRepository.save(division);
    }

    @Override
    public void removeByID(int id) {
        divisionRepository.deleteById((long) id);
    }

    @Override
    public void removeByName(String name) {
        divisionRepository.delete((Division) divisionRepository.findDivisionByName(name));
    }

    @Override
    public void listAllDivision() {

    }

    @Override
    public List<Division> findDivisionByName(String name) {
        return divisionRepository.findDivisionByName(name);
    }

    @Override
    public List<Division> findDivisionByID(int id) {
        return divisionRepository.findDivisionByID(id);
    }

    @Autowired
    public void setDivisionRepository(DivisionRepository divisionRepository) {
        this.divisionRepository = divisionRepository;
    }
}

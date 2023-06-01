package hrm.persistence.dao.repositories;

import hrm.persistence.models.Department;
import hrm.persistence.models.Division;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface DivisionRepository extends CrudRepository<Division, Long> {

    List<Division> findDivisionByID(int id);
    List<Division> findDivisionByName(String name);
}

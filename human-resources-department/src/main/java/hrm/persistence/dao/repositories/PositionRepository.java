package hrm.persistence.dao.repositories;

import hrm.persistence.models.Position;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface PositionRepository extends CrudRepository<Position, Long> {

    List<Position> findPositionByID(int id);
    List<Position> findPositionByName(String name);
}

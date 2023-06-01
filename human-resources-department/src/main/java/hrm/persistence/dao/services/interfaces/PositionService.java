package hrm.persistence.dao.services.interfaces;

import hrm.persistence.models.Position;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PositionService {
    List<Position> findAll();
    Position addPosition(Position position);
    void removeByID(int id);
    void removeByName(String name);
    void listAllPosition();
    List<Position> findPositionByID(int id);
    List<Position> findPositionByName(String name);
}

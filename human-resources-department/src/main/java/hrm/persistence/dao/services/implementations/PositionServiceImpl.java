package hrm.persistence.dao.services.implementations;

import com.google.common.collect.Lists;
import hrm.persistence.dao.repositories.PositionRepository;
import hrm.persistence.dao.services.interfaces.PositionService;
import hrm.persistence.models.Position;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PositionServiceImpl implements PositionService {
    private PositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return Lists.newArrayList(positionRepository.findAll());
    }

    @Override
    public Position addPosition(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public void removeByID(int id) {
        positionRepository.deleteById((long) id);
    }

    @Override
    public void removeByName(String name) {
        positionRepository.delete((Position) positionRepository.findPositionByName(name));
    }

    @Override
    public void listAllPosition() {

    }

    @Override
    public List<Position> findPositionByID(int id) {
        return positionRepository.findPositionByID(id);
    }

    @Override
    public List<Position> findPositionByName(String name) {
        return positionRepository.findPositionByName(name);
    }

    @Autowired
    public void setPositionRepository(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }
}

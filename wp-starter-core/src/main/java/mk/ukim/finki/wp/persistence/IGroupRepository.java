package mk.ukim.finki.wp.persistence;
import mk.ukim.finki.wp.model.Group;
import java.util.List;
/**
 * Created by Ivona on 13-Dec-16.
 */
public interface GroupRepository {
    List<Group> findAll();
    Group findById(Long id);
    void save(Group entity);
    void update(Long id, Group entity);
    void delete(Long id);
}

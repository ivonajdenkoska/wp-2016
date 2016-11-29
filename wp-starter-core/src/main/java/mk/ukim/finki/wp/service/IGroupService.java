package mk.ukim.finki.wp.service;

import mk.ukim.finki.wp.model.Group;

import java.util.List;

public interface IGroupService {
    List<Group> findAll();
    Group findById(Long id);
    void save(Group entity);
    void update(Long id, Group entity);
    void delete(Long id);
}
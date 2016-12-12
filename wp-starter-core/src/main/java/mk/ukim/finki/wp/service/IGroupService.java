package mk.ukim.finki.wp.service;

import mk.ukim.finki.wp.model.Group;

import java.util.List;

public interface IGroupService {
    List<Group> findAll();
    Group findById(Integer id);
    Group save(Group entity);
    void update(Integer id, Group entity);
    void delete(Integer id);
}
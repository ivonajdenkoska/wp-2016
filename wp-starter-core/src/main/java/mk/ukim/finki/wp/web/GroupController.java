package mk.ukim.finki.wp.web;

import mk.ukim.finki.wp.model.Group;
import mk.ukim.finki.wp.service.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/groups", produces = "application/json")
public class GroupController {

    @Autowired
    private IGroupService groupService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Group> findAll(){
        List<Group> res = groupService.findAll();
        return res;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Group findById(@PathVariable Integer id){
        return groupService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Group save(@RequestBody Group group){
        return groupService.save(group);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void update(@PathVariable Integer id, @RequestBody Group group){
        groupService.update(id, group);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable Integer id){
        groupService.delete(id);
    }


}
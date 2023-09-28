package backend.truetrip.controllers;

import backend.truetrip.dtos.FriendDTO;
import backend.truetrip.entities.Friend;
import backend.truetrip.services.FriendService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/friends")
public class FriendController {
    @Autowired
    private FriendService fS;

    @PostMapping
    public void insert(@RequestBody FriendDTO dto){
        ModelMapper m = new ModelMapper();
        Friend f = m.map(dto, Friend.class);
        fS.insert(f);
    }

    @GetMapping
    public List<FriendDTO> list(){
        return fS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, FriendDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        fS.delete(id);
    }

    @GetMapping("/{id}")
    public FriendDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        FriendDTO dto = m.map(fS.listId(id),FriendDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody FriendDTO dto){
        ModelMapper m = new ModelMapper();
        Friend f = m.map(dto, Friend.class);
        fS.insert(f);
    }
}

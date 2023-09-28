package backend.truetrip.controllers;

import backend.truetrip.dtos.ChatDTO;
import backend.truetrip.entities.Chat;
import backend.truetrip.services.ChatService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/chats")
public class ChatController {
    @Autowired
    private ChatService cS;

    @PostMapping
    public void insert(@RequestBody ChatDTO dto){
        ModelMapper m = new ModelMapper();
        Chat c = m.map(dto, Chat.class);
        cS.insert(c);
    }

    @GetMapping
    public List<ChatDTO> list(){
        return cS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ChatDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public ChatDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ChatDTO dto = m.map(cS.listId(id),ChatDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ChatDTO dto){
        ModelMapper m = new ModelMapper();
        Chat c = m.map(dto, Chat.class);
        cS.insert(c);
    }
}

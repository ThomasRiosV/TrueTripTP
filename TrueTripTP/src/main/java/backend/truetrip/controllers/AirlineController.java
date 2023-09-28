package backend.truetrip.controllers;

import backend.truetrip.dtos.AirlineDTO;
import backend.truetrip.entities.Airline;
import backend.truetrip.services.AirlineService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/airlines")
public class AirlineController {
    @Autowired
    private AirlineService aS;

    @PostMapping
    public void insert(@RequestBody AirlineDTO dto){
        ModelMapper m = new ModelMapper();
        Airline a = m.map(dto, Airline.class);
        aS.insert(a);
    }

    @GetMapping
    public List<AirlineDTO> list(){
        return aS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, AirlineDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        aS.delete(id);
    }

    @GetMapping("/{id}")
    public AirlineDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        AirlineDTO dto = m.map(aS.listId(id),AirlineDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody AirlineDTO dto){
        ModelMapper m = new ModelMapper();
        Airline a = m.map(dto, Airline.class);
        aS.insert(a);
    }
}

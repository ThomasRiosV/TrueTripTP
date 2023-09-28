package backend.truetrip.controllers;


import backend.truetrip.dtos.TripDTO;
import backend.truetrip.entities.Trip;
import backend.truetrip.services.TripService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/trips")
public class TripController {
    @Autowired
    private TripService tS;

    @PostMapping
    public void insert(@RequestBody TripDTO dto){
        ModelMapper m = new ModelMapper();
        Trip t = m.map(dto, Trip.class);
        tS.insert(t);
    }

    @GetMapping
    public List<TripDTO> list(){
        return tS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TripDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tS.delete(id);
    }

    @GetMapping("/{id}")
    public TripDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        TripDTO dto = m.map(tS.listId(id),TripDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody TripDTO dto){
        ModelMapper m = new ModelMapper();
        Trip t = m.map(dto, Trip.class);
        tS.insert(t);
    }
}

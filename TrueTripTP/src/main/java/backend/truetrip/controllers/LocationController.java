package backend.truetrip.controllers;


import backend.truetrip.dtos.LocationDTO;
import backend.truetrip.entities.Location;
import backend.truetrip.services.LocationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/locations")
public class LocationController {
    @Autowired
    private LocationService lS;

    @PostMapping
    public void insert(@RequestBody LocationDTO dto){
        ModelMapper m = new ModelMapper();
        Location l = m.map(dto, Location.class);
        lS.insert(l);
    }

    @GetMapping
    public List<LocationDTO> list(){
        return lS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, LocationDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        lS.delete(id);
    }

    @GetMapping("/{id}")
    public LocationDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        LocationDTO dto = m.map(lS.listId(id),LocationDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody LocationDTO dto){
        ModelMapper m = new ModelMapper();
        Location l = m.map(dto, Location.class);
        lS.insert(l);
    }
}

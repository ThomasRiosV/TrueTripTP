package backend.truetrip.controllers;


import backend.truetrip.dtos.PlanDTO;
import backend.truetrip.entities.Plan;
import backend.truetrip.services.PlanService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/plans")
public class PlanController {
    @Autowired
    private PlanService pS;

    @PostMapping
    public void insert(@RequestBody PlanDTO dto){
        ModelMapper m = new ModelMapper();
        Plan p = m.map(dto, Plan.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PlanDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, PlanDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public PlanDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        PlanDTO dto = m.map(pS.listId(id),PlanDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody PlanDTO dto){
        ModelMapper m = new ModelMapper();
        Plan p = m.map(dto, Plan.class);
        pS.insert(p);
    }
}

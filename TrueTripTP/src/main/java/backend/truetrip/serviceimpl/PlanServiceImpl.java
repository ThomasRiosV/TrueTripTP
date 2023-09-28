package backend.truetrip.serviceimpl;

import backend.truetrip.entities.Plan;
import backend.truetrip.repositories.PlanRepository;
import backend.truetrip.services.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Autowired
    private PlanRepository pR;


    @Override
    public void insert(Plan plan) {
        pR.save(plan);
    }

    @Override
    public List<Plan> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int plan_id) {
        pR.deleteById(plan_id);
    }

    @Override
    public Plan listId(int plan_id) {
        return pR.findById(plan_id).orElse(new Plan());
    }
}

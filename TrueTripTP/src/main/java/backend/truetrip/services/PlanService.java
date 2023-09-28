package backend.truetrip.services;

import backend.truetrip.entities.Plan;

import java.util.List;

public interface PlanService {
    public void insert(Plan plan);
    public List<Plan> list();
    public void delete(int plan_id);
    public Plan listId(int plan_id);
}

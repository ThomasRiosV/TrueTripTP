package backend.truetrip.serviceimpl;

import backend.truetrip.entities.Airline;
import backend.truetrip.repositories.AirlineRepository;
import backend.truetrip.services.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AirlineServiceImpl implements AirlineService {
    @Autowired
    private AirlineRepository aR;


    @Override
    public void insert(Airline airline) {
        aR.save(airline);
    }

    @Override
    public List<Airline> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int airline_id) {
        aR.deleteById(airline_id);
    }

    @Override
    public Airline listId(int airline_id) {
        return aR.findById(airline_id).orElse(new Airline());
    }
}

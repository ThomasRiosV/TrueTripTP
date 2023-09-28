package backend.truetrip.serviceimpl;

import backend.truetrip.entities.Trip;
import backend.truetrip.repositories.TripRepository;
import backend.truetrip.services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripServiceImpl implements TripService {
    @Autowired
    private TripRepository tR;


    @Override
    public void insert(Trip trip) {
        tR.save(trip);
    }

    @Override
    public List<Trip> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int trip_id) {
        tR.deleteById(trip_id);
    }

    @Override
    public Trip listId(int trip_id) {
        return tR.findById(trip_id).orElse(new Trip());
    }
}

package backend.truetrip.serviceimpl;

import backend.truetrip.entities.Location;
import backend.truetrip.repositories.LocationRepository;
import backend.truetrip.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    private LocationRepository lR;


    @Override
    public void insert(Location location) {
        lR.save(location);
    }

    @Override
    public List<Location> list() {
        return lR.findAll();
    }

    @Override
    public void delete(int location_id) {
        lR.deleteById(location_id);
    }

    @Override
    public Location listId(int location_id) {
        return lR.findById(location_id).orElse(new Location());
    }
}

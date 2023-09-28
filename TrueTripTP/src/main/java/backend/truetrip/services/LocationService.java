package backend.truetrip.services;

import backend.truetrip.entities.Location;

import java.util.List;

public interface LocationService {
    public void insert(Location location);
    public List<Location> list();
    public void delete(int location_id);
    public Location listId(int location_id);
}

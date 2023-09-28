package backend.truetrip.services;


import backend.truetrip.entities.Trip;

import java.util.List;

public interface TripService {
    public void insert(Trip trip);
    public List<Trip> list();
    public void delete(int trip_id);
    public Trip listId(int trip_id);
}

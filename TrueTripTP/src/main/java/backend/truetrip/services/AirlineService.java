package backend.truetrip.services;

import backend.truetrip.entities.Airline;

import java.util.List;

public interface AirlineService {
    public void insert(Airline airline);
    public List<Airline> list();
    public void delete(int airline_id);
    public Airline listId(int airline_id);
}

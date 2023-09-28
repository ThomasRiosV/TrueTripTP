package backend.truetrip.dtos;

import backend.truetrip.entities.Airline;
import backend.truetrip.entities.Location;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PlanDTO {
    private int id;
    private String name;
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private BigDecimal cost;
    private Location origen_id;
    private Location destino_id;
    private Airline airline;
    private int maxParticipants;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Location getOrigen_id() {
        return origen_id;
    }

    public void setOrigen_id(Location origen_id) {
        this.origen_id = origen_id;
    }

    public Location getDestino_id() {
        return destino_id;
    }

    public void setDestino_id(Location destino_id) {
        this.destino_id = destino_id;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }
}

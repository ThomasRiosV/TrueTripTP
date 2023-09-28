package backend.truetrip.entities;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name="plans")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", length = 250)
    private String name;
    @Column(name = "arrivalDate")
    private LocalDate arrivalDate;
    @Column(name = "departureDate")
    private LocalDate departureDate;
    @Column(name = "cost")
    private BigDecimal cost;
    @ManyToOne
    @JoinColumn(name = "origen_id", referencedColumnName = "id")
    private Location origen_id;

    @ManyToOne
    @JoinColumn(name = "destino_id", referencedColumnName = "id")
    private Location destino_id;

    @ManyToOne
    @JoinColumn(name = "airline_id", referencedColumnName = "id")
    private Airline airline;
    @Column(name = "maxParticipants")
    private int maxParticipants;

    public Plan() {
    }

    public Plan(int id, String name, LocalDate arrivalDate, LocalDate departureDate, BigDecimal cost, Location origen_id, Location destino_id, Airline airline, int maxParticipants) {
        this.id = id;
        this.name = name;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.cost = cost;
        this.origen_id = origen_id;
        this.destino_id = destino_id;
        this.airline = airline;
        this.maxParticipants = maxParticipants;
    }

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

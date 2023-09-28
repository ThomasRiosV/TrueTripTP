package backend.truetrip.entities;
import jakarta.persistence.*;


@Entity
@Table(name="locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", length = 250)
    private String name;
    @Column(name = "airport", length = 250)
    private String airport;

    public Location() {
    }

    public Location(int id, String name, String airport) {
        this.id = id;
        this.name = name;
        this.airport = airport;
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

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }
}

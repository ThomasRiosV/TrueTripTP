package backend.truetrip.entities;

import jakarta.persistence.*;

@Entity
@Table(name="friends")

public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user1_id", referencedColumnName = "id")
    private Users user1;

    @ManyToOne
    @JoinColumn(name = "user2_id", referencedColumnName = "id")
    private Users user2;

    public Friend() {
    }

    public Friend(int id, Users user1, Users user2) {
        this.id = id;
        this.user1 = user1;
        this.user2 = user2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUser1() {
        return user1;
    }

    public void setUser1(Users user1) {
        this.user1 = user1;
    }

    public Users getUser2() {
        return user2;
    }

    public void setUser2(Users user2) {
        this.user2 = user2;
    }
}

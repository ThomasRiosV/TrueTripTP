package backend.truetrip.entities;

import jakarta.persistence.*;


import java.time.LocalDate;



@Entity
@Table(name="chats")

public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "user1_id", referencedColumnName = "id")
    private Users user1;
    @ManyToOne
    @JoinColumn(name = "user2_id", referencedColumnName = "id")
    private Users user2;
    @Column(name = "message", length = 250)
    private String message;
    @Column(name = "creationDate", length = 250)
    private LocalDate creationDate;

    public Chat() {
    }

    public Chat(int id, Users user1, Users user2, String message, LocalDate creationDate) {
        this.id = id;
        this.user1 = user1;
        this.user2 = user2;
        this.message = message;
        this.creationDate = creationDate;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}

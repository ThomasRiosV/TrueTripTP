package backend.truetrip.entities;

import jakarta.persistence.*;


import java.math.BigDecimal;
import java.time.LocalDate;



@Entity
@Table(name="trips")

public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "plan_id", referencedColumnName = "id")
    private Plan plan_id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users user;
    @Column(name = "dateOfPurchase")
    private LocalDate dateOfPurchase;
    @Column(name = "cost")
    private BigDecimal cost;
    @Column(name = "discount")
    private BigDecimal discount;
    @Column(name = "paymentMethod", length = 250)
    private String paymentMethod;

    public Trip() {
    }

    public Trip(int id, Plan plan_id, Users user, LocalDate dateOfPurchase, BigDecimal cost, BigDecimal discount, String paymentMethod) {
        this.id = id;
        this.plan_id = plan_id;
        this.user = user;
        this.dateOfPurchase = dateOfPurchase;
        this.cost = cost;
        this.discount = discount;
        this.paymentMethod = paymentMethod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Plan getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(Plan plan_id) {
        this.plan_id = plan_id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}

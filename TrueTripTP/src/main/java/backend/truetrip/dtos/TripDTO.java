package backend.truetrip.dtos;

import backend.truetrip.entities.Plan;
import backend.truetrip.entities.Users;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TripDTO {
    private int id;
    private Plan plan_id;
    private Users user;
    private LocalDate dateOfPurchase;
    private BigDecimal cost;
    private BigDecimal discount;
    private String paymentMethod;

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

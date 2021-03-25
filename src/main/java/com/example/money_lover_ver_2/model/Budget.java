package com.example.money_lover_ver_2.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private AppUser appUser;

    private Date startDate;
    private Date endDate;
    private double amountOfMoney;

    public Budget() {
    }

    public Budget(long id, AppUser appUser, Date startDate, Date endDate, double amountOfMoney) {
        this.id = id;
        this.appUser = appUser;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amountOfMoney = amountOfMoney;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}

package com.example.money_lover_ver_2.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private LoginUser loginUser;

    private Date startDate;
    private Date endDate;
    private double amountOfMoney;

    public Budget() {
    }

    public Budget(long id, LoginUser loginUser, Date startDate, Date endDate, double amountOfMoney) {
        this.id = id;
        this.loginUser = loginUser;
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

    public LoginUser getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(LoginUser loginUser) {
        this.loginUser = loginUser;
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

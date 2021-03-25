package com.example.money_lover_ver_2.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private LoginUser loginUser;

    @ManyToOne
    private Wallet wallet;

    @ManyToOne
    private GroupAction groupAction;

    private String nameAction;
    private double amountOfMoney;
    private Date date;
    private String description;

    public Event() {
    }

    public Event(long id, LoginUser loginUser, Wallet wallet, GroupAction groupAction, String nameAction, double amountOfMoney, Date date, String description) {
        this.id = id;
        this.loginUser = loginUser;
        this.wallet = wallet;
        this.groupAction = groupAction;
        this.nameAction = nameAction;
        this.amountOfMoney = amountOfMoney;
        this.date = date;
        this.description = description;
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

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public GroupAction getGroupAction() {
        return groupAction;
    }

    public void setGroupAction(GroupAction groupAction) {
        this.groupAction = groupAction;
    }

    public String getNameAction() {
        return nameAction;
    }

    public void setNameAction(String nameAction) {
        this.nameAction = nameAction;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

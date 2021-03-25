package com.example.money_lover_ver_2.model;

import javax.persistence.*;

@Entity
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double totalMoney;

    @ManyToOne
    private LoginUser loginUser;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public LoginUser getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(LoginUser loginUser) {
        this.loginUser = loginUser;
    }

    public Wallet() {
    }

    public Wallet(long id, String name, double totalMoney, LoginUser loginUser) {
        this.id = id;
        this.name = name;
        this.totalMoney = totalMoney;
        this.loginUser = loginUser;
    }
}

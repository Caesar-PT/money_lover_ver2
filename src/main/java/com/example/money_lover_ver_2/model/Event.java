package com.example.money_lover_ver_2.model;

import javax.persistence.*;

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
}

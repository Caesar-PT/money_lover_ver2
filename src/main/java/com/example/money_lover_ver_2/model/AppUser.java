package com.example.money_lover_ver_2.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;

    @ManyToOne
    private AppRole appRole;

    private String name;
    private String nameAvatar;

    @Transient
    private MultipartFile avatar;

    public AppUser() {
    }

    public AppUser(Long id, String email, String password, AppRole appRole, String name, String nameAvatar, MultipartFile avatar) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.appRole = appRole;
        this.name = name;
        this.nameAvatar = nameAvatar;
        this.avatar = avatar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AppRole getAppRole() {
        return appRole;
    }

    public void setAppRole(AppRole appRole) {
        this.appRole = appRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAvatar() {
        return nameAvatar;
    }

    public void setNameAvatar(String nameAvatar) {
        this.nameAvatar = nameAvatar;
    }

    public MultipartFile getAvatar() {
        return avatar;
    }

    public void setAvatar(MultipartFile avatar) {
        this.avatar = avatar;
    }
}

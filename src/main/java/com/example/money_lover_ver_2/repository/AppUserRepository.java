package com.example.money_lover_ver_2.repository;

import com.example.money_lover_ver_2.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser getAppUserByName(String name);
}

package com.example.money_lover_ver_2.service.appuser;

import com.example.money_lover_ver_2.model.AppUser;
import com.example.money_lover_ver_2.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppUserService implements IAppUserService, UserDetailsService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Override
    public AppUser getAppUserByEmail(String email) {
        return appUserRepository.getAppUserByEmail(email);
    }

    @Override
    public AppUser getCurrentUser() {
        AppUser appUser;
        String email;
        Object ob = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (ob instanceof UserDetails) {
            email = ((UserDetails) ob).getUsername();
        } else {
            email = ob.toString();
        }
        appUser = this.getAppUserByEmail(email);
        return appUser;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        AppUser appUser = this.getAppUserByEmail(email);
        if (appUser == null) throw new UsernameNotFoundException("Not found username");
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add((GrantedAuthority) appUser.getAppRole());
        UserDetails userDetails = new User(
                appUser.getEmail(),
                appUser.getPassword(),
                authorities);
        return userDetails;
    }
}

package com.example.money_lover_ver_2.service.appuser;

import com.example.money_lover_ver_2.model.AppUser;

public interface IAppUserService {
    AppUser getAppUserByEmail(String email);
    AppUser getCurrentUser();
}

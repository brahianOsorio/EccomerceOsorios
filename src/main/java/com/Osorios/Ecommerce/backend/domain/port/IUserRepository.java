package com.Osorios.Ecommerce.backend.domain.port;

import com.Osorios.Ecommerce.backend.domain.model.User;

public interface IUserRepository {

    User save(User user);
    User findByEmail(String email);
    User findById(int id);

}

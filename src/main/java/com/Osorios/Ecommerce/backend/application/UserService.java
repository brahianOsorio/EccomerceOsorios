package com.Osorios.Ecommerce.backend.application;

import com.Osorios.Ecommerce.backend.domain.model.User;
import com.Osorios.Ecommerce.backend.domain.port.IUserRepository;

public class UserService {
    private final IUserRepository iuserRepository;
    public UserService(IUserRepository iuserRepository) {
        this.iuserRepository = iuserRepository;
    }

    public User save(User user) {
        return iuserRepository.save(user);
    }
    public User findByEmail(String email) {
        return iuserRepository.findByEmail(email);
    }
    public User findById(int id) {
        return iuserRepository.findById(id);
    }


}

package com.Osorios.Ecommerce.backend.infrastructure.adapter.user;

import com.Osorios.Ecommerce.backend.domain.model.User;
import com.Osorios.Ecommerce.backend.domain.port.IUserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserCrudRepositoryImpl implements IUserRepository {
    private final IUserCrudRepository iUserCrudRepository;

    public UserCrudRepositoryImpl(IUserCrudRepository iUserCrudRepository) {
        this.iUserCrudRepository = iUserCrudRepository;
    }


    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }
}

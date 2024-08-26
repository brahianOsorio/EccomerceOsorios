package com.Osorios.Ecommerce.backend.infrastructure.adapter.user;

import com.Osorios.Ecommerce.backend.infrastructure.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUserCrudRepository extends CrudRepository<UserEntity, Integer> {

}

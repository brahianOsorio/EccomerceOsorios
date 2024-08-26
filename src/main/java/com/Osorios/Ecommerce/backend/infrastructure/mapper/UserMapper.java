package com.Osorios.Ecommerce.backend.infrastructure.mapper;

import com.Osorios.Ecommerce.backend.domain.model.User;
import com.Osorios.Ecommerce.backend.infrastructure.Entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings(
            {
                    @Mapping(source = "id" , target = "id"),
                    @Mapping(source = "userName" , target = "userName"),
                    @Mapping(source = "firstName" , target = "firstName"),
                    @Mapping(source = "lastName" , target = "lastName"),
                    @Mapping(source = "email" , target = "email"),
                    @Mapping(source = "address" , target = "address"),
                    @Mapping(source ="cellPhone" , target = "cellPhone"),
                    @Mapping(source = "password" , target = "password"),
                    @Mapping(source = "userType" , target = "userType"),
                    @Mapping(source = "dateCreated" , target = "dateCreated"),
                    @Mapping(source = "dateUpdated" , target = "dateUpdated")
            }
    )
    User toUser(UserEntity userEntity);
}

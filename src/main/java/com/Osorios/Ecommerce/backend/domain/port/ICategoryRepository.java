package com.Osorios.Ecommerce.backend.domain.port;

import com.Osorios.Ecommerce.backend.domain.model.Category;

public interface ICategoryRepository {

    Category save(Category category);
    Iterable<Category> findAll();
    Category findById(int id);
    void deleteById(int id);

}

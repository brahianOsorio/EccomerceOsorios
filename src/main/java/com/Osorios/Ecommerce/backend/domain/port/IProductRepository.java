package com.Osorios.Ecommerce.backend.domain.port;

import com.Osorios.Ecommerce.backend.domain.model.Product;

public interface IProductRepository {

    Product save(Product product);
    Iterable<Product> findAll();
    Product findById(int id);
    void deleteById(int id);

}

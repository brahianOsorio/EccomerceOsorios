package com.Osorios.Ecommerce.backend.application;

import com.Osorios.Ecommerce.backend.domain.model.Product;
import com.Osorios.Ecommerce.backend.domain.port.IProductRepository;

public class ProductService {
    private final IProductRepository iproductRepository;
    public ProductService(IProductRepository iproductRepository) {
        this.iproductRepository = iproductRepository;
    }

    public Product save(Product product) {
        return iproductRepository.save(product);
    }
    public Product findById(int id) {
        return iproductRepository.findById(id);
    }

    public Iterable<Product> findAll() {
        return iproductRepository.findAll();
    }

    public void deleteById(int id) {
        iproductRepository.deleteById(id);
    }
}

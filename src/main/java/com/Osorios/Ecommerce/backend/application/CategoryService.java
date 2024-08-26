package com.Osorios.Ecommerce.backend.application;

import com.Osorios.Ecommerce.backend.domain.model.Category;
import com.Osorios.Ecommerce.backend.domain.port.ICategoryRepository;

import java.util.List;

public class CategoryService {

    private final ICategoryRepository icategoryRepository;

    public CategoryService(ICategoryRepository icategoryRepository) {
        this.icategoryRepository = icategoryRepository;
    }

    public Category save(Category category) {
        return icategoryRepository.save(category);
    }
    public Iterable<Category> findAll() {
        return icategoryRepository.findAll();
    }

    public Category findById(int id) {
        return icategoryRepository.findById(id);
    }
    public void deleteById(int id) {
        icategoryRepository.deleteById(id);
    }

}

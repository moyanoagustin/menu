package com.acgroup.menu.service;

import com.acgroup.menu.model.Category;
import com.acgroup.menu.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// El servicio maneja la lógica de negocio para Category.
@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // Listar todas las categorías
    public List<Category> listAll() {
        return categoryRepository.findAll();
    }

    // Buscar una categoría por ID
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    // Crear o actualizar una categoría
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    // Eliminar una categoría por ID
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }
}

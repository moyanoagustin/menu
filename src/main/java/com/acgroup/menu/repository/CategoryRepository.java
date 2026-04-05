package com.acgroup.menu.repository;

import com.acgroup.menu.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

// El repositorio permite acceder a la base de datos para la entidad Category.
// Hereda métodos como save, findAll, findById, deleteById, etc.
public interface CategoryRepository extends JpaRepository<Category, Long> {
}

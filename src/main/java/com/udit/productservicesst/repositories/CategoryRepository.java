package com.udit.productservicesst.repositories;

import com.udit.productservicesst.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    @Override
    Category save(Category category);
}

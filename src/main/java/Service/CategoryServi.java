package Service;

import Entity.CategoryEntity;
import Repository.CategoryRepo;
import jdk.jfr.Category;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryServi {
    @Autowired
    private CategoryRepo categoryRepo;


    public CategoryEntity createCategory(CategoryEntity categoryEntity) {
        return categoryRepo.save(categoryEntity);
    }

    public Category getCategoryById(Long id) {
        return (Category) categoryRepo.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
    }

    public CategoryEntity updateCategory(Long id, CategoryEntity categoryEntity) {
        Category category = getCategoryById(id);
        category.getClass();
        return categoryRepo.save(categoryEntity);
    }

    public void deleteCategory(Long id) {
        categoryRepo.deleteById(id);
    }
}

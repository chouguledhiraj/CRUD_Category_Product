package Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class CategoryEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ProductEntity> productsEntity;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public Object getProducts() {
        return new ProductEntity();
    }

    public void setProducts(Set<ProductEntity> products) {
        this.productsEntity = productsEntity;
    }
}

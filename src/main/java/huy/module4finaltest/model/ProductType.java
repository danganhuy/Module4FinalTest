package huy.module4finaltest.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "productType")
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}

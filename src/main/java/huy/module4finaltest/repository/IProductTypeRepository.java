package huy.module4finaltest.repository;

import huy.module4finaltest.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.nio.file.LinkOption;

@Repository
public interface IProductTypeRepository extends JpaRepository<ProductType, Long> {
}

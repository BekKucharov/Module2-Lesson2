package uz.pdp.springdatarestlesson2.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdatarestlesson2.entity.InputProduct;
import uz.pdp.springdatarestlesson2.projection.InputProductProjection;

@RepositoryRestResource(path = "inputProduct", excerptProjection = InputProductProjection.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {
}

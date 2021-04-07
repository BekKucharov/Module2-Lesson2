package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Input;
import uz.pdp.springdatarestlesson2.entity.InputProduct;
import uz.pdp.springdatarestlesson2.entity.Product;

import java.util.Date;

@Projection(name = "inputProductProjection", types = InputProduct.class)
public interface InputProductProjection {
    Integer getId();

    Product getProduct();

    double getAmount();

    double getPrice();

    String getExpireDate();

    Input getInput();
}

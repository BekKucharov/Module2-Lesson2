package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Output;
import uz.pdp.springdatarestlesson2.entity.OutputProduct;
import uz.pdp.springdatarestlesson2.entity.Product;

@Projection(name = "outputProductProjection", types = OutputProduct.class)
public interface OutputProductProjection {
    Integer getId();

    Product getProduct();

    double getAmount();

    double getPrice();

    Output getOutput();
}

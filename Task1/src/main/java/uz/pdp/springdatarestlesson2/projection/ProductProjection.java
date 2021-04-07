package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Attachment;
import uz.pdp.springdatarestlesson2.entity.Category;
import uz.pdp.springdatarestlesson2.entity.Measurement;
import uz.pdp.springdatarestlesson2.entity.Product;

import java.util.UUID;

@Projection(name = "productProjection", types = Product.class)
public interface ProductProjection {
    Integer getId();

    String getName();

    boolean isActive();

    Category getCategory();

    Attachment getPhoto();

    UUID getUuid();

    Measurement getMeasurement();
}


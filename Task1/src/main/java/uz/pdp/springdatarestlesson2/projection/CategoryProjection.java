package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Category;

@Projection(name = "categoryProjection", types = Category.class)
public interface CategoryProjection {
    Integer getId();

    String getName();

    boolean isActive();

    Category getParentCategory();
}

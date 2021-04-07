package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Warehouse;

@Projection( name = "warehouseProtection", types = Warehouse.class)
public interface WarehouseProjection {
     Integer getId();

     String getName();

     boolean isActive();
}

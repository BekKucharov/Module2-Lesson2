package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Currency;
import uz.pdp.springdatarestlesson2.entity.Input;
import uz.pdp.springdatarestlesson2.entity.Supplier;
import uz.pdp.springdatarestlesson2.entity.Warehouse;

import java.util.Date;
import java.util.UUID;

@Projection(name = "inputProjection", types = Input.class)
public interface InputProjection {
    Integer getId();

    Date getDate();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

    Integer getFactureNumber();

    UUID getUuid();
}

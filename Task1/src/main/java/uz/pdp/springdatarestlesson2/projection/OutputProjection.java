package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Client;
import uz.pdp.springdatarestlesson2.entity.Currency;
import uz.pdp.springdatarestlesson2.entity.Output;
import uz.pdp.springdatarestlesson2.entity.Warehouse;

import java.util.Date;
import java.util.UUID;

@Projection(name = "outputProjection", types = Output.class)
public interface OutputProjection {
    Integer getId();

    Date getDate();

    Warehouse getWarehouse();

    Currency getCurrency();

    Integer getFactureNumber();

    UUID getUuid();

    Client getClient();
}

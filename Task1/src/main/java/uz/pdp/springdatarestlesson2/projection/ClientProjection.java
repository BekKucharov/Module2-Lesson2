package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Client;

@Projection(name = "clientProjection", types = Client.class)
public interface ClientProjection {
    Integer getId();

    String getName();

    String getPhoneNumber();
}

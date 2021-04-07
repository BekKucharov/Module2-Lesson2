package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.User;
import uz.pdp.springdatarestlesson2.entity.Warehouse;

import java.util.Set;
import java.util.UUID;

@Projection(name = "userProjection", types = User.class)
public interface UserProjection {
    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    UUID getUuid();

    boolean isActive();

    Set<Warehouse> getWarehouses();
}

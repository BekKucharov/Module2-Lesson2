package uz.pdp.springdatarestlesson2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Measurement;

@Projection(name = "measurementProjection", types = Measurement.class)
public interface MeasurementProjection {
    Integer getId();

    String getName();

    boolean isActive();
}

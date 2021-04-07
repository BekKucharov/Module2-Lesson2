package uz.pdp.springdatarestlesson2.projection;

import  org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdatarestlesson2.entity.Currency;

@Projection(name = "currencyProjection", types = Currency.class)
public interface CurrencyProjection {
    Integer getId();

    String getName();

    boolean isActive();
}

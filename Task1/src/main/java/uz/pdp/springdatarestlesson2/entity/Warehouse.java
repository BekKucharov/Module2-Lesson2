package uz.pdp.springdatarestlesson2.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.springdatarestlesson2.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Warehouse extends AbsEntity {
}

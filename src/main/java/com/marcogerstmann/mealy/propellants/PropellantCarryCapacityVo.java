package com.marcogerstmann.mealy.propellants;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class PropellantCarryCapacityVo {

    private Double amount;

    private String unit;

}

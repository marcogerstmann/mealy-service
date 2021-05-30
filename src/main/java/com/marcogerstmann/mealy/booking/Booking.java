package com.marcogerstmann.mealy.booking;

import com.marcogerstmann.mealy.common.base.BaseEntity;
import com.marcogerstmann.mealy.travelpackage.TravelPackage;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.sql.Date;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Booking extends BaseEntity {

    @NotNull
    private Date departureDate;

    @NotNull
    @Positive
    private Integer passengers;

    @NotNull
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "travel_package_id")
    private TravelPackage travelPackage;

}

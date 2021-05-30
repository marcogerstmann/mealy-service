package com.marcogerstmann.mealy.travelpackage;

import com.marcogerstmann.mealy.common.base.BaseService;

import javax.annotation.Nonnull;
import java.time.LocalDate;
import java.util.List;

public interface TravelPackageService extends BaseService<TravelPackageVo> {

    @Nonnull
    List<TravelPackageAvailabilityVo> getAvailabilitiesByDate(LocalDate date);

}

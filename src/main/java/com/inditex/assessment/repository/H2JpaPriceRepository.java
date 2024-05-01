package com.inditex.assessment.repository;

import com.inditex.assessment.model.Price;

import java.time.OffsetDateTime;
import java.util.Optional;

public interface H2JpaPriceRepository extends PriceRepository {
    Optional<Price> findFirstByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByStartDateDesc(
            int productId, int brandId, OffsetDateTime startDate, OffsetDateTime endDate);
}

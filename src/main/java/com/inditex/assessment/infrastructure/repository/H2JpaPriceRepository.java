package com.inditex.assessment.infrastructure.repository;

import com.inditex.assessment.domain.model.Price;

import java.time.OffsetDateTime;
import java.util.Optional;

public interface H2JpaPriceRepository extends PriceRepository {
    Optional<Price> findFirstByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByStartDateDesc(
            int productId, int brandId, OffsetDateTime startDate, OffsetDateTime endDate);
}

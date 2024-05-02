package com.inditex.assessment.infrastructure.mapper;

import com.inditex.assessment.domain.model.Price;
import com.inditex.model.PriceResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriceMapper {
    PriceResponse toResponse(Price product);
}

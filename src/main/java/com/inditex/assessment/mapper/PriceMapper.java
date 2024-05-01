package com.inditex.assessment.mapper;

import com.inditex.assessment.model.Price;
import com.inditex.model.PriceResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriceMapper {
    PriceResponse toResponse(Price product);
}

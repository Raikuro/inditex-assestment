package com.inditex.assessment.service;

import com.inditex.assessment.model.Price;
import com.inditex.assessment.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    public Price findApplicablePrice(OffsetDateTime applicationDate, int productId, int brandId) throws NotFoundException {
        return priceRepository
                .findFirstByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByStartDateDesc(
                        productId, brandId, applicationDate, applicationDate)
                .orElseThrow(NotFoundException::new);
    }
}

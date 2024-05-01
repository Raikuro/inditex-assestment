package com.inditex.assessment.controller;

import com.inditex.assessment.model.Price;
import com.inditex.assessment.mapper.PriceMapper;
import com.inditex.assessment.service.PriceService;
import com.inditex.controller.PricesApi;
import com.inditex.model.PriceResponse;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;

@Log4j2
@RestController
public class PriceController implements PricesApi {

    @Autowired
    private PriceService priceService;

    @Autowired
    private PriceMapper mapper;

    @SneakyThrows
    @Override
    public ResponseEntity<PriceResponse> getApplicablePrice(OffsetDateTime date, Integer productId, Integer brandId) {
        log.info("date: {} productId: {} brandId {}", date, productId, brandId);
        Price applicablePrice = priceService.findApplicablePrice(date, productId, brandId);

        return new ResponseEntity<>(mapper.toResponse(applicablePrice), HttpStatus.OK);
    }
}

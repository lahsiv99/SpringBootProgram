package com.vishal.demo.service;

import com.vishal.demo.service.convertor.Convertor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.math3.util.Precision;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AreaService implements Convertor {

    @Override
    public double convertToMetric(final double acreValue) {
        return Precision.round(acreValue / 2.471, 2);
    }

    
    @Override
    public double convertToImperial(final double hectareValue) {
        return Precision.round(hectareValue * 2.471, 2);
    }
}

package com.vishal.demo.service;

import com.vishal.demo.service.convertor.Convertor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.math3.util.Precision;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TemperatureService implements Convertor {

    
    @Override
    public double convertToMetric(final double fahrenheitValue) {
        return Precision.round((fahrenheitValue - 32) / 1.8, 2);
    }

    
    @Override
    public double convertToImperial(final double celsiusValue) {
        return Precision.round((celsiusValue * 1.8) + 32, 2);
    }
}

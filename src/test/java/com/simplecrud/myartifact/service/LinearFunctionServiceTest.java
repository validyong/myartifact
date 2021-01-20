package com.simplecrud.myartifact.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

public class LinearFunctionServiceTest {

    @BeforeEach
    public void setUp() {

        String uniraBrother = "munancho";
        System.out.println(uniraBrother);
    }

    @Test
    public void testCalculate() {
        int coefficient = 2;
        int x = 3;
        int intercept = 5;

        AddService addService = mock(AddService.class);
        MultiplyService multiplyService = mock(MultiplyService.class);

        when(multiplyService.multiply(coefficient, x)).thenReturn(6);
        when(addService.add(coefficient * x, intercept)).thenReturn(11);

        LinearFunctionService linearFunctionService = new LinearFunctionService(addService, multiplyService);

        assertEquals(11, linearFunctionService.calculate(coefficient, x, intercept));
    }
}

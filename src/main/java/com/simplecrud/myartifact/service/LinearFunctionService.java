package com.simplecrud.myartifact.service;

public class LinearFunctionService {
    private AddService addService;
    private MultiplyService multiplyService;

    public LinearFunctionService(AddService addService, MultiplyService multiplyService) {
        this.addService = addService;
        this.multiplyService = multiplyService;
    }

    public int calculate(int coefficient, int x, int intercept) {

        return addService.add(multiplyService.multiply(coefficient, x), intercept);
    }
}

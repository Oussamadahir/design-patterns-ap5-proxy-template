package com.oussamadahir.proxy;

public class Client {
    private IService service;

    public void setService(IService service) {
        this.service = service;
    }

    public double perform(int temp) {
        return service.compute(temp);
    }
}

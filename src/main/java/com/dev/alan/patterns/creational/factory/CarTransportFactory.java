package com.dev.alan.patterns.creational.factory;

import com.dev.alan.patterns.creational.factory.out.Car;

public class CarTransportFactory extends TransportFactory {

    @Override
    public Transport createTransport() {
        return new Car();
    }

}

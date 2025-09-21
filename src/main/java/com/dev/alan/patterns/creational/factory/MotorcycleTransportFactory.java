package com.dev.alan.patterns.creational.factory;

import com.dev.alan.patterns.creational.factory.out.Motorcycle;

public class MotorcycleTransportFactory extends  TransportFactory{
    @Override
    public Transport createTransport() {
        return new Motorcycle();
    }
}

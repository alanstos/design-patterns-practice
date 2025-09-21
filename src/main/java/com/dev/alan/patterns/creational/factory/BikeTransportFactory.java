package com.dev.alan.patterns.creational.factory;

import com.dev.alan.patterns.creational.factory.out.Bike;

public class BikeTransportFactory extends  TransportFactory{
    @Override
    public Transport createTransport() {
        return new Bike();
    }
}

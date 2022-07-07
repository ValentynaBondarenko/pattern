package com.luxoft.teacher.factorymethodandflyweight.flyweight;

import com.luxoft.teacher.factorymethodandflyweight.factory.Bike;
import com.luxoft.teacher.factorymethodandflyweight.factory.Car;
import com.luxoft.teacher.factorymethodandflyweight.factory.Scooter;
import com.luxoft.teacher.factorymethodandflyweight.factory.Transport;

import java.util.HashMap;

public class TransportFactory {
    //Cache
    private static final HashMap<String, Transport> transportMap = new HashMap();

    public static Transport getTransport(String productName, String color) {
        Transport transport = transportMap.get(color);
        if (transport == null) {
            transport = createTransportByName(productName, color);
            transportMap.put(color, transport);
            System.out.println("Number of created objects = " + transportMap.size());
        }
        return transport;

    }

    public static Transport createTransportByName(String productName, String color) {
        if (productName.equalsIgnoreCase("Scooter")) {
            return new Scooter(color);
        } else if (productName.equalsIgnoreCase("car")) {
            return new Car(color);
        } else if (productName.equalsIgnoreCase("bike")) {
            return new Bike(color);
        } else throw new RuntimeException("exception");
    }
}

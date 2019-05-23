package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car = new Car("2014","Mercedes Benz","M350");
        repository.save(car);

        car = new Car("2015", "Hyundai", "Santafe");
        repository.save(car);

        car = new Car("2011", "kia", "soul");
        repository.save(car);
    }
}

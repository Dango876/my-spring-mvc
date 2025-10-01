package web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import web.model.Car;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> carList = new ArrayList<>(List.of(
            new Car("Audi", 2025, 5_500_000),
            new Car("Volvo", 2024, 4_500_000),
            new Car("Toyota", 2023, 4_000_000),
            new Car("Lexus", 2022, 6_500_000),
            new Car("BMW", 2021, 7_000_000)
    ));

    @Override
    public List<Car> getCarList(Integer count) {
        count = (count == null || count > 5) ? 5 : count < 0 ? 0 : count;
        return carList.stream().limit(count).toList();
    }
}

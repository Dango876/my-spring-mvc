package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> carlist = new ArrayList<>(List.of(
            new Car("Audi", 2025, 5_500_000),
            new Car("Volvo", 2024, 4_500_000),
            new Car("Toyota", 2023, 4_000_000),
            new Car("Lexus", 2022, 6_500_000),
            new Car("BMW", 2021, 7_000_000)
    ));

    @Override
    public List<Car> getCarList(Integer count) {
        if (count == null || count > carlist.size()) {
            return carlist;
        }
        if (count < 0) {
            count = 0;
        }
        return carlist.subList(0, count);
    }
}

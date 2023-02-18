package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarService {
    private static int CAR_COUNT;
    private final List<Car> cars;



    {
        cars = new ArrayList<>();

        cars.add(new Car((long) ++CAR_COUNT, "Opel", "Astra", 215));
        cars.add(new Car((long) ++CAR_COUNT, "Tesla", "model S", 250));
        cars.add(new Car((long) ++CAR_COUNT, "Nissan", "Qashqai", 200));
        cars.add(new Car((long) ++CAR_COUNT, "Ford", "Focus", 170));
        cars.add(new Car((long) ++CAR_COUNT, "Ford", "Transit", 150));
    }

    public List<Car> findNCars(int n) {
        return cars.stream().limit(n).collect(Collectors.toList());
    }

}

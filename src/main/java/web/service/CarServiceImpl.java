package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private static int CAR_COUNT;
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car((long) ++CAR_COUNT, "Opel", "Astra", 215));
        cars.add(new Car((long) ++CAR_COUNT, "Tesla", "model S", 250));
        cars.add(new Car((long) ++CAR_COUNT, "Nissan", "Qashqai", 200));
        cars.add(new Car((long) ++CAR_COUNT, "Ford", "Focus", 170));
        cars.add(new Car((long) ++CAR_COUNT, "Ford", "Transit", 150));
        cars.add(new Car((long) ++CAR_COUNT, "Opel", "Astra", 215));
        cars.add(new Car((long) ++CAR_COUNT, "Tesla", "model S", 250));
        cars.add(new Car((long) ++CAR_COUNT, "Nissan", "Qashqai", 200));
        cars.add(new Car((long) ++CAR_COUNT, "Ford", "Focus", 170));
        cars.add(new Car((long) ++CAR_COUNT, "Ford", "Transit", 150));
    }

    @Override
    public List<Car> findNCars(int n) {
        if (n > 5) {
            return cars;
        } else {
            return cars.stream().limit(n).collect(Collectors.toList());
        }
    }

    @Override
    public List<Car> findCars() {
        return cars;
    }
}

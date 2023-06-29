package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarService {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Green", "AudiA6"));
        cars.add(new Car(2, "pink", "BMWX5"));
        cars.add(new Car(3, "blue", "VAZ2107"));
        cars.add(new Car(4, "red", "UAZik"));
        cars.add(new Car(5, "bakLazhan", "VAZ2106"));
    }
    public int getCarCount() {
        return cars.size();
    }

    public List<Car> getListOfCars(int count) {
        return cars.stream().limit(count).toList();
    }
}

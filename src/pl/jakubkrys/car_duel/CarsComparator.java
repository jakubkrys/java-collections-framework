package pl.jakubkrys.car_duel;

import java.util.*;

public class CarsComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        int result = 0;

        if(car1.getPrice() > car2.getPrice()){
            result--;
        } else {
            result++;
        }

        if(car1.getFuelConsumption() > car2.getFuelConsumption()){
            result--;
        } else {
            result++;
        }

        if(car1.getEngineCapacity() > car2.getEngineCapacity()){
            result++;
        } else {
            result--;
        }

        return result;
    }
}

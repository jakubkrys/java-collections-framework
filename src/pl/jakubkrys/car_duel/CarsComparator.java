package pl.jakubkrys.car_duel;

public class CarsComparator {

    public void compare(Car car1, Car car2) {
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

        if(result > 0) {
            System.out.println("Better car is car 1\n");
        } else {
            System.out.println("Better car is car 2\n");
        }
    }
}

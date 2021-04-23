package pl.jakubkrys.car_duel;

public class Car  implements Comparable<Car>{

    private int price;
    private double fuelConsumption;
    private double engineCapacity;

    public Car(int price, double fuelConsumption, double engineCapacity) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.engineCapacity = engineCapacity;
    }

    public int getPrice() {
        return price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", fuelConsumption=" + fuelConsumption +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public int compareTo(Car car2) {
        int result = 0;

        if(getPrice() > car2.getPrice()){
            result--;
        } else {
            result++;
        }

        if(getFuelConsumption() > car2.getFuelConsumption()){
            result--;
        } else {
            result++;
        }

        if(getEngineCapacity() > car2.getEngineCapacity()){
            result++;
        } else {
            result--;
        }

        return result;
    }
}

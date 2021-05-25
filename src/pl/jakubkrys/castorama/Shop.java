package pl.jakubkrys.castorama;

import java.util.*;

public class Shop {

    Queue <String> orders = new ArrayDeque<>();

    public void addOrder (String product) {
        orders.offer(product);
    }

    public String getOrder () {
        return orders.poll();
    }
}

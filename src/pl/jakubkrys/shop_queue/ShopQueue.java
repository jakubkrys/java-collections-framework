package pl.jakubkrys.shop_queue;

import java.util.*;

public class ShopQueue {

    private Queue<Person> people = new PriorityQueue<>();

    public boolean add(Person person){
        return people.offer(person);
    }

    public Person get(){
        return people.poll();
    }

    public Queue<Person> getAll(){
        return people;
    }
}

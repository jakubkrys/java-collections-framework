package pl.jakubkrys.post_office;

import java.util.*;

public class PackageWarehouse {

    private Queue<Package> warehouse = new PriorityQueue<>(new PackageComparator());

    public String add(Package p){
        if (warehouse.offer(p)){
            return "Package added to warehouse";
        } else {
            return "Error with adding package to warehouse. Try again.";
        }
    }
}

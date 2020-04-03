package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Aircraft {
    private String name;
    private int price;
    private int capacity;
    List<Owner> stores;

    public Aircraft(String name, int price, int capacity, List<Owner> stores) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.stores = stores;
    }

    public Aircraft(String name, int price, int capacity) {
        this(name, price, capacity, new ArrayList<Owner>());
    }

    public Aircraft() {
        this("", 0, 0, new ArrayList<Owner>());
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Owner> getStores() {
        return stores;
    }

    public void addOwner(Owner owner) {
        owner.addAircraft(this);
        this.stores.add(owner);
    }

    @Override
    public String toString() {
        String ownerNamesStr = "";
        ArrayList<String> ownerNames =  this.stores.stream()
                .map(Owner::getName)
                .collect(Collectors.toCollection(ArrayList::new));
        for(String ownerName : ownerNames) {
            ownerNamesStr += ownerName + " ";
        }
        return "Name: " + this.name +
                ", price: " + this.price +
                ", capacity: " + this.capacity +
                ", owners: " + ownerNamesStr;
    }
}

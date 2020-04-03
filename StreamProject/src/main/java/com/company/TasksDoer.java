package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TasksDoer {
    private List<Aircraft> aircraftList;

    public TasksDoer(ArrayList<Aircraft> aircraftList) {
        this.aircraftList = aircraftList;
    }

    public boolean hasAircraftWithHigherCapacityThan(int capacity) {
        return this.aircraftList.stream()
                .anyMatch(aircraft -> aircraft.getCapacity() > capacity);
    }

    public Aircraft getAircraftWithMinCapacity() {
        return this.aircraftList.stream()
                .min(Comparator.comparingInt(Aircraft::getCapacity)).get();
    }

    public Aircraft getAircraftWithMaxCapacity() {
        return this.aircraftList.stream()
                .max(Comparator.comparingInt(Aircraft::getCapacity)).get();
    }

    public ArrayList<Aircraft> getAircraftsWithMultipleOwners() {
        return this.aircraftList.stream()
                .filter(aircraft -> aircraft.getStores().size() > 1)
                .peek(aircraft -> System.out.println(aircraft.getStores().size() + " is more than 1"))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Aircraft> getSortedAircraftsByPrice() {
        return this.aircraftList.stream()
                .sorted(Comparator.comparingInt(Aircraft::getPrice))
                .peek(aircraft -> System.out.println(aircraft.getPrice()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Aircraft> getSortedAircraftsByCapacity() {
        return this.aircraftList.stream()
                .sorted(Comparator.comparingInt(Aircraft::getCapacity))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<String> getAircraftNames() {
        return this.aircraftList.stream()
                .map(Aircraft::getName)
                .peek(name -> System.out.println("peekked name " + name))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public void printOwners() {
        this.getAircraftNames().stream()
                .forEach(System.out::println);
    }

    public ArrayList<String> getOwnersNamesSet() {
        return this.getAircraftNames().stream()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
    }
}

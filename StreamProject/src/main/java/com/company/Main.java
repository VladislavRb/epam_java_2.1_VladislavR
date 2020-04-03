package com.company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ItemsGenerator itemsGenerator = new ItemsGenerator();
        List<Aircraft> aircrafts = itemsGenerator.getAircraftList();
        List<Owner> owners = itemsGenerator.getOwnerList();
        TasksDoer tasksDoer = new TasksDoer(new ArrayList<Aircraft>(aircrafts));

        int capacityThreshold = 200;
        if(tasksDoer.hasAircraftWithHigherCapacityThan(capacityThreshold)) {
            System.out.println("There are aircrafts with capacity higher than " + capacityThreshold);
        }
        else {
            System.out.println("There are no aircrafts with capacity higher than " + capacityThreshold);
        }


        Aircraft minCapacityAircraft = tasksDoer.getAircraftWithMinCapacity();
        Aircraft maxCapacityAircraft = tasksDoer.getAircraftWithMaxCapacity();
        System.out.println("min capacity aircraft: " + minCapacityAircraft.toString());
        System.out.println("max capacity aircraft: " + maxCapacityAircraft.toString());


        ArrayList<Aircraft> aircraftsWithMultipleOwners = tasksDoer.getAircraftsWithMultipleOwners();
        System.out.println("Aircrafts with multiple owners:\n");
        for(Aircraft aircraft : aircraftsWithMultipleOwners) {
            System.out.println("\t" + aircraft.toString() + "\n");
        }


        ArrayList<Aircraft> sortedAircraftsByPrice = tasksDoer.getSortedAircraftsByPrice();
        System.out.println("Aircrafts sorted by price:\n");
        for(Aircraft aircraft : sortedAircraftsByPrice) {
            System.out.println("\t" + aircraft.toString() + "\n");
        }


        ArrayList<Aircraft> sortedAircraftsByCapacity = tasksDoer.getSortedAircraftsByCapacity();
        System.out.println("Aircrafts sorted by capacity:\n");
        for(Aircraft aircraft : sortedAircraftsByCapacity) {
            System.out.println("\t" + aircraft.toString() + "\n");
        }


        System.out.println("All owners' names: " + tasksDoer.getOwnersNames());



        //logger.info("hi");
    }
}

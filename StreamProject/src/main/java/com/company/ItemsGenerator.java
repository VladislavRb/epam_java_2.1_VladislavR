package com.company;

import java.util.ArrayList;
import java.util.List;

public class ItemsGenerator {
    private List<Aircraft> aircraftList = new ArrayList<Aircraft>();
    private List<Owner> ownerList = new ArrayList<Owner>();

    public ItemsGenerator() {
        Aircraft white_aircraft = new Aircraft("White aircraft", 4000, 170);
        Aircraft red_aircraft = new Aircraft("Red aircraft", 2000, 280);
        Aircraft green_aircraft = new Aircraft("Green aircraft", 1000, 220);
        Aircraft blue_aircraft = new Aircraft("Blue aircraft", 3000, 270);
        Aircraft black_aircraft = new Aircraft("Black aircraft", 3700, 200);

        Owner donald = new Owner("Donald Trump", "Mexico");
        Owner bill = new Owner("Bill Gates", "Paris");
        Owner ivan = new Owner("Ivan Ivanov", "Rome");
        Owner anna = new Owner("Anna Sidorova", "Warsaw");
        Owner petya = new Owner("Petya Smirnov", "New York");

        white_aircraft.addOwner(donald);
        white_aircraft.addOwner(ivan);

        red_aircraft.addOwner(bill);
        red_aircraft.addOwner(ivan);
        red_aircraft.addOwner(anna);

        green_aircraft.addOwner(ivan);
        green_aircraft.addOwner(petya);

        blue_aircraft.addOwner(petya);

        black_aircraft.addOwner(donald);
        black_aircraft.addOwner(bill);
        black_aircraft.addOwner(ivan);


        Aircraft[] aircrafts = {black_aircraft, red_aircraft, green_aircraft, blue_aircraft, black_aircraft};
        Owner[] owners = {donald, bill, ivan, anna, petya};

        for(Aircraft aircraft : aircrafts) {
            this.aircraftList.add(aircraft);
        }

        for(Owner owner: owners) {
            this.ownerList.add(owner);
        }
    }

    public List<Aircraft> getAircraftList() {
        return aircraftList;
    }

    public List<Owner> getOwnerList() {
        return ownerList;
    }
}

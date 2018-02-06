package de.codecrafters.tableviewexample.data;

import de.codecrafters.tableviewexample.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A factory that provides data for demonstration porpuses.
 *
 * @author ISchwarz
 */
public final class DataFactory {

    /**
     * Creates a list of cars.
     *
     * @return The created list of cars.
     */
    public static List<Car> createCarList() {
        final MortyType rock = new MortyType(R.mipmap.rock, "Audi");
        final Car audiA1 = new Car(rock, "test", 150, 25000);
        final Car audiA3 = new Car(rock, "A3", 120, 35000);
        final Car audiA4 = new Car(rock, "A4", 210, 42000);
        final Car audiA5 = new Car(rock, "S5", 333, 60000);
        final Car audiA6 = new Car(rock, "A6", 250, 55000);
        final Car audiA7 = new Car(rock, "A7", 420, 87000);
        final Car audiA8 = new Car(rock, "A8", 320, 110000);
        final Car shitpiss = new Car(rock,"A9", 999, 999999);

        final MortyType paper = new MortyType(R.mipmap.paper, "BMW");
        final Car bmw1 = new Car(paper, "1er", 170, 25000);
        final Car bmw3 = new Car(paper, "3er", 230, 42000);
        final Car bmwX3 = new Car(paper, "X3", 230, 45000);
        final Car bmw4 = new Car(paper, "4er", 250, 39000);
        final Car bmwM4 = new Car(paper, "M4", 350, 60000);
        final Car bmw5 = new Car(paper, "5er", 230, 46000);

        final MortyType scissors = new MortyType(R.mipmap.scissors, "Porsche");
        final Car porsche911 = new Car(scissors, "911", 280, 45000);
        final Car porscheCayman = new Car(scissors, "Cayman", 330, 52000);
        final Car porscheCaymanGT4 = new Car(scissors, "Cayman GT4", 385, 86000);

        final List<Car> mortys = new ArrayList<>();
        mortys.add(audiA3);
        mortys.add(audiA1);
        mortys.add(porscheCayman);
        mortys.add(audiA7);
        mortys.add(audiA8);
        mortys.add(audiA4);
        mortys.add(bmwX3);
        mortys.add(porsche911);
        mortys.add(bmw1);
        mortys.add(audiA6);
        mortys.add(audiA5);
        mortys.add(bmwM4);
        mortys.add(bmw5);
        mortys.add(porscheCaymanGT4);
        mortys.add(bmw3);
        mortys.add(bmw4);
        mortys.add(shitpiss);
        return mortys;
    }

}

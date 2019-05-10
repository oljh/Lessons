package by.bsu.phaser;

import java.util.Queue;
import java.util.concurrent.Phaser;

public class Truck implements Runnable {

    private Phaser phaser;
    private String number;
    private int capacity;
    private Storage storageFrom;
    private Storage storageTo;
    private Queue<Item> bodyStorage;

    @Override
    public void run() {
        loadTruck();
        phaser.arriveAndAwaitAdvance();

        goTruck();
                phaser.arriveAndAwaitAdvance();

    }
}

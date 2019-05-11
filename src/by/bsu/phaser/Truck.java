package by.bsu.phaser;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Phaser;

public class Truck implements Runnable {

    private Phaser phaser;
    private String number;
    private int capacity;
    private Storage storageFrom;
    private Storage storageTo;
    private Queue<Item> bodyStorage;

    public Truck (Phaser phaser, String name, int capacity, Storage stFrom, Storage stTo){
        this.phaser = phaser;
        this.number = name;
        this.capacity = capacity;
        this.bodyStorage = new ArrayDeque<Item>(capacity);
        this.storageTo = stTo;
        this.storageFrom = stFrom;
        this.phaser.register();
    }
    @Override
    public void run() {
        loadTruck();
        phaser.arriveAndAwaitAdvance();

        goTruck();
        phaser.arriveAndAwaitAdvance();

        unlockTruck();
        phaser.arriveAndAwaitAdvance();

    }

    private void loadTruck(){
        for(int i= 0; i<capacity; i++){
            Item g = storageFrom.getGoods();
            if(g == null){ // если в хранилище больше нет товара,
                // загрузка грузовика прерывается
                return;
            }
            bodyStorage.add(g);
            System.out.println("Грузовик " + number + "загрузил товар №" + g.getRegistrationNumber());
            try{
                Thread.sleep(50);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    private void unlockTruck(){
        int size = bodyStorage.size();
        for (int i = 0; i < size; i ++){
            Item g = bodyStorage.poll();
            storageTo.setGood(g);
            System.out.println("Грузовик " + number + " разгрузил товар №" + g.getRegistrationNumber());
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private void goTruck(){
        try{
            Thread.sleep(new Random(100).nextInt(500));








        }catch(InterruptedException e){

        }
    }
}

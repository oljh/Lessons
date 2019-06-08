package by.bsu.phaser;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        //создание коллекции товаров
        Item[] goods = new Item[20];
        for (int i = 0; i < goods.length; i++){
            goods[i]= new Item(i+1);
        }
        List<Item> listGood = Arrays.asList(goods);
        //создание склада из которого забирают товары
        Storage storageA = Storage.createStorage(listGood.size(), listGood);
        //создание склада куда перевозят товары
        Storage storageB = Storage.createStorage(listGood.size());
        //создание фазера для синхронизации движения колонны грузовиков
        Phaser phaser = new Phaser();
        phaser.register();
        int currentPhase;
        //создание колонны грузовиков
        Thread tr1 = new Thread(new Truck(phaser, "tr1", 5, storageA, storageB));
        Thread tr2 = new Thread(new Truck(phaser, "tr2", 6, storageA, storageB));
        Thread tr3 = new Thread(new Truck(phaser, "tr3", 7, storageA, storageB));
        printGoodsToConsole("Товары на складе А", storageA);
        printGoodsToConsole("Товары на складе B", storageA);
        // запуск колонны грузовиков на загрузку на одном складе + поездку +разгрузку на другом складе
        tr1.start();
        tr2.start();
        tr3.start();
        //синхронизация загрузки
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Загрузка колонны завершина. Фаза: " + currentPhase+ "завершена");
        //синхронизация поездки
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Поездка колонны завершина. Фаза: " + currentPhase+ "завершена");
        //синхронизация поездки
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Разгрузка колонны завершина. Фаза: " + currentPhase+ "завершена");
        phaser.arriveAndDeregister();
        if(phaser.isTerminated()){
            System.out.println();
        }
    }

    public static void printGoodsToConsole(String title, Storage storage) {
        System.out.println(title);
        Iterator<Item> goodIterator = storage.iterator();
        while (goodIterator.hasNext()){
            System.out.println(goodIterator.next().getRegistrationNumber()+ "");
        }
    }
}

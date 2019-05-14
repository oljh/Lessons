package by.bsu.phaser;

import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Storage implements Iterable<Item> {
    public static final int DEFAULT_STORAGE_CAPASITY = 20;
    private Queue<Item> goods = null;

    private Storage(int capacity) {
        goods = new LinkedBlockingQueue<Item>(DEFAULT_STORAGE_CAPASITY);
    }

    public static Storage createStorage(int capacity) {
        Storage storage = new Storage(capacity);
        return storage;
    }

    public static Storage createStorage(int capacity, List<Item> goods) {
        Storage storage = new Storage(capacity);
        storage.goods.addAll(goods);
        return storage;
    }


    public Item getGoods() {
        return goods.poll();
    }

    public boolean setGood(Item good) {
        return goods.add(good);
    }

    @Override
    public Iterator<Item> iterator() {
        return goods.iterator();
    }
}


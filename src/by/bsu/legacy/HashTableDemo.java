package by.bsu.legacy;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args){
        Hashtable<Integer, Double> ht = new Hashtable<Integer, Double>(){
            {
                for(int i=0; i<5; i++) ht.put(i, Math.atan(i));
            }
        };
    }
}

package com.simon.collection.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Iterator {
    public static void main(String[] args){
        Collection collection=new ArrayList();
        collection.add("A");
        collection.add("B");
        collection.add("C");

        java.util.Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            String str = (String) iterator.next();
            if(str.equals("A")){
                iterator.remove();
            }
            System.out.println(str);
        }
        System.out.println(collection);
    }
}

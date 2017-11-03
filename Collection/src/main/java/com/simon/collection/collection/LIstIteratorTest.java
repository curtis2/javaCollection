package com.simon.collection.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class LIstIteratorTest {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(10);
        arrayList.add(-9);

   /*  //使用ListIterator倒序迭代
        ListIterator<Integer> listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()){
            Integer previous = listIterator.previous();
            if(previous==2){
                listIterator.add(3);
            }
            System.out.println(previous);
        }
        System.out.println(arrayList);
*/

        //使用ListIterator正序迭代
        ListIterator<Integer> listNextIterator = arrayList.listIterator();
        while (listNextIterator.hasNext()){
            Integer next = listNextIterator.next();
            if(next==2){
                listNextIterator.add(3);
            }
            System.out.println(next);
        }
        System.out.println(arrayList);
    }
}

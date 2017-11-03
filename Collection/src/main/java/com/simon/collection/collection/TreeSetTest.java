package com.simon.collection.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class TreeSetTest {
    public static void main(String[] args){
        TreeSet treeSet=new TreeSet();

        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(10);
        treeSet.add(-9);

        //输出集合元素,已经排序（根据元素的实际大小进行排序）
        System.out.println(treeSet);

        //输出中的第一个元素
        System.out.println(treeSet.first());

        //输出集合中的第最后一个元素
        System.out.println(treeSet.last());

        //输出集合中,大于-9的元素
        System.out.println(treeSet.higher(-9));

        //输出集合中,小于5的元素
        System.out.println(treeSet.higher(5));

        //输出集合中,小于5的所有元素（不包含4）
        System.out.println(treeSet.headSet(5));

        //输出集合中,大于5的所有元素（ 如果set集合中包含5, 那返回的子集中也包含5 ）
        System.out.println(treeSet.tailSet(5));

        //输出集合中,大于1,小于5的子集
        System.out.println(treeSet.subSet(1,5));

//    注意点1：因为TreeSet集合中要使用compareTo方法进行排序，而大多数compareTo方法的实现都要进行类型转换。所以放入TreeSet集合中的元素应该是同一个元素的实例，否则就会导致类型转换异常。
        //throw java.lang.ClassCastException: java.lang.Integer cannot be cast to java.util.Date
       // treeSet.add(new Date());

   //注意点2：当把一个对象加入到TreeSet集合中，TreeSet调用该对象的compareTo(Object obj)方法与容器中的其他对象比较大小，
        // 然后根据红黑树结构找到它的存储位置。如果两个对象通过compareTo(Object obj)方法返回相等，新对象将无法添加到TreeSet集合中。
        System.out.println(treeSet);
        boolean add = treeSet.add(-9);
        System.out.println(add);
        System.out.println(treeSet);

        //定制排序
        TreeSet<M> customCompareTreeSet=new TreeSet<>(new Comparator<M>() {
            @Override
            public int compare(M o1, M o2) {
                return o1.age>o2.age? 1:o1.age<o2.age?-1:0;
            }
        });

        customCompareTreeSet.add(new M(2));
        customCompareTreeSet.add(new M(1));
        customCompareTreeSet.add(new M(3));
        System.out.println(customCompareTreeSet);
    }


    static class M {
        int age;
        public M(int age){
            this.age=age;
        }

        @Override
        public String toString() {
            return age+"";
        }
    }





}

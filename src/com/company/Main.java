package com.company;

import com.entity.Apple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	    List<Apple> list = new ArrayList<>();
	    list.add(new Apple(1,"red","天津",200));
        list.add(new Apple(2,"blue","河北",400));
        list.add(new Apple(3,"red","安徽",300));
        list.add(new Apple(4,"red","杭州",200));
        list.add(new Apple(5,"red","上海",100));

        //1、红色且重量大于200的列表
//        List<Apple> list1 = list.stream().filter(apple -> apple.getColor().equals("red"))
//                .filter(apple -> apple.getWeight()>200)
//                .collect(Collectors.toList());
//        System.out.println(list1.size());
//        System.out.println(list1.toString());


        //2、求每个颜色的平均重量
//        Map<String,List<Apple>> map = new HashMap<>();
//        for (Apple apple : list) {
//            //如果这个key不存在，就创建一个list，如果存在就是当前list。
//            List<Apple> apples = map.computeIfAbsent(apple.getColor(), key -> new ArrayList<>());
//            apples.add(apple);
//        }
//        for (Map.Entry<String, List<Apple>> stringListEntry : map.entrySet()) {
//            int weight = 0;
//            for (Apple apple : stringListEntry.getValue()) {
//                weight+=apple.getWeight();
//            }
//            System.out.println("颜色："+stringListEntry.getKey()+"平均重量"+weight / stringListEntry.getValue().size());
//        }
        //2.1、stream流   求每个颜色的平均重量


    }
}

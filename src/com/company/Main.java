package com.company;

import com.entity.Apple;
import jdk.nashorn.internal.runtime.Source;
import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.security.Key;
import java.time.temporal.ValueRange;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	    List<Apple> list = new ArrayList<>();
	    list.add(new Apple(1,"red","天津",200));
        list.add(new Apple(2,"blue","河北",400));
        list.add(new Apple(3,"red","安徽",300));
        list.add(new Apple(4,"red","杭州",400));
        list.add(new Apple(5,"red","上海",100));

//        list.stream().filter(apple -> apple.getWeight()>=200).limit(2).forEach(apple -> System.out.println(apple));
        //重量降序
//        List<Apple> collect = list.stream().sorted((p1, p2) -> p2.getWeight() - p1.getWeight()).collect(Collectors.toList());
        //按地址排序
//        List<Apple> collect = list.stream().sorted(Comparator.comparing(Apple::getAddr)).collect(Collectors.toList());
        //返回最重的苹果，只返回一个对象
//        Apple apple = list.stream().max(Comparator.comparing(Apple::getWeight)).get();
//        System.out.println(apple);
        //红色的苹果重量+1
//        list.stream().filter(apple -> apple.getColor().equals("red")).forEach(apple -> apple.setWeight(apple.getWeight()+1));
//        System.out.println(list);
        //每个苹果的地址用，连接成一个String
//        String collect = list.stream().map(Apple::getAddr).collect(Collectors.joining(","));
//        System.out.println(collect);
        // 转成map时切记map的key值不能重复
//        Map<String, Apple> collect = list.stream().collect(Collectors.toMap(Apple::getAddr, apple -> apple));
//        collect.forEach((k,v)-> System.out.println("k:"+k+"====v:"+v));

        //按照苹果的重量进行分组，分成key是重量，value是list。
        Map<Integer, List<Apple>> collect1 = list.stream().collect(Collectors.groupingBy(apple -> apple.getWeight()));
        System.out.println(collect1);

//        collect.forEach(apple -> System.out.println(apple));
//        list.forEach(apple -> apple.setWeight(apple.getWeight()+200));
//        list.forEach(apple -> System.out.println(apple));
        //1、红色且重量大于200的列表
//        List<Apple> list1 = list.stream().filter(apple -> apple.getColor().equals("red"))
//                .filter(apple -> apple.getWeight()>200)
//                .collect(Collectors.toList());
//        System.out.println(list1.size());
//        System.out.println(list1.toString());


        //2、求每个颜色的平均重量
//        Map<String,List<Apple>> map = new HashMap<>();
        //基于颜色分组
//        for (Apple apple : list) {
//            //如果这个key不存在，就创建一个list，如果存在就是当前list。
//            List<Apple> apples = map.computeIfAbsent(apple.getColor(), key -> new ArrayList<>());
//            apples.add(apple);
//        }
        //遍历map获取总重量求平均值
//        for (Map.Entry<String, List<Apple>> stringListEntry : map.entrySet()) {
//            int weight = 0;
//            for (Apple apple : stringListEntry.getValue()) {
//                weight+=apple.getWeight();
//            }
//            System.out.println("颜色："+stringListEntry.getKey()+"平均重量"+weight / stringListEntry.getValue().size());
//        }
        //2.1、stream流   求每个颜色的平均重量

//        list.stream()
//                .collect(Collectors.groupingBy(apple -> apple.getColor(),   //基于颜色分组
//                        Collectors.averagingInt(apple -> apple.getWeight())))//统计平均重量
////        System.out.println(collect);  //{red=200.0, blue=400.0}
//        .forEach((k,v)-> System.out.println(k+":"+v));
//        Map<String, Apple> collect = list.stream().collect(Collectors.toMap(Apple::getColor, apple -> apple));
//        System.out.println(collect);

    }
}

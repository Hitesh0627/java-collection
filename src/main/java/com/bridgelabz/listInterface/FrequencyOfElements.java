package com.bridgelabz.listInterface;


import java.util.*;

public class FrequencyOfElements {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");

        for(String ele: list){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }

        for(String ele: map.keySet()){
            System.out.println(ele + "=" + map.get(ele));
        }
    }
}
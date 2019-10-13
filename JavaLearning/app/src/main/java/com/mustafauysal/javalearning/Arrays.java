package com.mustafauysal.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args) {

        String[] myArray = new String[4];

        myArray[0] = "Mustafa";
        myArray[1] = "Hadiye";
        myArray[2] = "Simge";
        myArray[3] = "Begüm";

        System.out.println(myArray[3]);

        int[] myNumberArray = {10,20,30,40,50};

        System.out.println(myNumberArray[3]);

        //List

        ArrayList<String> myMusician = new ArrayList<String>();

        myMusician.add("Mustafa");
        myMusician.add("Hadiye");
        myMusician.add(1,"Simge");
        myMusician.add("Begüm");

        System.out.println(myMusician.get(0));
        System.out.println(myMusician.get(1));
        System.out.println(myMusician.get(2));
        System.out.println(myMusician.get(3));

        //Set

        HashSet<String> mySet = new HashSet<String>();

        mySet.add("Mustafa");
        mySet.add("Mustafa");

        System.out.println(mySet.size());

        //Map

        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("name", "James");
        myHashMap.put("insturment", "Guitar");

        System.out.println(myHashMap.get("name"));

    }
}

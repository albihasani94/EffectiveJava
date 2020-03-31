package com.albi.ch3.item11;

import com.albi.ch3.item10.PhoneNumber;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<PhoneNumber, String> map1 = new HashMap<>();
        map1.put(new PhoneNumber(111, 222, 333), "Jenny");

        // prints out null if hashCode has not been implemented
        System.out.println(map1.get(new PhoneNumber(111, 222, 333)));

        //Using our new PhoneNumber
        Map<PhoneNumberWithHashCode, String> map2 = new HashMap<>();
        map2.put(new PhoneNumberWithHashCode(111, 222, 333), "John");

        System.out.println(map2.get(new PhoneNumberWithHashCode(111, 222, 333)));

    }
}

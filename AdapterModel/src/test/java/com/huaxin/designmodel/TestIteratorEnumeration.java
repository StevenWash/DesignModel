package com.huaxin.designmodel;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class TestIteratorEnumeration {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Adapter");
        Enumeration<String> enumeration = new IteratorEnumeration<String>(list);

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
}

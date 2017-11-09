package com.huaxin.designmodel;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class TestTurkeyAdapter {

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}

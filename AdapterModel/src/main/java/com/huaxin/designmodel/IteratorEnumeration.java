package com.huaxin.designmodel;

import java.util.Enumeration;
import java.util.Iterator;


public class IteratorEnumeration<T> implements Enumeration<T>{

    Iterator<T> iterator;

    public IteratorEnumeration(Iterable<T> iterable){
        this.iterator = iterable.iterator();
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public T nextElement() {
        return iterator.next();
    }
}

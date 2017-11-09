package com.huaxin.designmodel;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationToIterable implements Iterator{
    Enumeration enumeration;

    EnumerationToIterable(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove(){
        throw new UnsupportedOperationException("remove operation not support");
    }
}

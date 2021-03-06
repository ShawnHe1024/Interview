package pers.shawn.interview.designPattern.adapter.enumeratorIterator;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");

        IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(list.iterator());
        while (iteratorEnumeration.hasMoreElements()) {
            System.out.print(iteratorEnumeration.nextElement()+"\t");
        }

    }

}

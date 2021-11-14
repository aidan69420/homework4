package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = getList();
        ArrayList<String> listB = getList();

        Collections.reverse(listB);

        ArrayList<String> listC = new ArrayList<String>();
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println(listC);

        Collections.sort(listC, new SampleComparator());
        System.out.println(listC);
    }
    public static ArrayList getList(){
        ArrayList<String> list = new ArrayList<String>();
        while (list.size() < 5){
            String value = new Scanner(System.in).nextLine();
            list.add(value);
        }
        System.out.println(list);
        return list;
    }
}
class SampleComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return new Integer(o1.length()).compareTo(o2.length());
    }
}
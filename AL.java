package collections1;

import java.util.*;

public class AL {
    public static void main(String[] args) {
        ArrayList<String> al =new ArrayList();
        al.add("chanti");
        al.add("bvenky");
        al.add("subbu");
        System.out.println(al.size());
        System.out.println();
        System.out.println();
        //Collections.sort(al);
        System.out.println(al);
        for(String s:al)
        System.out.println(s);
        System.out.println();
        System.out.println(al.indexOf("chanti"));
        System.out.println(al.get(0));
        Collections.sort(al);
        for(String s:al)
        System.out.println(s);
        System.out.println(Capacity());
        

    }

    private static char[] Capacity() {
        return null;
    }
}

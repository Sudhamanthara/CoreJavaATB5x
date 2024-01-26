package src.arraylist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class lab002 {
    public static void main(String[] args) {
        List <String> courselist = new ArrayList<>();
        courselist.add("BCA");
        courselist.add("MCA");
        courselist.add ("BE");
        courselist.add("B.com");
       // System.out.println(courselist);

        List numlist = new ArrayList();
      //  numlist.add(jkhk);
    numlist.add(890);
    numlist.add(340);
        numlist.add(356);
        courselist.addAll(numlist);
        System.out.println(courselist);

    }

}

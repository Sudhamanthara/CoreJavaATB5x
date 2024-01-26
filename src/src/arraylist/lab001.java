package src.arraylist;

import java.util.ArrayList;
import java.util.List;

public class lab001 {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        mylist.add("Mantharasalam");
        mylist.add("Sudha");
        mylist.add ("Pugazhiniyan");
        mylist.add("Ithalya");
       // mylist.set(2,"SudhaMantharasalam");
       // mylist.remove("SudhaMantharasalam");
               //
        //System.out.println(mylist.size());
        //System.out.println(mylist.get(3));
        for(Object o : mylist){
            System.out.println(o);

        }

    }
}

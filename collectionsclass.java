

import java.util.ArrayList;
import java.util.Collections;
//these two inbuilt in import java.util.*; that's you can also use this 

public class collectionsclass
{
       public static void main(String args[])
       {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        
        System.out.println("Arraylist:"+list);
        Collections.sort(list); //ascending order
        System.out.println("Ascending order sort:"+list);

        //descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order sort:"+list);
       }
}


//Multi-dimensional arraylist--this is same as 2D Array.
// list1:1 2 3 4 5 
//list2:2 4 6 8 10
//list3:3 6 9 12 15

import java.util.*;
public class multidimensional1 
{
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
         
        //list1 for 1 2 3 4 5 
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        mainlist.add(list);
       
        //list2 for 2 4 6 8 10
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);
        list1.add(10);
        mainlist.add(list1);

        //list3 for 3 6 9 12 15
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(6);
        list2.add(9);
        list2.add(12);
        list2.add(15);
        mainlist.add(list2);

        for(int i=0; i<mainlist.size(); i++)
        {
             ArrayList<Integer> currlist=mainlist.get(i);

             for(int j=0; j<currlist.size(); j++)
             {
                System.out.print(currlist.get(j)+" ");
             }
             System.out.println();
        }
        System.out.println(mainlist);
    }
}

import java.util.ArrayList;

public class operations
{
    public static void main(String args[])
    {
    //define array list
      ArrayList<Integer> list = new ArrayList<>();

      //add array element
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5); //TC--O(1)

      //another add function in this arraylist
      list.add(5,9); //TC--O(n)

      System.out.println("add element:"+list);

      //Get operation //TC--O(1)
      int element= list.get(4);
      System.out.println("In given index element is:"+element);
      System.out.println("get element:"+list);

      //Remove element
      list.remove(3);
     System.out.println("remove element:"+list);

      //set element
      list.set(2,10);
      System.out.println("set element:"+list);

      //contains element -- check if a element is exist or not in given arraylist
      System.out.println("element is available or not:"+list.contains(1));
      System.out.println("element is available or not:"+list.contains(11));//11 is not exist in this arraylist
    }
}
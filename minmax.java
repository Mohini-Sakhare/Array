// 
//find the minimum and maximum element of an array
import java.util.*;
public class minmax
{
    public static void main(String args[])
    {
        int a[]={1,23,45,67,86,45,893,0,345,654}; //initialization of array

        //implemented inbuilt function to sort array
        Arrays.sort(a);

        //after sorting the value at 0th position will minimum and
        //nth position will be maximum
        System.out.println("min="+a[0]+", max="+a[a.length-1]);

    }
}

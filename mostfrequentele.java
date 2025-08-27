
// Most frequent element in an array
// Input : arr[] = {1, 3, 2, 1, 4, 1}
// Output : 1
// Explanation: 1 appears three times in array which is maximum frequency.


// Input : arr[] = {10, 20, 10, 20, 30, 20, 20}
// Output : 20 appears four  times in array which is maximum frequency

import java.util.*;
public class mostfrequentele 
{
    public static int mostfrequent(int arr[])
    {
         //sort the array
         Arrays.sort(arr);
         //find the max frequency using linear traversal

         int max_count=1, res=arr[0];
         int curr_count=1;
         for(int i=1; i<arr.length; i++)
         {
            if(arr[i]==arr[i-1])
            {
                curr_count++;
            }
            else{
                curr_count = 1;
            }
            if(curr_count > max_count)
            {
                max_count=curr_count;
                res= arr[i-1];
            }
         }
         return res;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,1,4,1,2};
        
        System.out.println(mostfrequent(arr));
    }
}

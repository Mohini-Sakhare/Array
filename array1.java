
// Input Output and Update of array

import java.util.*;

public class array1 
{ 
    public static void main(String args[])
    {
        int marks[]=new int[100];

        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

       // System.out.println("length of array="+marks.length); used for check array length
        
        System.out.print("Enter physics marks="); // used for input of array
        marks[0]=sc.nextInt(); //physics marks

        System.out.print("Enter chemistry marks=");
        marks[1]=sc.nextInt(); //chemistry marks

        System.out.print("Enter maths marks=");
        marks[2]=sc.nextInt(); //maths marks

        System.out.println("physics :" +marks[0]); // These three lines used for output of array
        System.out.println("Chemistry :" +marks[1]);
        System.out.println("Math :" +marks[2]);
       
                                 //marks[2]=100;              
                                
     int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage:"+percentage+ "%");

        marks[2]=marks[2]+4;
        System.out.println("math:" +marks[2]);  //these two lines used for marks upadation
    }
}

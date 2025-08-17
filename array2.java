

// find largest number  and smallest number in the array

public class array2
{
    public static int getlargest(int num[])
    {
       int largest=Integer.MIN_VALUE;//integer.min_value signify minus(-) infinity
       int smallest=Integer.MAX_VALUE;//integer.max_value signify plus(+) infinity
       for(int i=0; i<num.length; i++)
       {
        if(largest<num[i])
        {
            largest=num[i];
       }
       if(smallest>num[i])
       {
          smallest=num[i];
       }
     }
    System.out.println("smallest value is:" +smallest);
    return largest;
    }
    
    public static void main(String args[])
    {
        int num[]={1,3,5,7,9};
        System.out.println("largest value is:" +getlargest(num));
    }
    
}

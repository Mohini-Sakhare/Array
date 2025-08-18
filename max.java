
//print the maximum subarray sum-1 (Brute Force)

public class max 
{
   public static void maxsumsubarray(int num[])
   {
    int currsum=0;
    int max=Integer.MIN_VALUE;
    
    for(int i=0; i<num.length; i++)
    {
        int start=i;
        for(int j=i; j<num.length; j++)
        {
            int end=j;
            currsum=0;
            for(int k=start; k<=end; k++)
            {
                currsum=currsum+num[k];
            }
            System.out.println(currsum);
            if(max<currsum)
            {
               max=currsum;
            }
           
        }
        System.out.println();
    }
    System.out.println("Maximum of sum="+max);

   }
   public static void main(String args[])
   {
    int num[]={2,4,6,8};
    maxsumsubarray(num);
   } 
}

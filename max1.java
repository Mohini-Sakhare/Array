

// print max subarray sum (prefix sum)

public class max1 
{
    public static void maxsumsubarray(int num[])
   {
    int currsum=0;
    int max=Integer.MIN_VALUE;
    int prefix[]=new int[num.length];
    
    prefix[0]=num[0];
    //calculate prefix array
    for(int i=1; i<prefix.length; i++)
    {
        prefix[i]=prefix[i-1]+num[i];
    } 
    for(int i=0; i<num.length; i++)
    {  
        int start=i;
        for(int j=i; j<num.length; j++)
        {
            int end=j;
            currsum= start==0?prefix[end]: prefix[end]-prefix[start-1];
            
            if(max<currsum)
            {
               max=currsum;
            }
           
        }
        
    }
    System.out.println("Maximum of sum="+max);

   }
   public static void main(String args[])
   {
    int num[]={1,-2,6,-1,3};
    maxsumsubarray(num);
   }     
}

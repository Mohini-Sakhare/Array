public class kadane 
{
    public static void kadanes(int num[])
    {
      int ms=Integer.MIN_VALUE;
      int cs=0;

      for(int i=0; i<num.length; i++)
      {
        cs=cs+num[i];
        if((ms<cs))
        {
            ms=cs;
            
        }
        // System.out.println("print current sum:"+cs);
        
        ms=Math.max(cs,ms);
      }
      
      System.out.println("our max subarray sum is:"+ms);
    }
    public static void main(String args[])
    {
        int num[]={-1,-2,-3,-4};
        kadanes(num);
    }    
}

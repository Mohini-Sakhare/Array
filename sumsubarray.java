
//print the sum of subarrays

public class sumsubarray 
{
  public static void sumofsubarrays(int num[])
  {
    int currsum=0;
    for(int i=0; i<num.length; i++)
    {
        int start=i;
        for(int j=i; j<num.length; j++)
        {
            int end=j;
            for(int k=start; k<=end; k++)
            {
               currsum=currsum+num[k];
            }
            System.out.println("current sum="+currsum);
        }
        
    }
  }
  public static void main(String args[])
  {
    int num[]={2,4,6,8,10};
    sumofsubarrays(num);
  }    
}


// Creation of 2D array matric

import java.util.*;
public class matricreation
{
    public static void main(String args[])
    {
        int matrix[][]=new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number i.e.int[3][3]=9 :");
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<m; j++)
                {
                    matrix[i][j]=sc.nextInt();
                }
            }
        
        
        //output
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
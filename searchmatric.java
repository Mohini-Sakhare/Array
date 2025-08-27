
// element search in 2D Array Matrics

import java.util.*;

public class searchmatric 
{
    public static boolean search(int matrix[][], int key)
    {
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("key is found at cell("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key is not found");
        return false;
    }
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
        search(matrix, 5);
    }
}


import java.util.*;
public class operation
{
    public static void main(String args[])
    {
        int marks[]=new int[100];
        Scanner obj=new Scanner(System.in);
       
        //user input of student marks
        System.out.print("Enter physics marks:");
        marks[0]=obj.nextInt();
       

        System.out.print("Enter chemistry marks:");
        marks[1]=obj.nextInt();
       

        System.out.print("Enter math marks:");
        marks[2]=obj.nextInt();
        
       //user output of student marks
        System.out.println("physics:"+marks[0]);
        System.out.println("Chemistry:"+marks[1]);
        System.out.println("math:"+marks[2]);
       
        //updation of student marks
        marks[2]=marks[2]-7;
        System.out.println("updated math marks:"+marks[2]);

        //calculate the percentage of student marks
        int per=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage:"+per+"%");

    }
}
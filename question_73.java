/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
import java.util.*;
public class question_73 {
     public static void main(String[]arg)
    {
        Scanner input = new Scanner (System.in);
        int n;
        System.out.println("Enter the value to add up to ");
        n=input.nextInt();
        int sum=0,v=0;
         for(int i=1;i<=n;i++)
        {
            for(int j =1;j<=i;j++)
            {
                
               sum=sum+j;
        
            }
             System.out.printf(sum+",");
             
           sum=0;
        }
}
} 


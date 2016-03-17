
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
public class question_53 {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int number;
                int total=0;
                
               		

		System.out.println("I will add up the numbers you give me.");
		System.out.print("Number: ");
		number= keyboard.nextInt();
		while(number!=0)
                {
                    total= total + number;
                     System.out.println("The total so far is "+" "+total);
                    System.out.println("Number:");
		number= keyboard.nextInt();
                }
                System.out.print("The total is"+" "+total);

	}
}

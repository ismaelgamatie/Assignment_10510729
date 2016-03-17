
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
public class question_57 {
public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double n;
		int number ;
                

		System.out.println( "SQUARE ROOT " );
                System.out.println("Enter a number");
		number= keyboard.nextInt();
                n=number*number;
                while(number<0)
                {
                System.out.print( "You can't take the square root of a negative number, silly.");
                number= keyboard.nextInt();
                }
                    System.out.print( "The square root of "+number+"is "+ n );
                
        }
}
		
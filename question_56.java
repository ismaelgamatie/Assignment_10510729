
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
public class question_56 {
    public static void main (String[] args)
    {
        System.out.println("Here comes the dice!!!");
        Random r= new Random();
        int roll1=1+r.nextInt(6);
        int roll2=1+ r.nextInt(6);
        int total= roll1+roll2;
        do{
        System.out.println("Roll #1:"+roll1);
        System.out.println("Roll #2:"+roll2);
        System.out.println("The total is :"+total);
        } while(roll1!=roll2);
        
}

}

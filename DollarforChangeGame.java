//09.17.2015

import java.util.Scanner;
public class DollarforChangeGame
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an item's cost: $");
        double inputVal = keyboard.nextDouble();
        
        double total = inputVal * 100;
        double total1 = total%100;
        
        double dollar = (total-total1)/100;
        double total2 = total1%25;
        
        double quarter = (total1-total2)/25;
        double total3 = total2%10;
        
        double dimes = (total2-total3)/10;
        double cents = total3%5;
        
        double nickels = (cents-total3)/5;
        
       
        System.out.println(dollar+" dollars");
        System.out.println(quarter+" quarters");
        System.out.println(dimes+" dimes");
        System.out.println(nickels+" nickels");
        System.out.println(cents+" cents");
    }
}
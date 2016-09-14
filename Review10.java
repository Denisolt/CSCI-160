import java.util.Scanner;
public class Review10
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an item's cost: $");
        int inputVal = keyboard.nextInt();
        makeChange(inputVal);
    }
    
    public static void makeChange(int inputVal)
    {
        int total1 = inputVal%100;
        int dollar = (inputVal-total1)/100;
        int total2 = total1%25;
        int quarter = (total1-total2)/25;
        int total3 = total2%10;
        int dimes = (total2-total3)/10;
        int cents = total3%5;
        int nickels = (cents-total3)/5;
         System.out.println(dollar+" dollars");
        System.out.println(quarter+" quarters");
        System.out.println(dimes+" dimes");
        System.out.println(nickels+" nickels");
        System.out.printf(cents+" cents");
    }
}
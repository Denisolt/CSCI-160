/****************************************************
 *Project Inormaiton
 *Course: CSCI 185/504 Spring 2016
 *Project Name: Project #1
 *File Name: Trade
 *Author: 
 *Date Created: 02/05/2016
 *Date Updated: 02/19/2016 There are some changes for the class wallStreet where a new class or variable has been added.
 *Description: This project will allow the user to enter his choice and select his company to trade with (Dow Joend, NASDAQ, and S&P 500)
 *             The project will print out the number of shares and the toatal price.
 *****************************************************************************************************************************************/
import java.util.Scanner;
public class Trade
{
    public static void main(String [] args)
    {
        wallStreet dowObject = new wallStreet();
        wallStreet nasObject = new wallStreet();
        wallStreet spObject = new wallStreet();
        wallStreet main = new wallStreet();
        String company = "";
        do
        {
            System.out.println("enter DOW");
            System.out.println("enter NAS ");
            System.out.println("enter SP");
            System.out.print("select your choice: ");
            Scanner keyboard = new Scanner (System.in);
            company = keyboard.nextLine();

            dowObject.currentDow = 22;
            dowObject.closePriceDow = 25;
            dowObject.openPriceDow = 18;
            dowObject.lowPriceDow = 30;

            nasObject.currentNas  = 5;
            nasObject.closePriceNas = 15;
            nasObject.openPriceNas= 1;
            nasObject.lowPriceNas = 29;

            spObject.currentSp = 45;
            spObject.closePriceSp = 6;
            spObject.openPriceSp = 16;
            spObject.lowPriceSp = 12;

            nasObject.marketPlace(company);
            dowObject.marketPlace(company);
            spObject.marketPlace(company);
        }
        while (company.equalsIgnoreCase("DOW")||company.equalsIgnoreCase("NAS")||company.equalsIgnoreCase("SP"));
        System.out.println();
        System.out.println("Dow Jones: "+dowObject.numberOfSharesDow + " shares with price: $"+ dowObject.totalPriceforDow);
        System.out.println("NASDAQ:  "+nasObject.numberOfSharesNas + " shares with price: $"+ nasObject.totalPriceforNas);
        System.out.println("S&P 500:  "+spObject.numberOfSharesSP + " shares with price: $"+ spObject.totalPriceforSP);
        int totalshares = spObject.numberOfSharesSP + dowObject.numberOfSharesDow +nasObject.numberOfSharesNas;
        int totalprice = spObject.totalPriceforSP + dowObject.totalPriceforDow + nasObject.totalPriceforNas;
        System.out.println("The total number of shares for all stocks:  " + totalshares);
        System.out.println("The total price of all stocks: $" + totalprice);
    }
}

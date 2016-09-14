//Denisolt Shakhbulatov
public class CreditCard
{
    private Money balance;
    private Money creditLimit;
    private Person owner;
    public CreditCard(Person newCardHolder, Money limit)
    {
        owner = newCardHolder;
        creditLimit = limit; 
        balance = new Money(0.0);
    }

    public Money getBalance()
    {
        return balance;
    }

    public Money getCreditLimit()
    {
        return creditLimit;
    }

    public String getPersonals()
    {
        return owner.toString();
    }

    public void charge(Money amount)
    {   balance = amount.add(balance);
        if(balance.compareTo(creditLimit)==1)
        {
            System.out.println("Exceeds credit limit");
            balance = balance.subtract(amount);
        }
        else
        {
            System.out.println("Charge: " + amount);
        }
    }

    public void payment(Money amount)
    {
        if(amount.compareTo(balance)==1)
            System.out.println("Not enough money on the card" );
        else
        {
            System.out.println("Payment: " + amount);
            balance = balance.subtract(amount);
        }
    }
}
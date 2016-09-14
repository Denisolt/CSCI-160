public abstract class BuyPolicy
{
  public abstract BuyPolicy calculateBuy();
}
public class SubClass extends BuyPolicy
{
  @Override
  public SubClass getSelf()
  {
    return numOfShares*sharePrice;
  }
}
    
    numOfProfitableShares = numOfShares/n;
    total = numOfProfitableShares * sharePrice;
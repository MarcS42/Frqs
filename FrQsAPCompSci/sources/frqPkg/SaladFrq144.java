package frqPkg;

public class SaladFrq144 implements MenuItemFrq144 {
  
  private String name;
  private double price;

  public SaladFrq144(String name, double price)
  {
    this.name=name;
    this.price=price;
  }
  
  @Override
  public String getName()
  {
    return name;
  }

  @Override
  public double getPrice()
  {
    return price;
  }

}

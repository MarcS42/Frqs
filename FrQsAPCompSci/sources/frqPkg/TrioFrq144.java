package frqPkg;

public class TrioFrq144 implements MenuItemFrq144 {
  
  private SandwichFrq144 sandwich;
  private SaladFrq144 salad;
  private DrinkFrq144 drink;
  private String trioName;
  private double trioPrice;
  
  public TrioFrq144(SandwichFrq144 sWich, SaladFrq144 sal, DrinkFrq144 dk)
  {
    this.sandwich=sWich;
    this.salad=sal;
    this.drink=dk;
    
    trioName=sandwich.getName()+"/"+ salad.getName()+"/"+drink.getName()+" Trio";
    
    double minPrice=Math.min(Math.min(sandwich.getPrice(), salad.getPrice()),drink.getPrice());
    trioPrice= sandwich.getPrice()+salad.getPrice()+drink.getPrice()-minPrice;
  }

  @Override
  public String getName()
  {
    return trioName;
  }

  @Override
  public double getPrice()
  {
    return trioPrice;
  }
  
  public String toString(double trioPrice)
  {
    String trioPriceS=String.format(" $%.2f", trioPrice);
    return trioPriceS;
  }

  public static void main(String[] args)
  {
    SandwichFrq144 sWich1=new SandwichFrq144("Cheeseburger", 2.75);
    SandwichFrq144 sWich2=new SandwichFrq144("Turkey Sandwich", 2.75);
    SaladFrq144 sal1=new SaladFrq144("Spinach Salad", 1.25);
    SaladFrq144 sal2=new SaladFrq144("Coleslaw", 1.25);
    DrinkFrq144 dk1=new DrinkFrq144("Orange Soda", 1.25);
    DrinkFrq144 dk2=new DrinkFrq144("Cappuccino", 3.50);
    
    TrioFrq144 trio1 = new TrioFrq144(sWich1, sal1, dk2);
    TrioFrq144 trio2 = new TrioFrq144(sWich2, sal2, dk1);
    System.out.println("Trio1:= "+trio1.trioName+" $"+trio1.trioPrice);
    System.out.print("Trio2:= "+trio2.trioName);
    System.out.printf(" $%.2f", trio2.trioPrice);
  
  }

}

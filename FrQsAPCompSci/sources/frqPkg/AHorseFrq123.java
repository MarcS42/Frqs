package frqPkg;

public class AHorseFrq123 implements HorseFrq123 {
  
  private String name;
  private int weight;
  
  public AHorseFrq123(String name,int weight)
  {
    this.name=name;
    this.weight=weight;
  }
  
  @Override
  public String getName()
  {
    // TODO Auto-generated method stub
    return name;
  }

  @Override
  public int getWeight()
  {
    // TODO Auto-generated method stub
    return weight;
  }
  
  public String toString()
  {
    return name+"/"+weight;
  }

  public static void main(String[] args)
  {
    

  }

}

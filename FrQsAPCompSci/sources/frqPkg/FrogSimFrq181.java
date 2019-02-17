package frqPkg;

public class FrogSimFrq181 {
  
  private int maxHops;
  private int distanceGoal;
  
  public FrogSimFrq181(int distance, int maxHops)
  {
    this.maxHops=maxHops;
    this.distanceGoal=distance;
  }
  
  private int hopDistance()
  {
    return (int)(Math.random()*15-3);
  }
  
  public boolean simulate()
  {
    int curDist=0;
    for(int hop=1; hop <= maxHops; hop++)
    {
      curDist +=hopDistance();
//      System.out.print(curDist+" ");
      if(curDist < 0) return false;
    }
    if(curDist >= distanceGoal) return true;
    else return false;
  }
  
  public double runSimulations(int num)
  {
    double count=0;
    for(int i=1; i <=num; i++)
    {
      if(simulate())
      {
        count++;
      }
    }
    System.out.println(count/num);
    return count/num;
  }

  public static void main(String[] args)
  {
    FrogSimFrq181 f1 = new FrogSimFrq181(24,6);
    System.out.println(f1.runSimulations(400));

  }

}

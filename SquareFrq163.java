package frqPkg;

public class SquareFrq163 {
  
  private String color;
  private int num;

  public SquareFrq163(boolean isBlack, int num)
  {
    String white="White", black="Black";
    if(isBlack)
    {
      color=black;
      this.num=0;
    }else 
    {
      color=white;
      this.num=num;
       }
  }

  public int getNum()
  {
    return num;
  }

  public void setNum(int num)
  {
    this.num = num;
  }

  public String getColor()
  {
    return color;
  }
  
  public String toString()
  {
    return getColor() + getNum();
  }
  
}

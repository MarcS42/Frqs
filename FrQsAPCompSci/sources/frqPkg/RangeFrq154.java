package frqPkg;

public class RangeFrq154 implements NumberGroup154{
  
  private int min;
  private int max;
  private int[] range;
  
  public RangeFrq154(int start, int end)
  {
    this.min=start;
    this.max=end;
    this.range= new int[max-min+1];
    int i=0,wMin=min;
    while(i < (max-min+1))
    {
      range[i]=wMin++;
      i++;
    }
  }
  
  public boolean contains(int num)
  {
    for(int r:range)
    {
      if(r==num) return true;
    }
    return false;
  }

  public static void main(String[] args)
  {
    /**
     * Note that since rangeTest below is declared of Type NumberGroup154,
     * you cannot access the int[] range instance variable to print, etc
     * as Parent Types do not have access to Child inst.vars or 
     * methods(other than contains()).
     */
    NumberGroup154 rangeTest = new RangeFrq154(3,7);
    System.out.println(rangeTest.contains(7));


  }

}

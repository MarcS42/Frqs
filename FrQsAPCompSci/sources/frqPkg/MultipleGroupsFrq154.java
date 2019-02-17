package frqPkg;

import java.util.ArrayList;
import java.util.List;

public class MultipleGroupsFrq154 implements NumberGroup154 {
  
  private List<NumberGroup154> groupList;

  public MultipleGroupsFrq154(NumberGroup154 group0, NumberGroup154 group1,NumberGroup154 group2)
  {
    groupList= new ArrayList<NumberGroup154>();
    groupList.add(group0);
    groupList.add(group1);
    groupList.add(group2);
  }
  
  @Override
  public boolean contains(int num)
  {
    for(NumberGroup154 nG:groupList)
    {
      if(nG.contains(num))return true; 
    }
    return false;
  }

  public static void main(String[] args)
  {
    MultipleGroupsFrq154 mTG1 = new MultipleGroupsFrq154(new RangeFrq154(5,8), new RangeFrq154(10,12),new RangeFrq154(1,6));
    System.out.println(mTG1.contains(2));
    System.out.println(mTG1.contains(9));
    System.out.println(mTG1.contains(6));

  }

}

package frqPkg;

import java.util.ArrayList;

public class DigitsFrq171 {
  
  private ArrayList<Integer> digits;
  
  public DigitsFrq171(int num) {
    digits=new ArrayList<>();    
    String numString=""+num;
    for(int i=0; i < numString.length(); i++)
    {
      digits.add(Integer.valueOf(numString.substring(i, i+1)));
    }
  }
  
  public boolean isStrictlyIncreasing()
  {
    for(int  i=0; i<digits.size()-1; i++)
    {
      if(!(digits.get(i)<digits.get(i+1)))
      {
        return false;
      }
    }
      return true;
  }


  public static void main(String[] args)
  {
    DigitsFrq171 cowboy=new DigitsFrq171(165);
    System.out.println(cowboy.digits);//Can print directly as AbstractCollections has a toString method that prints ArraList's
    System.out.println("Is Strictly increasing? "+cowboy.isStrictlyIncreasing());

  }

}

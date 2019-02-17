package frqPkg;

public class SelfDivisorFrq071 {
  
  public static boolean selfDivisor(int num)
  {
    int digit=0, wNum=num, count=0;
    String sNum=""+num;
    if(sNum.contains("0")) return false;
    for(int i=0;i<sNum.length();i++)
    {
      digit=wNum%10;
      if(num%digit==0)
      {
        count++;
      }
      wNum/=10;
    }
    if(count==sNum.length()) return true;
    return false;
  }
  
  /** @param start starting point for values to be checked
   *  Precondition: start > 0
   *  @param num the size of the array to be returned
   *  Precondition: num > 0
   *  @return  an array containing the first num integers ≥ start
   *           that are self-divisors
   */
  public static int[] firstNumSelfDivisors(int start, int num)
  {
    /* to be implemented in part (b) */
    int[] selfDivisors= new int[num];
    int i=0;
    while(i<num)
    {
      if(selfDivisor(start))
      {
        selfDivisors[i++]=start;
      }
      start++;
    }
    return selfDivisors;
  }

  public static void main(String[] args)
  {
    System.out.println(selfDivisor(155));
    int[] printMe=firstNumSelfDivisors(371, 10);
    for(int sdiv:printMe)
    {
      System.out.print(sdiv+" ,");
    }
  }

}

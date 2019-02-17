package frqPkg;

public class CodeWordCheckerFrq183 implements StringCheckerFrq183 {
  
  private int minLen;
  private int maxLen;
  private String notAllowed;
  
  public CodeWordCheckerFrq183(int min, int max, String str)
  {
    minLen=min;
    maxLen=max;
    notAllowed=str;
  }
  
  public CodeWordCheckerFrq183(String notMe)
  {
    minLen=6;
    maxLen=20;
    notAllowed=notMe;
  }

  
  @Override
  public boolean isValid(String str)
  {
    if(!(str.indexOf(notAllowed)>=0) && str.length()>=minLen && str.length()<=maxLen) return true;
    return false;
  }

  public static void main(String[] args)
  {
    CodeWordCheckerFrq183 cwc1 = new CodeWordCheckerFrq183(6,8,"!");
    CodeWordCheckerFrq183 cwc2 = new CodeWordCheckerFrq183("$");
    System.out.println("Is Eugenie! valid(cwc2)? "+ cwc2.isValid("Eugenie!"));
    System.out.println("Is Eugenie! valid(cwc1)? "+ cwc1.isValid("Eugenie!"));
  }

}

package frqTests;

import frqPkg.RandomLetterChooserFrq161;
import frqPkg.RandomStringChooserFrq161;

public class TestRandStrCsrFrq161 {

  public static void main(String[] args)
  {
    String str = "noPqrStuv";
    String[] wordArray= {"the","quick","brown","fox","jumps","over","the","lazy","dog"};
    RandomStringChooserFrq161 rsc1 = new RandomStringChooserFrq161(wordArray);
    for(int i = 0; i < 11; i++)
    {
      System.out.print(rsc1.getNext()+" ");
    }
    System.out.println();
    RandomLetterChooserFrq161 rlc1 = new RandomLetterChooserFrq161(str);
    for(int i = 0; i < 11; i++)
    {
      System.out.print(rlc1.getNext()+" ");
    }

  }

}

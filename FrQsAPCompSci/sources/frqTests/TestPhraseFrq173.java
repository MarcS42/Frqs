package frqTests;

import frqPkg.PhraseFrq173;

public class TestPhraseFrq173 {

  public static void main(String[] args)
  {
    PhraseFrq173 ph1 = new PhraseFrq173("aaaa");
    int lastAa=ph1.findLastOccurrence("bb");
//    ph1.replaceNthOccurrence("aa", 2, "bbb");
    System.out.println("aaaa; last \"bb\" = " + lastAa);
//    System.out.println("aaaa; replace second \"aa\" with \"bbb\" = " + ph1);

  }

}

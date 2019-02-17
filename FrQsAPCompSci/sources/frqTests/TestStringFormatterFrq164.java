package frqTests;

import java.util.Arrays;
import java.util.List;
import frqPkg.StringFormatterFrq164;

public class TestStringFormatterFrq164 {

  public static void main(String[] args)
  {
    List<String> words= Arrays.asList("Beach","Ball");
//    words.add("Don't");
//    words.add("throw");
//    words.add("out");
//    words.add("baby");
//    words.add("with");
//    words.add("bath");
//    words.add("water.");
    
    int formattedLen=20;
    
    System.out.println("FormattedLength:= "+formattedLen);
    System.out.println("Beach Ball:= "+StringFormatterFrq164.totalLetters(words));
    System.out.println("BasicGapWidth:= "+StringFormatterFrq164.basicGapWidth(words, formattedLen));
    System.out.println("LeftOverSpaces:= "+StringFormatterFrq164.leftOverSpaces(words, formattedLen));
    System.out.println("StringFormatterOut:= "+StringFormatterFrq164.format(words, formattedLen));
  }

}

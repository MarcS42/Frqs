package frqPkg;

import java.util.*;

public class StringFormatterFrq164 {

  public static int totalLetters(List<String> wordList)
  {
    int sum=0;
    for(String word:wordList)
    {
      sum+=word.length();
    }
    return sum;
  }
  
  public static int basicGapWidth(List<String> wordList, int formattedLen)
  {
    if(formattedLen  <= totalLetters(wordList)) return -1;
    int wordLetters= totalLetters(wordList), gaps=wordList.size()-1;
    int basicGapWidth=(formattedLen-wordLetters)/gaps;
    return basicGapWidth;
  }
  
  public static int leftOverSpaces(List<String> wordList, int formattedLen)
  {
    int leftOverSpaces=0;
    if(wordList.size()>2)
    {
      leftOverSpaces=formattedLen-totalLetters(wordList)-basicGapWidth(wordList, formattedLen)*(wordList.size()-1);
    }
    return leftOverSpaces;
  }
  
  /**
   * Problem is that you need to convert basicGapWidth(int)
   * and leftOverSpaces into strings so that you
   * can add them into print statement.
   * 
   * Also need to manage last word in wordlist as it 
   * does not have a basicGapWidth after it.
   * 
   * @param wordList
   * @param formattedLen
   * @return
   */
  public static String format(List<String> wordList, int formattedLen)
  {
    String ans="", sGapWidth="", sLeftO=" ";
    int gaps= wordList.size()-1;
    int gapWidth =basicGapWidth(wordList, formattedLen), 
        leftOver=leftOverSpaces(wordList, formattedLen);
    if(gapWidth==-1) return "FormatLength too short";
    /**
     * converts basicGapWidth to string of spaces
     */
    for(int gw=0; gw<gapWidth;gw++)
    {
      sGapWidth+=" ";
    }
    int i=0;
    while(i<wordList.size())
    {
      while(gaps>0)
      {
        if(leftOver>0)
        {
          ans += wordList.get(i++)+sGapWidth+sLeftO;
          leftOver--;
        }else {
          ans+=wordList.get(i++)+sGapWidth;
        }
        gaps--;
      }
      ans+=wordList.get(i++);
      }
    return ans;
  }
  
}

package frqPkg;

import java.util.ArrayList;
import java.util.List;

public class ScrambledWordFrq141 {
  
  
  
  /** Scrambles a given word.
   * @param word the word to be scrambled 
   * @return the scrambled word (possibly equal to word) 
   * Precondition: word is either an empty string 
   * or contains only uppercase letters. 
   * Postcondition: the string returned was 
   * created from word as follows: 
   * -  the word was scrambled, beginning at the first letter and continuing from left to right
   * -  two consecutive letters consisting of "A" followed by a letter that was not "A" were swapped
   * -  letters were swapped at most once
  */
  public static String scrambleWord(String word)
  {
    if(word.equals("") || word.indexOf("A")==word.length()-1 || !word.contains("A")) return word;
    String scrambled="";
    for(int i =0; i<word.length()-1; i++)
    {
      if(word.substring(i, i+1).equals("A") && !word.substring(i+1, i+2).equals("A"))
      {
        scrambled+=word.substring(i+1, i+2)+"A";
        i++;
      }else {
        scrambled+=word.substring(i, i+1);
      }
    }
    if(scrambled.length() != word.length())
    {
      scrambled+=word.substring(word.length()-1);
    }
    return scrambled;
  }
  
  /** Modifies wordList by replacing each word with its scrambled * version, removing any words that are unchanged as a result of scrambling. * @param wordList the list of words * Precondition: wordList contains only non-null objects
  * Postcondition:
  * - all words unchanged by scrambling have been removed from wordList
  * - each of the remaining words has been replaced by its scrambled version
  * - the relative ordering of the entries in wordList is the same as it was
  *   before the method was called
  */
  public static void scrambleOrRemove(List<String> wordList)
  {
    for(int i = wordList.size()-1; i>=0; i--)
    {
      if(scrambleWord(wordList.get(i)).equals(wordList.get(i)))
      {
        wordList.remove(wordList.get(i));
      }else {
        wordList.set(i, scrambleWord(wordList.get(i)));
      }
    }
  }

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
//    String word="WHOA";
//    String word="EGGS";
//    String word="";
//    String word="TAN";
//    String word="A";
//    String word="ABRACADABRA";
//    System.out.println("Word:= " + word+" scrambled:= "+ scrambleWord(word));
    String[] wordS= {"WHOA", "EGGS","","TAN", "A", "ABRACADABRA"};
    List<String> wordList = new ArrayList<String>();
    for(String word:wordS)
    {
      wordList.add(word);
    }
    System.out.println("WHOA, "+ "EGGS, "+""+" TAN, "+ "A, "+ "ABRACADABRA equals:= "); 
    scrambleOrRemove(wordList);
    System.out.print(wordList);

  }

}

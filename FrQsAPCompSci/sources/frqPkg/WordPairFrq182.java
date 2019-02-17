package frqPkg;

import java.util.ArrayList;

public class WordPairFrq182 {
  
  private ArrayList<WordPairsFrq182> allPairs;
  
  public WordPairFrq182(String[] words) {
    allPairs= new ArrayList<>();    
    for(int i=0; i<words.length-1;i++)
    {
      for(int j=i+1; j<words.length; j++)
      {
        allPairs.add(new WordPairsFrq182(words[i],words[j]));
      }
    }
  }
  
  public int numMatches()
  {
    int count=0;
    for(int i=0; i<allPairs.size(); i++)
    {
      if(allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond()))
      {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args)
  {
    String[] words= {"the", "more", "the", "merrier"};
    WordPairFrq182 wp1 =new WordPairFrq182(words);
    System.out.println(wp1.allPairs+"\n"+ wp1.numMatches());
    

  }

}

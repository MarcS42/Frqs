package frqPkg;

public class RandomStringChooserFrq161 {
  
  private String[] words;
  private boolean[] isUsed;
  private int count;

  public RandomStringChooserFrq161(String[] wordArray)
  {
    this.words=wordArray;
    isUsed=new boolean[words.length];
    count=0;
  }
  
  public String getNext()
  {
    int index;
    
    if(count>=words.length) return "NONE";
    
    /**
     * do not forget parentheses after cast to int
    */
    index=(int)(Math.random()*words.length);
    while(isUsed[index])
    {
      index=(int)(Math.random()*words.length);
    }
    isUsed[index]=true;
    count++; //count is an instance variable; needs to be here.
    return words[index];
  }
}

package frqPkg;

public class PhraseFrq173 {
  
  private String currentPhrase;
  
  public PhraseFrq173(String ph)
  {
    currentPhrase=ph;
  }
  
  public int findNthOccurrence(String str, int n)
  {
    int indexOf=-1, i=0;
    if(n==0 || currentPhrase.indexOf(str)<0) return indexOf;
    
    while(n>0 && currentPhrase.indexOf(str,i)>=0)
    {
      indexOf=currentPhrase.indexOf(str,i);
      n--;
      i=indexOf+1;
    }
    
    if(n!=0)
    {
      indexOf=-1;
    }
    return indexOf;
  }
  
  public void replaceNthOccurrence(String str, int n, String repl)
  {
    int strlen=str.length();
    int insertionPt = findNthOccurrence(str, n);
    if(!(insertionPt < 0))
    {
      if(insertionPt != 0)
      {
       String beginning = currentPhrase.substring(0,insertionPt);
       String end= currentPhrase.substring(insertionPt+strlen);    
       currentPhrase= beginning+ repl+ end;
      } else
      {
        currentPhrase= repl+currentPhrase.substring(insertionPt+strlen);
      }
    }
  }
  
  public int findLastOccurrence(String str)
  {
    int indexOf=-1;
    if(currentPhrase.indexOf(str)<0) return indexOf;
    return currentPhrase.lastIndexOf(str);
  }

  @Override
  public String toString()
  {
    return currentPhrase;
  }
  
  
  
}  


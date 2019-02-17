package frqPkg;

public class WordPairsFrq182 {
  private String first;
  private String second;

  public WordPairsFrq182(String first, String second) {
    this.first=first;
    this.second=second;
  }

  public String getFirst()
  {
    return first;
  }

  public String getSecond()
  {
    return second;
  }

  public String toString()
  {
    String out="";
    {
      out = "(" + getFirst() +", "+ getSecond()+ ")";
      return out;
    }
  }

}

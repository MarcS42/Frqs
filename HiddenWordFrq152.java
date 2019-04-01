package frqPkg;

public class HiddenWordFrq152 {
  
  private String hiddenWord;
  
  public HiddenWordFrq152(String word)
  {
    hiddenWord=word;
  }
  
  public String getHint(String guess)
  {
    String hint="", gLtr, hWLtr;
    for(int i=0; i<hiddenWord.length();i++)
    {
      gLtr=guess.substring(i, i+1);
      hWLtr=hiddenWord.substring(i, i+1);
      if(hiddenWord.indexOf(gLtr)<0)
      {
        hint+="*";
      }else if(hiddenWord.indexOf(gLtr)>=0 && !gLtr.equals(hWLtr))
      {
        hint+="+";
      }else if(hWLtr.equals(gLtr))
      {
        hint+=gLtr;
      }
    }
    return hint;
  }

  public static void main(String[] args)
  {
    HiddenWordFrq152 quest= new HiddenWordFrq152("HARPS");
    System.out.println("Quest(\"HARPS\") of Guess(\"AAAAA\"):= "+ quest.getHint("AAAAA"));
    System.out.println("Quest(\"HARPS\") of Guess(\"HELLO\"):= "+ quest.getHint("HELLO"));
    System.out.println("Quest(\"HARPS\") of Guess(\"HEART\"):= "+ quest.getHint("HEART"));
    System.out.println("Quest(\"HARPS\") of Guess(\"HARMS\"):= "+ quest.getHint("HARMS"));
    System.out.println("Quest(\"HARPS\") of Guess(\"HARPS\"):= "+ quest.getHint("HARPS"));
  }

}

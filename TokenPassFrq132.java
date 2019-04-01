package frqPkg;

import java.util.Arrays;

public class TokenPassFrq132 {
  private int[] board; 
  private int currentPlayer;
  
  /** Creates the board array to be of size 
   * playerCount and fills it with 
   * random integer values from 1 to 
   * 10, inclusive. Initializes currentPlayer 
   * to a random integer value in the range 
   * between 0 and playerCount-1, inclusive. 
   *  @param playerCount the number of players 
   */
  public TokenPassFrq132(int playerCount)
  { /* to be implemented in part (a) */ 
    board = new int[playerCount];
    for(int i=0; i<board.length; i++)
    {
      board[i]=(int)(Math.random()*10 +1);
      currentPlayer = (int)(Math.random()*playerCount);
    }
  }
  
  /** Distributes the tokens from the current 
   * player's position one at a time to each 
   * player in the game. Distribution begins 
   * with the next position and continues 
   * until all the tokens 
   * have been distributed. If there are still 
   * tokens to distribute when the player at the 
   * highest position is reached, the next token 
   * will be distributed to the player at 
   * position 0. 
   * Precondition: 
   *   the current player has at least one token. 
   * Postcondition: 
   *   the current player has not changed. 
   */
  public void distributeCurrentPlayerTokens()
  { /* to be implemented in part (b) */ 
    int receiver, distribr=currentPlayer;
    int tokensToDistr = board[currentPlayer], numPlayers=board.length;
    while(tokensToDistr>0)
    {
      board[currentPlayer]--;
      receiver=(++distribr)%numPlayers;
      System.out.print(""+receiver+", ");
      board[receiver]++;
      tokensToDistr--;
    }
  }

  public static void main(String[] args)
  {
    TokenPassFrq132 g1 = new TokenPassFrq132(4);
    System.out.println(Arrays.toString(g1.board));
    System.out.println("CurrentPlayer/Tokens:= " + g1.currentPlayer+"/"+g1.board[g1.currentPlayer]);
    
    g1.distributeCurrentPlayerTokens();
    
    System.out.println();
    System.out.println(Arrays.toString(g1.board));
    System.out.println("CurrentPlayer/Tokens:= " + g1.currentPlayer+"/"+g1.board[g1.currentPlayer]);
  }

}

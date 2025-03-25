public class RandomWalkGame {

  // PUT IN APPROPRIATE VISIBILITY MODIFIERS
  private int length;
  private int playerPos;


  // YOU SHOULD NOT MODIFY THIS METHOD EXCEPT 
  // PUTTING IN APPROPRIATE VISIBILITY MODIFIER
  private void printMap() {

    for (int i = 1; i < playerPos; i++)
      System.out.print(".");

    System.out.print('P');

    for (int i = playerPos+1; i <= length; i++)
      System.out.print(".");
  }

  public RandomWalkGame(int length){
    playerPos=1;
    this.length=length;
  }
  // IMPLEMENT THE FOLLOWING METHOD
  public void play() {
 
    // create an appropriate MyDie object for
    // generating the distance
    MyDie distDie= new MyDie(1,6);

    boolean gameEnd = false;

    int distance;  // distance that the player is going to move

    int numRound = 0;

    while (!gameEnd) {

      printMap();

      // use distDie to generate how many units the player is advancing
      distance = distDie.roll();
      playerPos+=distance;

      if(playerPos==length){
        gameEnd=true;
      }
      if(playerPos>length){
        playerPos=length+(length-playerPos);
      }

      // compute the new position if the move is made
      // and determine whether the game ends


      // print out the distance the player moves
      System.out.println("\t[Player moves " + distance + " unit(s)]");

      numRound++;
    }

    System.out.println("The game ends after " + numRound + " rounds.");
  }
}

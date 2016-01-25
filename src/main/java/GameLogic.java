/**
 * Created by Taylor on 1/24/16.
 */
public class GameLogic {
    public int compNumWins;
    public int playerNumWins;
    public int numRounds;

    HumanPlayer humanSelection = new HumanPlayer();
    ComputerPlayer computerSelection = new ComputerPlayer();

    public void comparison(){

        while(numRounds < 3){
          int hinput = humanSelection.humanResponse(); // these values need to be stored somewhere
            int cinput = computerSelection.compResponse();

            if(cinput == hinput) {
                    System.out.println("It's a tie!");
                }
            if (cinput == 1 && hinput == 2){
                System.out.println("You won!");
                playerNumWins++;
            } else if (cinput == 1 && hinput == 3){
                System.out.println("You won!");
                playerNumWins++;
            } else {

            }

            if (cinput == 2 && hinput == 1){
                System.out.println("Computer wins.");
                compNumWins++;
            } else if (cinput == 2 && hinput == 3){
                System.out.println("You win!");
                playerNumWins++;
            } else {

            }

            if(cinput == 3 && hinput == 1){
                System.out.println("You win!");
                playerNumWins++;
            } else if (cinput == 3 && hinput == 2){
                System.out.println("Computer wins");
                compNumWins++;
            }


            numRounds++;

        }

    }
    public void overallWin(){
        if(compNumWins > playerNumWins){
            System.out.println("Computer is the winner");
        } else if (playerNumWins > compNumWins){
            System.out.println("You are the winner!");
        } else {
            System.out.println("It's a draw.");
        }
    }
}

import java.util.Scanner;

/**
 * Created by Taylor on 1/24/16.
 */
public class HumanPlayer {
    public int humanInput;

    Scanner scan = new Scanner(System.in);

    public int humanResponse(){
        System.out.println("Rock: 1, Paper: 2, Scissors: 3");
        humanInput = scan.nextInt();
        return humanInput;

    }

    }


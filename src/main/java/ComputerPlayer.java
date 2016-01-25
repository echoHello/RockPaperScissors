import java.util.Random;

/**
 * Created by Taylor on 1/24/16.
 */
public class ComputerPlayer {
    public int compInput;

    public int compResponse(){
        compInput = (int) (Math.random() * 3);
            if (compInput == 1){
                return 1;
            } else if (compInput == 2){
                return 2;
            } else {
                return 3;
            }
    }


    }

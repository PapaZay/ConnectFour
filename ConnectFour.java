import java.util.*;
import java.lang.String;

public class ConnectFour{
   private char[][] gameBoard =    {{' ',' ',' ',' ',' ',' ',' '},
                                    {' ',' ',' ',' ',' ',' ',' '},
                                    {' ',' ',' ',' ','R',' ',' '},
                                    {' ',' ','Y','Y','Y',' ',' '},
                                    {' ',' ','R','Y','Y',' ',' '},
                                    {' ','Y','R','R','Y','R',' '},
                                    {' ','R','Y','R','R','Y','R'}};
    
    
    public static void main(String arg[]){
        
        ConnectFour connectfour = new ConnectFour();
        //connectfour.init();
        


        if(connectfour.isWinner('Y')){
            System.out.println("Yellow is the winner.");
        } else {
            System.out.println("Yellow did not win.");
        }

}

public boolean isWinner(char winColor){
    for(int row = 0; row < gameBoard.length; row++){
        int count = 0;
        for(int col = 0; col < gameBoard[row].length; col++){
            if(gameBoard[row][col] == winColor){
                count++;
            } else{
                count = 0;
            }
            if (count == 4){
                return true;
            }
        }
    }

    for(int col = 0; col < gameBoard[0].length; col++){
        int count = 0;

        for(int row = 0; row < gameBoard.length; row++){
            if(gameBoard[row][col] == winColor){
                if(gameBoard[row][col] == winColor){
                    count++;
                } else {
                    count = 0;
                }
                if(count == 4){
                    return true;
                }
            }
        }
    }

    for(int row = 0; row < gameBoard.length-4; row++){

        for(int col = 0; col < gameBoard[row].length-4; col++){
            int count = 0;
            for(int pos = 0; pos < 4; pos++){
                if(gameBoard[row+pos][col+pos] == winColor){
                    count++;
                } else{
                    count = 0;
                }
                if(count == 4){
                    return true;
                }
            }
        }
    }

    for(int row = gameBoard.length-1; row > 4; row--){
        for(int col = 0; col < gameBoard[row].length-4; col++){
            int count = 0;
            for(int pos = 0; pos < 4; pos++){
                if(gameBoard[row-pos][col+pos] == winColor){
                    count++;

                } else {
                    count = 0;
                }
                if(count == 4){
                    return true;
                }
            }
        }
    }
    return false;
}
}
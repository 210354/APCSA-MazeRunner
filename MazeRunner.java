import java.util.*;

public class MazeRunner {
    static Maze myMap = new Maze(); 
    static Scanner input = new Scanner(System.in);

    static int counter = 0; 

    public static void main(String[] args) {
        intro();
        
        

        while(myMap.didIWin() == false){
            
            System.out.println("Where would you like to move? (R, L, U, D)"); 
            String user = input.nextLine();  

        userMover(user); 
        
        if (myMap.didIWin() == false) {
            myMap.printMap(); 
            dashedLines();

        }

        counter++; 
        System.out.println("This is how many moves you've already made: " + counter); 

        movesMessage(counter);

    }

        System.out.println("\nCongratulations, you made it out alive!"); 
    
    }

    public static void intro() {
        System.out.println("\nWelcome to the Maze Runner game! Here is what your maze currently looks like.  "); 
        System.out.println("The 'x' represents your current position and the '.' will turn into either walls ('-') or free space ('*')");
        myMap.printMap(); 
        dashedLines(); 
    }
    // welcome the user into the program and print the new map 


 
    public static String userMover(String userChoice) {
        //take in desired direction of move, and check if that direciton is valid and possilbe

        if (myMap.canIMoveRight() == true && userChoice.equals("R")){
            myMap.moveRight(); 
        }

        else if (myMap.canIMoveLeft() == true && userChoice.equals("L")){
            myMap.moveLeft(); 
        }

        else if (myMap.canIMoveUp() == true && userChoice.equals("U")) {
            myMap.moveUp(); 
        }

        else if (myMap.canIMoveDown() == true && userChoice.equals("D")) {
            myMap.moveDown(); 
        }


        else {
            System.out.println("There was an error. ");
        }
        

        String direction = ""; //use this for now
        return direction; 
    
    }

    public static void movesMessage(int moves) {

        if (moves == 50) { 
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the exit closes. ");

        }

        else if (moves == 75)
        //print message after certain number of moves
        //count moves 
    }

    /*
    public static void navigatePit(direction) {
    }
    */

//This method is used to make it easier for the user to read what is in the console 
    public static void dashedLines() {

        System.out.println(); 

        for (int i = 1; i <=150; i++) {

            System.out.print("-");

        }

        System.out.println();

    }
 
    
}

import java.util.*;

public class MazeRunner {
    static Maze myMap = new Maze(); 
    static Scanner input = new Scanner(System.in);

    static int counter = 0; 
    static String user; //Asks the user what direction they want to move in 

    public static void main(String[] args) {
        intro();

        while(myMap.didIWin() == false && counter < 100) {
            
            System.out.println("Where would you like to move? (R, L, U, D)"); 
            user = input.nextLine();  
            
            navigatePit(user); 
            userMover(user); 
        
        if (myMap.didIWin() == false) {
            myMap.printMap(); 
            dashedLines();

        }

        counter++; 
        System.out.println("This is how many moves you've already made: " + counter); 

        movesMessage(counter);

    }

    if (counter < 100) {
        System.out.println("\nCongratulations, you made it out alive! It took you " + counter + " moves to get out! "); 
    }

    else if (counter == 100) {
        System.out.println("\nSorry, but you didn't escape in time - you lose!"); 

    }


    
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

        else if (moves == 75) {
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        }

        else if (moves == 90) {
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape. ");

        }

        else if (moves == 100) {
            System.out.println("Oh no! You took too long to escape, and now the maze exits. ");
        }

        //print message after certain number of moves
        //count moves 
    }

    
    public static void navigatePit(String direction) {
       
        if (myMap.isThereAPit(direction) == true) {

            System.out.println("Watch out! There's a pit ahead, jump it? (Y) or (N). ");
            String jump = input.nextLine(); 
     
            if (jump.equals("Y")) {
                myMap.jumpOverPit(direction); 

            }
    
            else {
                System.out.println("Where would you like to move? ");
                String move = input.nextLine(); 
                userMover(move); 

                if (move.equals(direction)) {
                    System.out.println("You fell into a pit! The game will now terminate. ");

                } 
            }

        }



        

    }
    

//This method is used to make it easier for the user to read what is in the console 
    public static void dashedLines() {

        System.out.println(); 

        for (int i = 1; i <=150; i++) {

            System.out.print("-");

        }

        System.out.println();

    }
 
    
}

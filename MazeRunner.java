import java.util.*;

public class MazeRunner {
    static Maze myMap = new Maze(); 
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        intro(); 
        while(true){
        userMover(); 
        myMap.printMap(); 
    }
    }

    public static void intro() {
        System.out.println("\nWelcome to the Maze Runner game! Here is what your maze currently looks like.  "); 
        System.out.println("The 'x' represents your current position and the '.' will turn into either walls ('-') or free space ('*')");
        myMap.printMap(); 
        dashedLines(); 
    }
    // welcome the user into the program and print the new map 


 
    public static String userMover() {
        //take in desired direction of move, and check if that direciton is valid and possilbe

        System.out.println("Where would you like to move? (R, L, U, D)"); 
        String userChoice = input.nextLine(); 



        if (myMap.canIMoveRight() == true){
            myMap.moveRight(); 
        }

        if (myMap.canIMoveLeft() == true){
            myMap.moveLeft(); 
        }

        if (myMap.canIMoveUp() == true) {
            myMap.moveUp(); 
        }

        if (myMap.canIMoveDown() == true) {
            myMap.moveDown(); 
        }

        

        String direction = ""; //use this for now
        return direction; 
    
    }
/*

    public static void movesMessage(moves) {
        //print message after certain number of moves
        //count moves 
    }

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
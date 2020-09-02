package grades;
import util.Input;

import java.util.Scanner;

//Create a grocery list command line application. You will use your input class from previous exercises.
//
//A user should be prompted if they would like to create a grocery list.
//
//If they pick yes, they will be prompted if they would like to enter a new item.
//
//If the users picks yes, they should be given the following three prompts:
//
//Given an ordered list of grocery categories to choose from, select the category.
//Enter name of the item.
//Enter how many of the item.
//The user will then be given the choice to finalize the list or add an additional item.
//
//Once the user finalizes the list, they will be presented with a complete list organized alphabetically and grouped by category, and including quantity.
//
//For an extra bonus, allow users to filter the results by only one category of items at a time.
//
//For a super gold star bonus, allow users to edit the list items.
//
//Consider before coding how the data should be organized. Using ArrayLists and HashMaps will be helpful.

public class GroceryList {
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Would you like to create grocery list");
        Scanner scan = new Scanner(System.in);
        String YN = scan.nextLine();
        if(YN.equalsIgnoreCase("y")){
            System.out.println("Would you like to enter a new item");
            if(YN.equalsIgnoreCase("y")){
                System.out.println("Given an ordered list of grocery categories to choose from, select the category.");
                System.out.println("Enter name of the item.");
                System.out.println("Enter how many of the item.");
            }
        }
    }
}

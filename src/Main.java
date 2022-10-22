// Name: Isabella Livingston
// Date: 21 October 2022
// Description: This Program will get 10 numbers
//              It'll that the first and last 5 numbers and add them into two different arrays
//              Afterwards it'll add both values from the arrays and display the input of all arrays

// Importing Assets
import java.util.Scanner;

// Main Project
public class Main {
    // Main Method
    public static void main(String[] args) {
        // ------------ DECLARING ------------
        Scanner scanner = new Scanner(System.in);

        // ------------ INPUT ------------
        String[] ten_values = getting_ten_values(scanner, "Enter ten values, separated by spaces: ");

        // ------------ PROCESSING ------------
        String[] first_array = appending_values_to_arrays(ten_values, 0, 1);
        String[] second_array = appending_values_to_arrays(ten_values, (ten_values.length)/2, 2);

        // ------------ OUTPUT ------------
        displaying_output(first_array, second_array);

    }

    // Displaying Output Method
    public static void displaying_output(String[] first_array, String[] second_array){

        // Declaring Variables
        int MAX = 5;
        int[] final_array = new int[MAX];

        // Displaying Info
        System.out.print("Final Array : ");

        // Adding two arrays and appending them to the final list
        for(int element = 0; element < MAX; element++){
            final_array[element] = (Integer.parseInt(first_array[element]) + Integer.parseInt(second_array[element]));

            // Everything below the if statement is for formatting purposes (also printing more info)
            if(element == (MAX - 1)){
                System.out.print(final_array[element]);
            }

            else{
                System.out.print(final_array[element] + ", ");
            }
        }
    }

    // Appending Values to Arrays Method
    public static String[] appending_values_to_arrays(String[] ten_values, Integer start_point, Integer array_num){

        // Declaring Variables
        int MAX = 5;
        String[] new_array = new String[MAX];

        // Printing Info
        System.out.print("Array " + array_num + ": ");

        // Appending Values to List
        // Starting Point is where it'll start appending values to the new array
        for(int element = 0; element < MAX; element++){
            new_array[element] = ten_values[element + start_point];

            // Everything below the if statement is for formatting purposes (also printing more info)
            if(element == (MAX - 1)){
                System.out.print(new_array[element]);
            }

            else{
                System.out.print(new_array[element] + ", ");
            }
        }

        // Put this here for format reasons
        System.out.println(" ");

        // Returns the Array
        return new_array;

    }

    // Getting Ten Values Method
    public static String[] getting_ten_values(Scanner scanner, String prompt){

        // Prints Prompt and Gets Input
        System.out.print(prompt);
        String ten_values = scanner.nextLine();

        // Checks to see if the input is invalid
        while(is_invalid(ten_values)){
            // Prints Prompt and Gets Input
            System.out.print(prompt);
            ten_values = scanner.nextLine();
        }

        // Returns the input as an array
        return ten_values.split("\\s+");

    }

    // Is Invalid Method
    public static Boolean is_invalid(String ten_values){
        // Declaring Variables
        String[] split_string = ten_values.split("\\s+");
        int total_length = 10;

        // If there aren't 10 values in the input then it prints an error message
        // and the user has to enter the input again
        if(split_string.length != total_length){
            System.out.println("   Error: Please Enter 10 Values");
            return true;
        }

        // User doesn't have to enter input again
        return false;
    }

}
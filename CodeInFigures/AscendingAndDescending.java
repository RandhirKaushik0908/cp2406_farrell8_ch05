import java.util.Scanner;

public class AscendingAndDescending {
    public static void main (String[] args)
    {
        int a, b, i, temp;
        int[] num_array = new int[3];
        int[] descending_order = new int[3];
        Scanner input = new Scanner(System.in);

        // Gets user input
        for (i = 0; i < 3; i++) {
            System.out.print("Enter a number: ");
            num_array[i] = input.nextInt();
        }
        // Arranges the numbers in descending order
        for (a = 0; a < num_array.length - 1; ++ a){
            for (b = 0; b < num_array.length - 1; ++ b){
                if (num_array[b] > num_array[b + 1]){
                    temp = num_array[b];
                    num_array[b] = num_array[b + 1];
                    num_array[b + 1] = temp; } } }
        // Prints the numbers in ascending order
        System.out.print("Numbers you entered in: \nThe ascending order- ");
        for (a = 0; a < num_array.length; ++ a) {
            System.out.print(num_array[a] + " "); }

        // Makes a copy
        for (a = 0; a < num_array.length; ++ a) {
            descending_order[a] = num_array[a]; }
        // Arranges the numbers in descending order
        for (a = 0; a < descending_order.length - 1; ++ a){
            for (b = 0; b < descending_order.length - 1; ++ b){
                if (descending_order[b] < descending_order[b + 1]){
                    temp = descending_order[b];
                    descending_order[b] = descending_order[b + 1];
                    descending_order[b + 1] = temp; } } }

        // Prints the numbers in descending order
        System.out.print("\nThe descending order- ");
        for (a = 0; a < descending_order.length; ++ a) {
            System.out.print(descending_order[a] + " ");
        } } }
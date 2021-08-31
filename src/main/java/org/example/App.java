import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println( "How many people?" );
        int ppl = input.nextInt();;
        System.out.println(" How many pizzas do you have? ");
        int pizza = input.nextInt();
        System.out.println("How many slices per pizza? ");
        int slices = input.nextInt();

        int slices_per = (pizza * slices) / ppl;
        int leftover = (pizza * slices) % ppl;

        System.out.println("Each person gets " + slices_per + " slices of pizza");
        System.out.print("There are " + leftover +  " slices leftover");
    }
}

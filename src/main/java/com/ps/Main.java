package com.ps;

// Import BufferedReader/Writer, along with ArrayList and Scanner
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    //create static Scanners and ArrayList to be called on
    static ArrayList<Transaction> allTransactions = new ArrayList<>();
    static Scanner inputScanner = new Scanner(System.in);
    static Scanner commandScanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadTransactions();

        /*
        create a main menu that allows a user to 1) add deposit, 2) make payment(debit), 3)access Ledger, 4)exit program
        this will be done in a series of break cases/switch statements in nested in a do/while loop
         */

        // Initialize the command variable (int mainMenuCommand;)
        int mainMenuCommand;

        //Do/While loop to run user command through switch statements while they dont want to exit
        do {
            // Display the menu, sout
            System.out.println("Please enter an option: ");
            System.out.println("1) Add Deposit");
            System.out.println("2) Make Payment(Debit)");
            System.out.println("3) Ledger");
            System.out.println("0) Exit");
            System.out.print("Command: ");

            // Use scanner to store the users command input into a variable
            try {
                mainMenuCommand = commandScanner.nextInt();
            } catch (InputMismatchException ime) {
//                ime.printStackTrace();
                mainMenuCommand = 0;
            }

            // switch statement to match the user command to the provided cases
            switch (mainMenuCommand) {
                case 1:
                    // methods will match the corresponding command
                    addDeposit();
                    break;
                case 2:
                    makePayment();
                    break;
                case 3:
                    accessLedger();
                    break;
                case 0:
                    System.out.println("Thank you for your valuable time, come again");
                    break;
                default:
                    // Handle incorrect commands
                    System.out.println("Command not found, please try again");
            }

        } while (mainMenuCommand != 0);
    }
        //creat method to load all transactions
        public static void loadTransactions()
        {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("transactions.csv"));

            }catch (Exception e) {
                e.printStackTrace();
        }
    }

    public static void addDeposit(){
        System.out.println("Enter deposit amount: ");
    }

    public static void makePayment(){
        System.out.println("Enter payment amount: ");
    }




    public static void accessLedger()
    {
        //make variable to navigate ledger
        int navLedgerCommand;

        /*
        another do/while to allow the user to navigate ledger till they wish to return to main menu
        while they have access the ledger the user can do several things such as:
        1) Display all transactions
        2) Display Deposits only
        3) Display only payments
        4) Run Reports (do/while loop)
         */






    }



}
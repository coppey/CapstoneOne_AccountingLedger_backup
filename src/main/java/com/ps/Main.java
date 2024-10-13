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

    public static void main(String[] args)
    {
        loadTransactions();

        /*
        create a main menu that allows a user to
        1) add deposit,
        2) make payment(debit),
        3) access Ledger,
        4) exit program
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
            //ime.printStackTrace();
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

    public static void addDeposit()
    {
        //BufferedWriter method
        System.out.println("Enter deposit amount: ");
    }

    public static void makePayment()
    {
        //BufferedWriter method
        System.out.println("Enter payment amount: ");
    }




    public static void accessLedger()
    {
        //load reporst
        loadReports();

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
        do {
            // Display the menu, sout
            System.out.println("What would you like to do? : ");
            System.out.println("1) Display All Transactions");
            System.out.println("2) Display All Deposits");
            System.out.println("3) Display All Payments");
            System.out.println("4) Reports");
            System.out.println("0) Exit");
            System.out.print("Command: ");


        // Use scanner to store the users command input into a variable
        try {
            navLedgerCommand = commandScanner.nextInt();
        } catch (InputMismatchException ime) {
            //ime.printStackTrace();
            navLedgerCommand = 0;
        }

        // switch statement to match the user command to the provided cases
        switch (navLedgerCommand) {
            case 1:
                // methods will match the corresponding command
                displayAll();
                break;
            case 2:
                displayDeposits();
                break;
            case 3:
                displayPayments();
                break;
            case 4:
                runReports();
                break;
            case 0:
                System.out.println("Thank you for your valuable time, come again");
                break;
            default:
                // Handle incorrect commands
                System.out.println("Command not found, please try again");
            }

        }while (navLedgerCommand != 0);

    }

    //creat method to load all transactions
    public static void loadReports()
    {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("transactions.csv"));

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayAll()
    {
        //BufferedWriter method
        System.out.println("Enter deposit amount: ");
    }

    public static void displayDeposits()
    {
        //BufferedWriter method
        System.out.println("Enter payment amount: ");
    }

    public static void displayPayments()
    {
        //BufferedWriter method
        System.out.println("Enter payment amount: ");
    }

    public static void runReports()
    {
        //make variable to navigate ledger
        int navReportCommand;

        /*
        another do/while to allow the user to navigate ledger till they wish to return to main menu
        while they have access the ledger the user can do several things such as:
        1) Display all transactions
        2) Display Deposits only
        3) Display only payments
        4) Run Reports (do/while loop)
         */
        do {
            // Display the menu, sout
            System.out.println("How would you like to search the reports?: ");
            System.out.println("1) Month to Date");
            System.out.println("2) Previous Month");
            System.out.println("3) Year to Date");
            System.out.println("4) Previous Year");
            System.out.println("5) Search by Vendor");
            System.out.println("0) Exit");
            System.out.print("Command: ");

            // Use scanner to store the users command input into a variable
            try {
                navReportCommand = commandScanner.nextInt();
            } catch (InputMismatchException ime) {
            //ime.printStackTrace();
                navReportCommand = 0;
            }

            // switch statement to match the user command to the provided cases
            switch (navReportCommand) {
                case 1:
                    // methods will match the corresponding command
                    sMTD();
                    break;
                case 2:
                    sPMs();
                    break;
                case 3:
                    sYTD();
                    break;
                case 4:
                    sPY();
                    break;
                case 5:
                    sVedor();
                    break;
                case 0:
                    System.out.println("Thank you for your valuable time, come again");
                    break;
                default:
                    // Handle incorrect commands
                    System.out.println("Command not found, please try again");
            }

        }while (navReportCommand != 0);



    }

    public static void sMTD(){
        System.out.println("Enter deposit amount: ");
    }

    public static void sPMs(){
        System.out.println("Enter payment amount: ");
    }

    public static void sYTD(){
        System.out.println("Enter payment amount: ");
    }

    public static void sPY(){
        System.out.println("Enter payment amount: ");
    }

    public static void sVedor(){
        System.out.println("Enter deposit amount: ");
    }


}
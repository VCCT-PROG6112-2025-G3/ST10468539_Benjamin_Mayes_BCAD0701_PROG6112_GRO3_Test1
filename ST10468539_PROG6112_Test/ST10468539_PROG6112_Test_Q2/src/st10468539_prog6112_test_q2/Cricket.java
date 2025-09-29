
package st10468539_prog6112_test_q2;

/* Fetched code from W3 schools for importing scanner class 
https://www.w3schools.com/java/java_user_input.asp */

import java.util.Scanner;

interface ICricket { // all are public static - DEFAULT  
    String getBatsman();  
    String getStadium();  
    int getRunsScored();  
}

abstract class Cricket implements ICricket {
    /* Fetched code from W3 schools for implementing modifiers 
    https://www.w3schools.com/java/java_modifiers.asp */
    
    // attributes 
    protected String batsmanName; 
    protected String stadiumName; 
    protected int totRunsScored; 
    
    /* Fetched code from Geeks for Geeks for implementing constructors 
    https://www.geeksforgeeks.org/java/constructors-in-java/ 
    
    Fetched code from W3 schools for implementing modifiers 
    https://www.w3schools.com/java/java_modifiers.asp */
    
    // main constructor 
    public Cricket (String batsmanName, 
            String stadiumName, 
            int totRunsScored) {
        this.batsmanName = batsmanName; 
        this.stadiumName = stadiumName; 
        this.totRunsScored = totRunsScored; 
    }
    
    // empty constructor 
    public Cricket() {
        this.batsmanName = null; 
        this.stadiumName = null; 
        this.totRunsScored = 0; 
    }
    
    /* Fetched code from Geeks for Geeks for overriding inherrited methods  
    https://www.geeksforgeeks.org/java/overriding-in-java/ */ 
    
    @ Override  
    public String getBatsman() { 
        /* Fetched code from W3 schools for creating new scanner object  
        https://www.w3schools.com/java/java_user_input.asp */ 
        
        Scanner Scan = new Scanner(System.in); // declare and initialise new Scanner object   
        
        /* Fetched code from W3 schools for reading user input  
        https://www.w3schools.com/java/java_user_input.asp */ 
        
        System.out.println("please enter the batsman's name: "); // prompt user's input  
        String man = Scan.nextLine(); // read user input, using Scanner object  
        
        /* Fetched code from W3 schools for trimming whitespace  
        https://www.w3schools.com/java/ref_string_trim.asp */ 
        
        man = man.trim(); // trim whitespace from user's answer  
        
        return man; 
    }
    
    @ Override  
    public String getStadium() { 
        /* Fetched code from W3 schools for creating new scanner object  
        https://www.w3schools.com/java/java_user_input.asp */ 
        
        Scanner Scan = new Scanner(System.in); // declare and initialise new Scanner object   
        
        /* Fetched code from W3 schools for reading user input  
        https://www.w3schools.com/java/java_user_input.asp */ 
        
        System.out.println("please enter the name of the stadium: "); // prompt user's input  
        String stad = Scan.nextLine(); // read user input, using Scanner object  
        
        /* Fetched code from W3 schools for trimming whitespace  
        https://www.w3schools.com/java/ref_string_trim.asp */ 
        
        stad = stad.trim(); // trim whitespace from user's answer  
        
        return stad; 
    }
    
    @ Override  
    public int getRunsScored() { 
        /* Fetched code from W3 schools for creating new scanner object  
        https://www.w3schools.com/java/java_user_input.asp */ 
        
        Scanner Scan = new Scanner(System.in); // declare and initialise new Scanner object   
        
        /* Fetched code from W3 schools for reading user input  
        https://www.w3schools.com/java/java_user_input.asp */ 
        
        System.out.println("please enter the total number of runs scored: "); // prompt user's input  
        int runs = Scan.nextInt(); // read user input, using Scanner object  
        
        return runs; 
    }
}

/* Fetched code from W3 schools for implementing modifiers 
https://www.w3schools.com/java/java_modifiers.asp 

Fetched code from W3 schools for creating a subclass 
https://www.w3schools.com/java/java_inheritance.asp */ 

class CricketRunsScored extends Cricket {
    /* Fetched code from Geeks for Geeks for implementing constructors in subclasses 
    https://www.geeksforgeeks.org/java/inheritance-and-constructors-in-java/ */ 
    
    // main constructor 
    public CricketRunsScored(String batsmanName, 
            String stadiumName, 
            int totRunsScored) {
        super(batsmanName, stadiumName, totRunsScored); 
    }
    
    // empty constructor 
    public CricketRunsScored() {
        super(); 
    }
    
    public void printReport() {
        System.out.print("BATSMAN RUNS SCORED REPORT\n"
                + "".repeat(60) 
                + "\nCRICKET PLAYER: " + batsmanName
                + "\nSTADIUM: " + stadiumName
                + "\nTOTAL RUNS SCORED: " + totRunsScored);
    }
}

//=======================================================================
// END-OF-FILE 
//=======================================================================


package st10468539_prog6112_test_q2;

/* Fetched code from W3 schools for importing scanner class 
https://www.w3schools.com/java/java_user_input.asp */

import java.util.Scanner;

public class ST10468539_PROG6112_Test_Q2 {

    public void main(String[] args) {
        // 
        
        String ans = "1"; 
        boolean exit = false; 
        while (!exit) { // repeat code until application is terminated 
            // 
            
            exit = !ans.equals("1"); 
        }
    }
    
    /* Fetched code from W3 schools for implementing modifiers 
    https://www.w3schools.com/java/java_modifiers.asp */
    
    private void RunApplication() {
        // create new cricket object 
        CricketRunsScored request = new CricketRunsScored(); 
        
        // prompt batsmans name 
        String man = request.getBatsman(); 
        
        // prompt stadium name 
        String stadium = request.getStadium(); 
        
        // prompt total runs 
        int runs = request.getRunsScored(); 
        
        // create object 
        CricketRunsScored round = new CricketRunsScored(man, stadium, runs); 
        
        // print everything 
    }
}

//========================================================================
// END-OF-FILE 
//========================================================================

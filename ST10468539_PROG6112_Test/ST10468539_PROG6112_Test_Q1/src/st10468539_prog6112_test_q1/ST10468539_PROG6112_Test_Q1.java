 
package st10468539_prog6112_test_q1; 
 
/* Fetched code from W3 schools for importing scanner class  
https://www.w3schools.com/java/java_user_input.asp */ 
 
import java.util.Scanner; 
 
public class ST10468539_PROG6112_Test_Q1 { 
 
    public static void main(String[] args) { 
        // create data table 
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB De Villiers"}; 
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"}; 
        int[][] runs = {
            {5000, 3800, 4200}, 
            {3500, 3700, 3900}, 
            {6200, 5000, 5200}
        }; 
        
        // calculate and print totals for each batsman 
        int totRuns; 
        
        /* Fetched code from W3 schools for creating an index-based for loop  
        https://www.w3schools.com/java/java_arrays_loop.asp */ 
                 
        for (int i = 0; i < batsmen.length; i++) {
            totRuns = 0; 
            for (int[] cell : runs) {
                totRuns += cell[i]; 
            }
            
            System.out.println("" + totRuns);
        }
    } 
     
} 
//======================================================================== 
// END-OF-FILE  
//========================================================================
/*
  	ISYS 320
  	Name(s):AlfurhudSolomon
  	Date: March25, 2018
*/



/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number		| HEADING		| HEADING		| HEADING		| HEADING		| HEADING		|	





*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 
 
 
 
 
 */

public class P2_SlashesAndBangs {

	  public static void main(String args[]) {

        

 

        

 
       for(int i : new Integer[]{22,18,14,10,6,4,1}){
     for(int k = 0; k < (22 - i)/2; k++){
         System.out.print(" ");
     }           
     for(int j=0; j<i; j++) {
         System.out.print("!");
     } 
     System.out.println();
}
    }
}
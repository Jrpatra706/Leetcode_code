package Pattern;

public class starTriangle7_striver {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int k=i;k<n;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 * Input Format: N = 3
Result: 
  *  
 *** 
*****   
Input Format: N = 6
Result:
     *     
    ***    
   *****   
  *******  
 ********* 
***********
 */

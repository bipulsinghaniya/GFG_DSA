//{ Driver Code Starts
import java.util.Scanner;


// } Driver Code Ends

//Back-end complete function Template for Java
import java.util.*;

class Solution {
    public void calculateMultiples(int n) {
        
        for(int i = 10; i > 0; i--){
            System.out.printf("%d ",i*n);
        }
        
        
    }
}




//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Create an instance of Solution and call the method
        Solution solution = new Solution();
        solution.calculateMultiples(n);
    }
}

// } Driver Code Ends
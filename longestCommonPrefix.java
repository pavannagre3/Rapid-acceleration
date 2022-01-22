import java.io.*;
import java.util.*;
class Main
{
    static String longestCommonPrefix(String arr[], int n) 
    {
    
        if (n == 0) 
            return ""; 
            if (n == 1) 
            return arr[0];
        Arrays.sort(arr);
        int min = arr[0].length();
        String first = arr[0], last = arr[n - 1]; 
        
        
        int i = 0; 
        while (i < min && first.charAt(i) == last.charAt(i)) 
            i++; 
      
        String prefix = first.substring(0, i); 
        return prefix;
    } 
  public static void main (String[] args) 
  {
      String arr[] = {"flower","flow","flight"}; 
      int n = arr.length; 
    
      String ans = longestCommonPrefix(arr, n); 
      if (ans.length() != 0) 
        System.out.println("Longest common prefix = "+ans); 
      else
        System.out.println("no common prefix found");
  }
}

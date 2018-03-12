/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

/**
 *
 * @author josep
 */
public class Homework3 {

    /**
     * @param args the command line arguments
     */
    // C-4.45
    public static void findMissingNumber()
    {
        // Array One (First Test)
        // n = 9, 9-1 = 8 [0,8]
        int[] arrayOne = {2,6,0,1,4,3,5,8};         // Missing 7

        // Get total of array (including missing number)
        int totalOne = (9 * (9 - 1)) / 2;              
        
        // Loop through and subtract present numbers to find missing number
        for (int i = 0; i < arrayOne.length; i++)
        {
            totalOne = totalOne - arrayOne[i];
        }
        
        // Array Two (Second Test)
        // n = 6
        int[] arrayTwo = {5,3,1,2,0};                 // Missing 4
        int totalTwo = (5 * (5 - 1)) / 2;
        int arrayTwoTotal = 0;
        for (int i = 0; i < arrayTwo.length; i++)
        {
            totalTwo = totalTwo - arrayTwo[i];
        }
        
        // Display missing number
        System.out.println("Missing number in array 1 is: " + totalOne);
        System.out.println("Missing number in array 2 is: " + totalTwo);
    }
    
    // C-5.17
    public static void reverse(String word, String newWord, int i)
    {   
        // Check to see if all letters are reversed
        if (i <= word.length())
        {
            newWord = newWord + word.charAt(word.length() - i);
            reverse(word, newWord, i + 1);
        }
        else
            System.out.println("Reverse of " + word + " is: " + newWord);           // Display when finish
    }
    
    // C-5.17
    public static void recursiveString()
    {
        String word = "cheeseburger";          // String to be reversed
        String newWord = "";                // Holder for new string
        int i = 1;                          // Keeps position of the letter
        reverse(word, newWord, i);          // Call function to reverse string
    }
    
    // C-5.18
    public static void palindromeCheck(String word, int start, int end)
    {
        // If the end position of the word is greater than the start position, compare the two letters and see if match
        // If matched, repeat the process til the middle of the string is reached
        if (end > start)
        {
            if (word.charAt(start) == word.charAt(end))
            {
                start++;
                end--;
                palindromeCheck(word, start, end);
            }
            else
            {
                System.out.println("Word is not a palindrome.");            // If the two letters dont match, display not palindrome
            }          
        }
        else
            System.out.println("Word is a palindrome.");                    // If all letters matched, display palindrome
    }
    
    // C-5.18
    public static void recursivePalindromes()
    {
        String word = "racecar";                // Word to check
        int start = 0;                          // Start position of the letter
        int end = word.length() - 1;            // Last letter in the word
        palindromeCheck(word, start, end);      // Call function to check
    }
    
    // Main method
    public static void main(String[] args) {
        // C-4.45 Page 185
        findMissingNumber();
        
        // C-5.17 Page 222
        recursiveString();
        // C-5.18
        recursivePalindromes();
    }  
}

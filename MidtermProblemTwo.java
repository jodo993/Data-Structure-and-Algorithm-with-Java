/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproblemtwo;

/**
 *
 * @author josep
 */
public class MidtermProblemTwo {

    public static void evensBeforeOdds(int[] nums)
    {
        // Declare left and right positions
        int start = 0;                       // First position in array
        int end = nums.length - 1;           // Last position in array
        
        // Do this while start is not at the end yet
        while(start < end)
        {
            // Check beginning for even numbers
            while(nums[start] % 2 == 0 && start < end)          // If first position is even and end isnt reach, go to the next position
                start++;
            
            // Check ending for odd numbers
            while(nums[end] % 2 == 1 && start < end)            // If last position is odd and array is not completed, move closer to the middle
                end--;
            
            // If array checking is not done swap the two numbers
            if(start < end)
            {
                int temp = nums[start];         // Put front position number(odd) in a temp variable
                nums[start] = nums[end];        // Move the latter number into front spot
                nums[end] = temp;               // Move the odd number back
                start++;                        // Move both ends closer to the middle
                end--;
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create array
        int[] numbers = {3,6,1,9,4,7,2,5};
        
        // Print out array before modification
        System.out.print("Array Before: ");
        for(int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
        
        evensBeforeOdds(numbers);
        System.out.println();
        
        // Print out array after modification
        System.out.print("Array After: ");
        for(int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproblemone;

/**
 *
 * @author josep
 */
public class MidtermProblemOne {
    
    // The big Oh of this method seem to be O(n^2) since its a nested for loop.
    // Best case is O(n) because each value in the array must be seen once in order to count it.
    // Run time is 0.001 seconds.
    public static void findMostAppearance(int[] nums)
    {
        long startTime = System.currentTimeMillis();
        
        int arrayLength = nums.length;          // Get length of array
        int mode = 0;                           // Number that shows up the most
        int occurrence = 0;                     // How many times the number showed up
        
        // Go through the entire array
        for(int i = 0; i < arrayLength; i++)
        {
            int currentMode = nums[i];
            int modeOccurrence = 0;
            
            // Go and check if mode is elsewhere
            for(int j = 0; j < arrayLength; j++)
            {
                if(nums[j] == currentMode)      // Check to see if value is same as mode
                    modeOccurrence++;           // If yes, increment
            }
            if (modeOccurrence > occurrence)    // If value occurrences is more than current mode, it is new mode
            {
                mode = currentMode;
                occurrence = modeOccurrence;
            }
        }
        
        // Display Mode
        System.out.println("The mode is: " + mode + ". It appeared " + occurrence + " times.");
        
        // Run time
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Run time is " + ((totalTime) / 1000d) + " seconds.");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Array
        int [] arr = { 55, 9, 118, 220, 152, 200, 198, 319, 245, 315, 379, 99, 191, 
                       343, 394, 31, 3, 345, 274, 43, 52, 324, 283, 7, 65, 70, 56, 
                       344, 18, 360, 104, 349, 309, 149, 94, 160, 111, 370, 235, 8, 
                       81, 379, 213, 379, 201, 399, 390, 160, 369, 113, 340, 178, 281, 
                       160, 232, 241, 348, 160, 29, 179, 65, 327, 7, 88, 305, 180, 
                       334, 27, 303, 281, 341, 260, 393, 105, 219, 170, 346, 380, 14, 
                       134, 169, 336, 54, 178, 177, 122, 21, 145, 398, 170, 201, 104, 
                       161, 380, 332, 234, 48, 251, 105, 33 };
        
        // Call function to find most occurrance
        findMostAppearance(arr);
    }
    
}

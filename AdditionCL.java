/*
 * AdditionCL shows method overloading by using various types of arguments
 * 
 * @author Anjing Li
 * @version 1.0
 * @since 2019-12-19
 */

class AdditionCL { 
  
  /**
   * This method returns true if a triangle can be formed from user inputted sides, false otherwise.
   * 
   * @param intSide1 This is the first parameter and it is the first side
   * @param intSide2 This is the second parameter and it is the second side
   * @param intSide3 This is the second parameter and it is the third side
   * @return Boolean This returns the result of true if two sides added up is greater than the third side, false otherwise.
   */
  
  static int Addition(int intNum1, int intNum2) 
  { 
    // Return the two int added together
    return intNum1 + intNum2; 
  } // End method
  
    /**
   * This method returns true if a triangle can be formed from user inputted sides, false otherwise.
   * 
   * @param intSide1 This is the first parameter and it is the first side
   * @param intSide2 This is the second parameter and it is the second side
   * @param intSide3 This is the second parameter and it is the third side
   * @return Boolean This returns the result of true if two sides added up is greater than the third side, false otherwise.
   */
  // Addition method with identical name
  // Two double parameters
  static double Addition(double dblNum1, double dblNum2) 
  { 
    // Return the two double added together
    return dblNum1 + dblNum2; 
  } // End method
  
  public static void main(String[] args) // Main method
  { 
    // Display output
    System.out.println(AdditionCL.Addition(10, 5)); 
    
    System.out.println(AdditionCL.Addition(12.5, 9.9)); 
  } // End main
} // End class
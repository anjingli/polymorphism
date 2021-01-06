// Java program that shows method overloading 
// by using various amounts of arguments

class DivideCL { 
  
  // Divide method with two int parameters
  static int Divide(int intNum1, int intNum2) 
  { 
    // Return the two int divided
    return intNum1 / intNum2; 
  } // End method
  
  // Divide method with three int parameters
  static int Divide(int intNum1, int intNum2, int intNum3) 
  { 
    // Return the three int divided
    return intNum1 / intNum2 / intNum3; 
  } // End method
  // End class
  
  public static void main(String[] args) 
  { 
    // Display output
    System.out.println(DivideCL.Divide(10, 5)); 
    
    System.out.println(DivideCL.Divide(10, 5, 2)); 
  } // End main
} // End class
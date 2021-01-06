// Java program that shows operator overloading 
// by using the same operator two different ways

class OperatorOverloading { 
  
  void operator(String strPart1, String strPart2) 
  { 
    // Linked string w/ + operator
    String strLinked = strPart1 + strPart2; 
    System.out.println(strLinked); 
  } // End method
  
  // Use to show 
  void operator(int intNum1, int intNum2) 
  { 
    // Add integers w/ + operator
    int intNum3 = intNum1 + intNum2; 
    System.out.println(intNum3); 
  } // End method


  public static void main(String[] args) 
  { 
    OperatorOverloading obj = new OperatorOverloading(); 
    obj.operator("Brook", "lyn"); 
    obj.operator(98, 1); 
  } // End main
} // End class

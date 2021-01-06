// Java program for Method overridding 

class NineNinePrecinct { 
  
  void Print() 
  { 
    System.out.println("Police Station"); 
  } 
 
}
class Captain extends NineNinePrecinct { 
  
  void Print() 
  { 
    System.out.println("The captain is Raymond Holt."); 
  } 
} 

class Lieutenant extends NineNinePrecinct { 
  
  void Print() 
  { 
    System.out.println("The lieutenant is Terry Jeffords."); 
  } 



  public static void main(String[] args) 
  { 
    
    NineNinePrecinct a; 
    
    a = new Captain(); 
    a.Print(); 
    
    a = new Lieutenant(); 
    a.Print(); 
  } 
} 

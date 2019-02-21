
package calculation;

public class Calculation {
    void addition(int x,int y)
 {
    System.out.println("addition is " + (x+y));
 }
    
    
    void addition(int x,int y,int z)
 {
    System.out.println("addition is " + (x+y+z));
 }
    
    
    
    
    
    public static void main(String[] args) {
      Calculation c=new  Calculation();
      c.addition(20, 30);
      c.addition(20, 30,50);  
        
        
    }
    
}

package loopings;


public class ForLoop {
    public static void main(String[] args) {
        int valueA = 10;
        System.out.println("Before method calling ="+valueA);
        value(valueA);
        System.out.println("After method calling ="+valueA);


    }
    public static void value(int a) {

        a = 100;
        System.out.println("inside a method of a value = " +a);
    }
   

       //System.out.println(b);   }
   public static void example1() {
    String expectedValue = "";
    for ( int i = 1; !expectedValue.equals("12345"); i++) {
        expectedValue += i;

    }
      
   }
    public static void example2() {
        String companyName = "FUNBOOK";
        for (int i = 0; i < 10; i++) {
            System.out.println(companyName);
        }
    }
    
    public static void example3() {
        int a = 3;
        for ( a= 3; a < 10;) {
            
        }
        System.out.println(a);
    }
    public static void example4() {
        int num = 5;
        int fact = 1;
        for(num = 5; num > 1; num--){
            fact *= num;
        }
        System.out.println(fact);
    }
    public static void example5() {
        int b = 2;
        for(int c = 1; c  < 10;) {
            c++;
            b += c;
        }
   System.out.println(b);
    
    }
    public static void example6() {
        int s = 10;
        for (int i = 1; i <= s; i++) {
           
        }
       
       
        
    }
   
        

       
    
}

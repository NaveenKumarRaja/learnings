package methods;
//pass by value and pass by reference
public class Operation{  
    int data=50;
        
     
    public Operation(int data) {
        System.out.println("Constructor = " +data);
    }

    void change(int data){ 
        System.out.println("Data value  ="+ data); 
    data=data+100; 
    System.out.println("inside a method = "+data);
    }  
        
    public static void main(String args[]){  
      Operation op = new Operation(25);  
   
     
      System.out.println("before change  ="+op.data); 
      op.data += 20;
        
      op.change(30);  
      System.out.println("after change  ="+op.data);  
     
    }  
    public static void name(Operation a) {
        long A = 10;
        System.out.println(A);
        
    }
   }  
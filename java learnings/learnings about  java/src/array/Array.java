package array;

public class Array {
    public static void main(String[] args) {
        int[] arrayValue = new int[5];
        arrayValue[0] = 30;
        arrayValue[1] = 20;
        arrayValue[2] = -20;
        arrayValue[3] = -30;
        arrayValue[4] = 10;
        int add = 0;
        for (int i = 0; i < arrayValue.length; i++) {
            add += arrayValue[i];
        }
        Array objArray = new Array();
       objArray.example1(); //System.out.println(add);
    }
      public void example1() {
        int[] first = {2, 4, 5, 3, 6};
        int[] second = {9, 8, 7, 1, 0};
        int[] c = new int [first.length+second.length];
        System.out.println(c);
        int third = 0;
        
        for (int i = 0; i < second.length; i++) {
            third = first[i]+ second[i]; 
            System.out.println(third);
        }
    }
   

   public static void example3() {
       int[] arrayElements = {2, 4, 6, 8, 10};

       int sum = 0;
       for (int index = 0; index < arrayElements.length; index++) {
           sum = sum + arrayElements[index];
       } 
       System.out.println(sum);
   }
}

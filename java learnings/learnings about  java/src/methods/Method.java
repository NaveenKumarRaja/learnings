package methods;


public class Method {
    String name ;
    public static void main(String[] args) {
      char[] a = {'b', 'r','b','a','f','c'};
      for (int i = 0; i < a.length; i++) {
          if(a[i]=='a') {
          }
          else{
            System.out.println(a[i]);

          }
          
      }

    }
    public static int add(int a, int b) {
        int c = a + b;
        return  c;
    }
    public static void example1(int a) {
        a = 10;
        System.out.println(a);
    }
    public static void example2() {
        System.out.println("static Method");
    }
    public static int example3() {
        return 0;
        
    }
    public static int example4(int x, int y, int z) {
        int a = x + y -z;
        return a;
    }
    public int example5(int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;
    }
    public static void name() {
        

    }
    
}

package loopings;

public class While {
    public static void main(String[] args) {
        int a = 5;
        int f = 1;

        while (1 < a) {
            f *= a; 
            a--;
            
        }
        System.out.println(f);
    }
    
}

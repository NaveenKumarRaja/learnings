package loopings;

public class ForEach {
    public static void main(String[] args) {
        int[] eachValue = {2, 'A', 4, 5, 6, 7};
        System.out.println(eachValue[1]);
        int add = 0;
        for (int currentValue : eachValue) {
            add += currentValue;
        }
        System.out.println(add);
    }
}

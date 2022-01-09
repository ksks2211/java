package method;

import java.util.Arrays;

public class VarArgsExample {


    public static int sum(int ... values){

        System.out.println(values[0]);
        return Arrays.stream(values).sum();
    }
    public static void main(String[] args) {
        int sum = sum(1, 2, 3, 4, 5);
        System.out.println(sum);

    }
}

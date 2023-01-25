import java.util.Scanner;

public class HW8method {
    public static void main(String[] args) {

    }

    static void maxInArray(int[] max) {
        for (int j = 0; j < max.length; j++) {
            int maxV = max[j];
            for (int i = 0; i < max.length; i++) {
                if (maxV > max[i]) {
                    System.out.println(maxV);
                }
            }

        }
    }

    static void kvadratChisla (int name) {
        System.out.println(Math.pow(name, 2));

    }

}
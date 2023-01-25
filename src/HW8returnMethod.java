import java.util.Random;

public class HW8returnMethod {
    public static void main(String[] args) {
        // #8.1 Tapwyrma
        /*Random ran = new Random();
        int [] array = new int[10];
        System.out.print("Massivdin sandary: ");
        for (int j = 0; j <array.length ; j++) {
            array[j] = ran.nextInt(11,76);
            System.out.println(array[j]);
        }
        System.out.println("En chon sany: "+getMinInArray(array));*/
        System.out.println(summaUchkoTortkoBeshkeKalBolSan(10));
    }

    static int getMinInArray(int[] oa) {
        int sch2 = oa[2];
        for (int k = 0; k < oa.length; k++) {
            sch2 = Math.min(sch2, oa[k]);
        }
        return sch2;
    }

    static int summaUchkoTortkoBeshkeKalBolSan(int san) {
        int zero = 0;
        for (int i = 0; i < san; i++) {
            if (i % 3 == 0 || i % 4 == 0 || i % 5 == 0) {
                zero += i;
            }
        }return zero;
    }
}

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Practice7Array {
    public static void main(String[] args) {
        // Tapwyrma #1
       /* Random o5 = new Random();
        int[] sandar = new int[15];
        int wet4ik = 0;
        for (int i = 0; i < sandar.length; i++) {
            sandar[i] = o5.nextInt(0, 9);
            if (sandar[i] % 2 == 0) {
                wet4ik++;
            System.out.println("Anyn ichindegi jup san " + sandar[i]);}
        }
        System.out.println("Jup sandardyn jalpy sany "+wet4ik);*/



        // Tapwyrma #2
       /*int nn = 101;
        int[] numbers = new int[50];
        for (int j = 0; j < numbers.length; j++) {
            nn-=2;
            numbers[j] =nn;
            System.out.print(numbers [j]+" ");
        }*/

        // Tapwyrma #3
       /* Random universal = new Random();
        int[] ma = new int[5];
        int[] mb = new int[5];
        int zero1 = 0;
        int zero2 = 0;
        for (int k = 0; k < ma.length; k++) {
            ma[k] = universal.nextInt(0, 5);
            mb[k] = universal.nextInt(0, 5);
            zero1 += ma[k];
            zero2 += mb[k];

            System.out.println("A massivi " + ma[k]);
            System.out.println("B massivi " + mb[k]);
        }
        System.out.println("A massivinin arifmetikalyk orto sany  "+zero1/5);
        System.out.println("B massivinin arifmetikalyk orto sany  "+zero2/5);
        if(zero1 > zero2) {
            System.out.println("A massivinin arifmetikalyk orto sany 4ong");
        } else if (zero2 > zero1) {
            System.out.println("B massivinin arifmetikalyk orto sany 4ong");
        } else if (zero2 == zero1) {
            System.out.println("A massivinin arifmetikalyk orto sany B massivinin arifmetikalyk orto sanyna barabar");}
*/

        // Tapwyrma #4
      /*  Random mod = new Random();
        int a = 0;
        int b = 0;
        int c = 0;
        int[] uch = new int[11];
        for (int t = 0; t < uch.length; t++) {
            uch[t] = mod.nextInt(-1, 2);
            System.out.println(uch[t]);
            if (uch[t] == -1) {
                a++;
            } else if (uch[t] == 0) {
                b++;
            }
            else if (uch[t] == 1) {
                c++;
            }}
            System.out.println(a+" jolu '-1' sany koldonuldu ");
            System.out.println(b+" jolu '0' sany koldonuldu ");
            System.out.println(c+" jolu '1' sany koldonuldu ");
            if (a > b && a > c) {
                System.out.println("En kop '-1' sany koldonuldu ");
            } else if (b > a && b > c){
                System.out.println("En kop '0' sany koldonuldu ");
                } else if (c > a && c > b){
                System.err.println("En kop '1' sany koldonuldu ");
        } */


    }
}

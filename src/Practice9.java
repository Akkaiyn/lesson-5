import java.util.Random;
import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {

// 1-tapwyrma
       // maalymat("Akkaiyn", 28);
// 2-tapwyrma
       /* Scanner ner = new Scanner(System.in);
        System.out.println("Eki san jazynyz");
        int a = ner.nextInt();
        int b = ner.nextInt();
        int[] array = new int[20];
        for (int j = 0; j < array.length ; j++) {
            array[j] = staticMethod(a,b);
            System.out.println(array[j]);
        }*/
Scanner er = new Scanner(System.in);
        System.out.println("Eki orunduu san jazynyz");

int es = er.nextInt();
teskeriKowuuSegiz(es);

    }

//    static void maalymat(String name, int a) { // 1-tapwyrma
//        System.out.println(name + "," + a);

/*static int staticMethod(int v1, int v2){ // 2-tapwyrma
        Random dom = new Random();
        int k = dom.nextInt(v1,v2);
        return k;}*/

        static void teskeriKowuuSegiz(int san){
            System.out.println(san%10*10+san/10+8);
        }



}

import java.util.Random;

public class Lesson8returnMethod {
    public static void main(String[] args) {
      // 4-tapwyrma
      /*  Random ran = new Random();

        int [] array = new int[10];
        System.out.print("Massivdin sandary: ");
        for (int j = 0; j <array.length ; j++) {
            array[j] = ran.nextInt(3,8);
            System.out.print(array[j]);
        }
        System.out.println("En chon sany: "+getMaxInArray(array));*/

    }
    static int one(){
        return 1;
    }
    static String sandyAnyktoo (int a) {
        if (a % 2 == 0)
        {return "Bul jup san";}
        else
        {return "Bul tak san";}

    }
    static double arifmetikalykOrtoSan(double a, double b, double c){
        double k = (a+b+c)/3;
        return k;
    }
    static String ysymdynOlchomu (String ysym){
        if (ysym.length () > 6) {
            return "Ysymynyz uzun";
        }else if (ysym.length ()>= 5) {
            return "Ysymynyz orto";
        } else {
            return "Ysymynyz kyska";
        }
    }

   static int getMaxInArray(int tha[] ) {  //4-tapwyrma
        int sch = tha[0];
        int max = tha[3];
       int l = tha.length;
       for (int i = 0; i < l; i++) {
         max = Math.max(sch, tha[i]);
       } return max;


   }


}
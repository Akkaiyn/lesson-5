public class Lesson8 {
    public static void main(String[] args) {


    }

    static void myFirstMethod() {
        System.out.println("Bul menin birinchi metodum");
    }

    static void methodWithParametrs(String ysym) {
        System.out.println("Kandai " + ysym);
    }

    static void salamatsysby(String ysym) {
        System.out.println("Salamatsyzby " + ysym);
    }

    static void sumOfTwoNummers(int a, int b) {
        System.out.println(a + b);
    }

    static void sandyTaktoo(int a) {
        if (a % 2 == 0) {
            System.out.println("Bul jup san");
        } else if (a % 2 == 1) {
            System.out.println("Bul tak san");
        }
    }

    static void ekiSandynKi4inesinAnyktoo(int a, int b) {
        if (a > b) {
            System.out.println("Eki sandyn ki4inesi" + b);
        } else if (b > a) {
            System.out.println("Eki sandyn ki4inesi" + a);
        }
    }

    static void array (String[] car) {
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
    }

}

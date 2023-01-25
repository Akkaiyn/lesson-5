public class lesson10varargs {
    public static void main(String[] args) {
        summaArgumentterdin(4.4, 4, 4, 5 ,4);
    }
    static void summaArgumentterdin( double b, int ... c){
        double summ = 0;
        for (int i = 0; i < c.length; i++) {
            summ += c[i];
        }
        System.out.println(summ);
    }
}

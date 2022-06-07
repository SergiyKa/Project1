package lesson1;

public class M2HomeWork {
    public static void main(String[] args) {

        String txtToPrint = "Hello";
        String authorName = "Sergiy Karetnikov";

        int a = -5;
        int b = 8;
        int c = 6;

        double result = (double) a + b * c;

        int d = 20;
        int e = -3;
        int f = 5;
        int g = 8;

        double myResult = (double) d + (double) e * (double) f / (double) g;

        int k = 35;
        int l = 55;
        int m = 6;
        int n = 20;
        int o = 18;

        double myResult1 = (double) k * l * m * n * o;



        System.out.println(txtToPrint);
        System.out.println(authorName);
        System.out.println("The result of " + a + " and " + b + " and " + c + " is " + result);
        System.out.println("The result of " + d + " and " + e + " and " + f + " and " + g + " is " + myResult);
        System.out.println(" number " + k + " * number " + l + " * number " + m + " * number " + n + " * number " + o + " equals " + myResult1);
    }
}

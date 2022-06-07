package lesson2;

public class M3HomeWork {
    public static void main(String[] args) {
        M3HomeWork loops = new M3HomeWork();
//        loops.countNumbers();
//        loops.numbersSummary(1, 3);
        loops.numbersPyramid(10);
    }


    public void countNumbers() {
        for (int a = 1; a <= 100; a++) {
            if (a % 2 == 0 & a % 3 == 0) {
                System.out.println(a + " is divisible by two and three");
            } else if (a % 3 == 0) {
                System.out.println(a + " is divisible by three");

            } else if (a % 2 == 0) {
                System.out.println(a + " is even");
            } else {
                System.out.println(a + " is odd");
            }


        }

    }


    public void numbersSummary(int k, int l) {
        int result = 0;
        for (int i = k; i <= l; i++) {
            result = result + i;

        }
        System.out.println(result);

    }

    public void numbersPyramid(int rows) {
        for (int a = rows; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }

}


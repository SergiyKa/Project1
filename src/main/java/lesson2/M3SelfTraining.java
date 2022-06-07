package lesson2;

public class M3SelfTraining {
    public static void main(String[] args) {
        M3SelfTraining loops = new M3SelfTraining();
        loops.nearHundred();
    }

    public void nearHundred (){
        for (int n = 1; n <=100; n++) {
            if (n >= 90){
                System.out.println(n + " true");
            }
            else {
                System.out.println(n + " false");
            }
        }
    }


}

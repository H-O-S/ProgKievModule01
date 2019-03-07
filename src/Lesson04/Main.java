package Lesson04;

public class Main {
    public static void main(String[] args) {
        int[] x = new int[28];
        for (int i = 0; i < x.length; i++) {
            x[i] = i * 635;
            if (i==0 || i==14 || i==27){
                System.out.println(x[i]);
            }
        }
    }
}

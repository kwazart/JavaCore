package main.java.com.kwazarArt.javacore.chapter03;

public class TwoDArray {
    public static void main(String[] args) {
        int twoD[][] = new int [4][5];
        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf(twoD[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
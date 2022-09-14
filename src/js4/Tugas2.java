/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
package js4;

/**
 *
 * @author FarhanNvl
 */
public class Tugas2 {
    public static void main(String[] args) {

        int x = 10, y = 23, z = 5;

        int max;

        System.out.println("number 1 = " + x);
        System.out.println("number 2 = " + y);
        System.out.println("number 3 = " + z);
        // mencari nilai tertinggi dengan operator kondisi
        max = (y >= x) ? y : x;
        max = (z >= max) ? z : max;
        System.out.println("Nilai Tertingginya adalah angka = " + max);

    }

}

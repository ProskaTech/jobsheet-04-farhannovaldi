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
public class KondisiOperator {
    public static void main(String[] args) {
        String status = "";
        int grade = 50;

        // mendapatkan status pelajar
        status = (grade >= 60) ? "passed" : "fail";

        // print semua
        System.out.println(status);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class Hw2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, count = 0;
        boolean bool = true;
        System.out.println("Nhap vao mot so: ");
        input = sc.nextInt();
        for (int i = 2; i <= sqrt(input); i++) {
            if (input % i == 0) {
                count++;
            }
        }
        if (count != 0) {
            bool = false;
            System.out.println(bool);
        } else {
            bool = true;
            System.out.println(bool);
        }
    }

}

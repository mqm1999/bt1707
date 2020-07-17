/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class Hw4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random());
        int input;
        while (true) {
            System.out.println("Nhap vao so ban doan: ");
            input = sc.nextInt();
            if (input > random) {
                System.out.println("Qua cao, thu lai");
            } else if (input < random) {
                System.out.println("Qua thap, thu lai");
            } else {
                System.out.println("Doan dung");
                break;
            }
        }
    }
}

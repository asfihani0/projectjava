/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpertama;

import java.util.Scanner;

/**
 *
 * @author Rizky-PC
 */
public class Percabangan {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int angka;
        String output;
        
        System.out.println("Masukkan angka : ");
        angka = keyboard.nextInt();
        
        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " adalah Bilangan Genap");
        } else {
            System.out.println("Angka " + angka + " adalah Bilangan Ganjil");
        }
        
        //ternary
        
        System.out.println("Masukkan angka : ");
        angka = keyboard.nextInt();
        
        output = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println("Angka inputan kamu adalah " + output);
        
        //nested if
        
        System.out.println("Masukkan angka : ");
        angka = keyboard.nextInt();
        
        if (angka % 2 == 0) {
            if (angka > 10 ) {
                System.out.println("Angka " + angka + " kurang dari 10");
            }
        } else {
            System.out.println("Angka " + angka + " adalah Bilangan Ganjil");
        }
        
    }
}

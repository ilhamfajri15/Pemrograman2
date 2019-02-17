/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jawaban1;

import java.util.Scanner;

/**
 *
 * @author IlhamF
 */
public class AktifitasCircle {
    Scanner input;
    
    Circle C1 = new Circle();
    Circle C2 = new Circle();
    String[] hasil;
    String[] hasil2;
    int jarak_lingkaran;

    public AktifitasCircle() {
        this.input = new Scanner(System.in);
    }

    public void lingkaran1() {
        System.out.println("Masukan nilai dengan format (x,y,r) di lingkaran ke - 1 : ");

        hasil = input.next().split(",", 3);
        
        C1.setX(Integer.parseInt(hasil[0]));
        C1.setY(Integer.parseInt(hasil[1]));
        C1.setR(Integer.parseInt(hasil[2]));
        
        System.out.println("");
    }

    public void lingkaran2() {
        System.out.println("Kemudian Masukan nilai dengan format (x,y,r) di lingkaran ke - 2 : ");

        hasil2 = input.next().split(",", 3);
        
        C2.setX(Integer.parseInt(hasil2[0]));
        C2.setY(Integer.parseInt(hasil2[1]));
        C2.setR(Integer.parseInt(hasil2[2]));
        
        System.out.println("");
    }

    public void salah() {
        System.out.println("Mohon maaf Anda salah menginputkan lingkaran ke-1 seharusnya menggunakan tanda koma(,)");
        System.out.println("Silahkan ulangi kembali");
        System.out.println("");

        lingkaran1();
    }

    public void salah2() {
        System.out.println("Mohon maaf Anda salah menginputkan lingkaran ke-2 seharusnya menggunakan tanda koma(,)");
        System.out.println("Silahkan ulangi kembali");
        System.out.println("");

        lingkaran2();
    }

    public void hitung() {
        jarak_lingkaran = (int) Math.sqrt(Math.pow((C1.getX() - C2.getX()), 2) + Math.pow((C1.getY() - C2.getY()), 2));

        if (jarak_lingkaran >= (C1.getR() + C2.getR())) {
            System.out.println("");
            System.out.println("Hasil : ");
            System.out.println("C1 dan C2 Saling Lepas");
        } else if (jarak_lingkaran < (C1.getR() + C2.getR())) {
            if ((C1.getR() < C2.getR()) && (((C1.getX() + C1.getR() < C2.getX() + C2.getR()) && (C1.getX() - C1.getR() > C2.getX() - C2.getR()) && (C1.getY() + C1.getR() < C2.getY() + C2.getR()) && (C1.getY() - C1.getR() > C2.getY() - C2.getR())))) {
                System.out.println("");
                System.out.println("Hasil : ");
                System.out.println("C1 ada di dalam C2");
            } else if ((C1.getR() > C2.getR()) && (((C1.getX() + C1.getR() > C2.getX() + C2.getR()) && (C1.getX() - C1.getR() < C2.getX() - C2.getR()) && (C1.getY() + C1.getR() > C2.getY() + C2.getR()) && (C1.getY() - C1.getR() < C2.getY() - C2.getR())))) {
                System.out.println("");
                System.out.println("Hasil : ");
                System.out.println("C2 ada di dalam C1");
            } else {
                System.out.println("");
                System.out.println("Hasil : ");
                System.out.println("C1 dan C2 saling beririsan");
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
     

        AktifitasCircle C = new AktifitasCircle();

        //C 1
        try {
            C.lingkaran1();
        } catch (Exception e) {
            C.salah();
        }

        //C 2
        try {
            C.lingkaran2();
        } catch (Exception i) {
            C.salah2();
        }

        // logic dan hasil
        C.hitung();
    }

   


 }

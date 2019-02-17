/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jawaban3;

/**
 *
 * @author IlhamF
 */
public class Main {
    public static void main(String[] args) {


        Manajer manajer = new Manajer("Sanie", "Ujung Berung", 6000000);
        manajer.setBonus(5000000);
        Employee staff1 = new Staff("Vudlinx", "Ciroyom", 4000000);
        Employee staff2 = new Staff("Ardi", "Kopo", 4000000);

        System.out.println("Nama Manajer    : " + manajer.getName());
        System.out.println("Alamat Rumah    : " + manajer.getAddress());
        System.out.println("Gaji Manajer    : " + manajer.getSalary());
        System.out.println("");

        System.out.println("Nama Staff      : " + staff1.getName());
        System.out.println("Alamat Rumah    : " + staff1.getAddress());
        System.out.println("Gaji Staff      : " + staff1.getSalary());
        System.out.println("");

        System.out.println("Nama Staff      : " + staff2.getName());
        System.out.println("Alamat Rumah    : " + staff2.getAddress());
        System.out.println("Gaji Staff      : " + staff2.getSalary());
    }

}
    


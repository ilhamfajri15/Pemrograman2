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
public class Manajer extends Employee {
    
    private int bonus;

    public Manajer(String name, String address, int salary) {
        super(name, address, salary);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = 5000000;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + getBonus(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
   
    
}

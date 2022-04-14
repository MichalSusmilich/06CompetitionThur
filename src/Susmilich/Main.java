/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Susmilich;

import java.util.Scanner;

/**
 *
 * @author michal.susmilich
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        Zavodnik petr = new Zavodnik("Petr", 1, "muž", 1);
            System.out.println(petr);
            System.out.println(petr);
            petr.setTimeEnd("10:02:05");
            System.out.println(petr);
        }catch(StartTimeNotSet e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Chyby");
        }
    }
    
}

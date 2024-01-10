/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1;

/**
 *
 * @author Riaan HP
 */
public class ScopeApp {

    static int x;
    public static void main(String[] args) {
        x = 5;
        System.out.println("main: x = " + x);
        MyMethod();
    }
    
    public static void MyMethod() {
        int y;
        y = 10;
        
        if (y == x+5) {
            int z;
            z = 15;
            System.out.println("MyMethod: z = " + z);
        }
        System.out.println("MyMethod: x = " + x);
        System.out.println("MyMethod: y = " + y);
    }
    
}

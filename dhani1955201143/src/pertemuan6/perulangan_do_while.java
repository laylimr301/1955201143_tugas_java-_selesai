/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author NEC
 */
public class perulangan_do_while {
    public static void main(String[] args) {
        int i=0;
        System.out.println("makan");
        while (i < 5){
            System.out.println("minum" + ++i);
            
        }
        System.out.println("mandi");
        i=0;
        do {
            System.out.println("ghibah" + ++i);
        }
        while (i<5);
    }
        
    
    

}
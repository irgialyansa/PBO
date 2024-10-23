/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaAritmatika;

/**
 *
 * @author orgyy
 */
public class JavaAritmatika {
    public static void main(String[] args) {
        // operasi aritmatika
        int variable1 = 100;
        int variable2 = 20;
        
        int hasil;
        
        // 1.penjumlahan
        hasil = variable1 + variable2;
        System.out.println(variable1 + "+" + variable2 + "=" + hasil);
        
        // 2.pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d-%d = %d \n",variable1,variable2,hasil);
        
        // 3. perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d*%d = %d \n",variable1,variable2,hasil);
        
        // 4. pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d/%d = %d \n",variable1,variable2,hasil);
        
        // 5. modulus
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);
    }
}

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProducted;
import entities.Product;
import entities.usedProduct;

public class Exercicio_Condicional_2 {
    
    /** 
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) throws Exception {
    
    Scanner sc=new Scanner(System.in);
/*Introduza a quantidade de números pares que quer ver

 */
    
System.out.println("Introduza o numero para escrever os pares ");
Integer Numeros = sc.nextInt();

int t = 0, i = 0;
    while (t < Numeros) {

        if (i % 2 == 0) {
            t++;
            System.out.println(i);
        }

        i++;
    }

}

}

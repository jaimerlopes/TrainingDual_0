import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProducted;
import entities.Product;
import entities.usedProduct;

public class Exercicio_Condicional_1 {
    
    /** 
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) throws Exception {
    
    Scanner sc=new Scanner(System.in);
/*2.	Escreva um programa em Java que leia o nome (String) ,
 o sexo (char) e o estado civil de uma pessoa (String). Caso sexo seja “F” 
 e estado civil seja “CASADA”, solicitar o tempo de casada em anos.

 */
    
         System.out.println("Introduza o Nome");
         String nome=sc.nextLine();
        System.out.println("Introduza o sexo");
        char sexo= sc.nextLine().charAt(0);
        System.out.println("Introduza o estado civil");
         String estadoCivil=sc.nextLine();

         if(sexo=='F' && estadoCivil.contentEquals("Casada")){

                     System.out.println("Introduza numeros de anos");
                    Integer nAnos=sc.nextInt();

                    System.out.println("anos de casados= "+nAnos.toString());
         }
        
    }


}

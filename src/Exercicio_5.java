import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProducted;
import entities.Product;
import entities.usedProduct;

public class Exercicio_5 {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static  Integer NumeroDeBroas=0;
    public static Integer NumeroDeBaguetes=0;

    public static void main(String[] args) throws Exception {
    
    Scanner sc=new Scanner(System.in);


    /*A empresa Tempus Fugit paga 20,00€ por hora normal trabalhada e 25,00€ por hora extra.
Escreva um programa em Java para calcular e imprimir o salário bruto e o salário líquido de um 
determinado funcionário. Considere que o salário líquido é igual ao salário bruto descontando-se 10% de
 impostos.

     */

    System.out.println("Introduza o numero de horas trabalhadas");
    float horasNormais = sc.nextFloat();
    System.out.println("Inserir horas extras ");
    float horasExtras = sc.nextFloat();
    
    double ordendoBruto =horasNormais*20.00+horasExtras*25.00;
    double ordendoLiquido = ordendoBruto*0.90;


    System.out.printf("Ordenado Bruto:  %.3f  - Ordenado liquido: %.3f",ordendoBruto, ordendoLiquido);
    
    }


}

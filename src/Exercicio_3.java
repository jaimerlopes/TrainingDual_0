import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProducted;
import entities.Product;
import entities.usedProduct;

public class Exercicio_3 {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static  Integer NumeroDeBroas=0;
    public static Integer NumeroDeBaguetes=0;

    public static void main(String[] args) throws Exception {
    
    Scanner sc=new Scanner(System.in);

    /*Uma fábrica de t-shirts produz os tamanhos pequeno, médio e grande, cada uma sendo vendida respetivamente por 10, 12 e 15 Euros.
    Construa um programa em java em que o utilizador forneça  a quantidade de t-shirts pequenas, médias e grandes referentes a uma venda e a 
    máquina informe quanto será o valor arrecadado por essa venda.
     */

    System.out.println("Quantas T-Shirts pequenas vendeu? ");
    Integer NumeroTshirtsPequenas = sc.nextInt();
    System.out.println("Quantas T-Shirts médias vendeu? ");
    Integer NumeroTshirtsMedias = sc.nextInt();
    System.out.println("Quantas T-Shirts grandes vendeu? ");
    Integer NumeroTshirtsGrandes = sc.nextInt();
    System.out.printf("Total Vendas T-Shirts - %,.3f",TotalVendaTshirts(NumeroTshirtsPequenas, NumeroTshirtsMedias, NumeroTshirtsGrandes));
    
    }

    public static double TotalVendaTshirts(Integer NumeroTshirtsPequenasL, Integer NumeroTshirtsMediasL, Integer NumeroTshirtsGrandes){

        return NumeroTshirtsGrandes*15+NumeroTshirtsMediasL*12+NumeroTshirtsPequenasL*10;
    }
   


}

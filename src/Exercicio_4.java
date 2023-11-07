import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProducted;
import entities.Product;
import entities.usedProduct;

public class Exercicio_4 {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static  Integer NumeroDeBroas=0;
    public static Integer NumeroDeBaguetes=0;

    public static void main(String[] args) throws Exception {
    
    Scanner sc=new Scanner(System.in);
    
    // List<Product> listProdcut=new ArrayList<>();
    
    // SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/YYYY");
 
    /*
    Três amigos - Carlos, André e Filipe – foram jantar e decidiram dividir igualmente a conta do restaurante. 
    Escreva um programa em Java que leia o valor total da conta e calcule e imprima quanto cada um deve pagar,
     mas fazendo com que o Carlos e o André não paguem cêntimos. Ex: uma conta de 101,53€ resulta em 33,00€ para
      o Carlos e para o André mas 35,53 para o Filipe.
     */

    System.out.println("Qual foi o valor total da conta? ");
    Double TotalConta = sc.nextDouble();
    Integer TotalIndividual = TotalConta.intValue()/3;
    double TotalFilipe=(TotalConta%3)+TotalIndividual;
    System.out.printf("Total para individual %d, total filipe = %.3f=",TotalIndividual, TotalFilipe);
    
    }


    // public static double DespesaPorPessoa(double DespesaL,Integer NumerodePessoas, Boolean arrecadado){

        

    //     return NumeroTshirtsGrandes*15+NumeroTshirtsMediasL*12+NumeroTshirtsPequenasL*10;
    // }
   


}

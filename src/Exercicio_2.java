import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProducted;
import entities.Product;
import entities.usedProduct;

public class Exercicio_2 {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static  Integer NumeroDeBroas=0;
    public static Integer NumeroDeBaguetes=0;

/*
 * 
 * A padaria Coma Com Pão vende baguetes franceses broas. Cada pãozinho custa 0,12€ e cada broa custa 1,50€.
 *  Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas juntos e quanto deve guardar numa conta de poupança 
 * (10% do total arrecadado). Você foi contratado para fazer um programa que faça os cálculos para o dono da padaria. Com base nestes factos,
 *  escreva um programa em Java para ler as quantidades de pães e de broas, e depois calcular e escrever os valores solicitados.
 */


    public static void main(String[] args) throws Exception {
    
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Quantos baguetes vendeu? ");
    
    NumeroDeBaguetes=sc.nextInt();

     System.out.println("Quantas Broas? ");
    
     NumeroDeBroas=sc.nextInt();

    double TotalVEndas= CalcularTotalVendas(NumeroDeBaguetes, NumeroDeBroas);

    System.out.println("Total valor Vendas - "+TotalVEndas);

    System.out.println("Total valor Vendas - "+CalcularTotalVendasGlobal());
    
    //2System.out.println("Deve guardasr - "+QuantoDeveGuardar(TotalVEndas,0.10));
    System.out.printf(" Deve guardasr - %,.3f",QuantoDeveGuardar(TotalVEndas,0.10));

    }


   public static double CalcularTotalVendas(Integer NumeroBaguetesL, Integer NumeroDeBroasL){

        return NumeroBaguetesL*0.10+NumeroDeBroasL*1.50;

    }

    public static double CalcularTotalVendasGlobal(){

    
        return NumeroDeBaguetes*0.12+NumeroDeBroas*1.50;

    }
    
    
    public static double QuantoDeveGuardar(double TotalVEndasL, Double Percentagem){

        return TotalVEndasL*Percentagem;

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediaescolar;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nome;
        Double peso;
        int idade;
                Double altura;
                Double imc;
                for(int i=1;i<= 3;i++){
                    System.out.println("Digite seu nome:");
                    nome = sc.next();
                    System.out.println("Digite sua idade:");
                    idade = sc.nextInt();
                    System.out.println("Digite seu peso:");
                    peso = sc.nextDouble();
                    System.out.println("Digite sua altura");
                    altura = sc.nextDouble();
                    imc = peso/(altura*altura);

                    System.out.println("nome "+nome+" idade "+idade);

                    System.out.println("peso "+peso+" altura "+altura);

                    System.out.println("imc " +imc);
                    if (imc<18.5){
                        System.out.println("Imc abaixo do peso normal");
                    }else if(imc<=24.9){
                        System.out.println("Imc peso normal");
                    }else if(imc<=29.9){
                        System.out.println("Imc excesso de peso");
                    }else if(imc<=34.9){
                        System.out.println("Imc obesidade classe I");
                    }else if(imc<=39.9){
                        System.out.println("Imc Obesidade classe II");
                    }else if(imc>=40.0){
                        System.out.println("Imc obesidade classe III");

                    }
                
                }                   
}
   
}


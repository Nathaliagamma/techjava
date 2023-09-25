/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaescolar;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Infantil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nome;
        int idade;
        
        System.out.println("Digite o nome da criança:");
        nome = sc.next();
        
        System.out.println("Digite a idade da criança:");
        idade = sc.nextInt();
        
        if(idade<=2){
            System.out.println("criança ="+nome+"Encaminhar ao berçario");
    }else if(idade<=4){
        System.out.println("criança ="+nome+"Encaminhar ao infantil A");
    }else if(idade<=5){
        System.out.println("criança ="+nome+"Encaminhar ao infantil B");
    }else if(idade <=6){
        System.out.println("criança ="+nome+"Encaminhar ao infantil C");
    }else{
        System.out.println("criança ="+nome+" fora da tabela");
    }
        
        
    }
    
}
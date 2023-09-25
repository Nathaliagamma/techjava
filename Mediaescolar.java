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
public class Mediaescolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Double n1,n2,n3,n4,media;
        
        
        System.out.println ("Digite a nota 1° Bimestre:");
        n1 = sc.nextDouble();
        
        System.out.println ("Digite a nota 2° Bimestre:");
        n2 = sc.nextDouble();
        
        System.out.println ("Digite a nota 3° Bimestre:");
        n3 = sc.nextDouble();
        
        System.out.println ("Digite a nota 4° Bimestre:");
        n4 = sc.nextDouble();
        media = (n1+n2+n3+n4)/4;
       /* if(media>=6){
            System.out.println("Aluno Aprovado! - Media = "+media);
        }
        else if (media>=3){
            System.out.println("Aluno Recuperacao! - Media = "+media);
        }
            else{
                    System.out.println("Aluno Reprovado! - Media = "+media);
                 
        }*/
        if(media<3){
            System.out.println("Aluno Reprovado! - Media = "+media);
        }
        else if (media<=5.9){
            System.out.println("Aluno Recuperacao! - Media = "+media);
        }
            else{
                    System.out.println("Aluno Aprovado! - Media = "+media);
                 
        }
    }
    
}

/*
if (media<3) {
*/
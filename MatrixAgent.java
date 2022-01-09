/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixagent;
import java.util.Scanner;

/**
 *
 * @author Mehmet Baran Geylani
 */
public class MatrixAgent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Environment env = new Environment();
        Agent agent = new Agent();
        agent.clean(env);
        */
        
        
        int a,b;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("A sayisini giriniz: ");
        a = sc.nextInt();
        System.out.println();
        System.out.print("B sayisini giriniz: ");
        b = sc.nextInt();
        
        int sonuc = 1;
        
        for(int i=0; i<b; i++){
            sonuc = a*sonuc;
        }
        System.out.println(sonuc);
        
        if(a<5){
            System.out.print(a);
        }
    }
}

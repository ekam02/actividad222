/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad222;
import java.util.Scanner;
/**
 *
 * @author Enrique A. Martínez Agudelo
 */
public class Actividad222 {

    /**
     * @param args the command line arguments
     */
    
    public static int dayToSeg(int D)
    {
        int seg = D*24*60*60;
        return seg;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Digite el número de días a convertir");
        
        Scanner day = new Scanner(System.in);
        
        int dia = day.nextInt();
        
        if (dia == 1) {
            System.out.println(dia+" día equivale a: "+dayToSeg(dia)+" segundos.");
        }
        else {
            System.out.println(dia+" días equivalen a: "+dayToSeg(dia)+" segundos");
        }
    }
    
}

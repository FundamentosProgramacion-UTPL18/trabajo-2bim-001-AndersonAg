/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;
/**
 * @author Anderson
 */
public class clase9_ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double [] calificaciones_prog={18,19,15,16,17,10};
    double [] calificacionbd={10,12,13,20,17,20};
    double [] calificaciones_promedios=new double[6];
    double [] promedios = new double[6];
    
    for (int contador=0; contador<calificacionbd.length; contador++){
        double suma = calificaciones_prog[contador] + calificacionbd[contador];
        double promedio=suma/2;
        promedios[contador]=promedio;
    }
    for (int i=0; i<promedios.length; i ++){
        System.out.printf("Estudiante %d\t%-12.2f\t%-13.2f\t%.2f\n",i+1,calificaciones_prog[i],calificacionbd[i],promedios[i]);
 
        
    }
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;
/**
 * @author Anderson
 */
public class clase9_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7};
        int mult;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                for (int j = 1; j <= 12; j++) {
                  
                    mult = arreglo[i] * j;
                    System.out.printf("%d*%d=%d\n", arreglo[i], j, mult);
                }
                System.out.printf("\n");
            }
        }

    }

}
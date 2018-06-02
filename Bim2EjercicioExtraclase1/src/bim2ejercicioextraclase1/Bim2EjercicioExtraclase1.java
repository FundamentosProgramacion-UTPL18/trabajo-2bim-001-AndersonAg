package bim2ejercicioextraclase1;

/**
 *
 * @author Anderson Aguirre
 */
public class Bim2EjercicioExtraclase1 {

    public static void main(String[] args) {

        //Declaración de variables a utilizar.
        double[] ventames1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventames2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double[] ventames3 = {2300.2, 1200.2, 4700.2, 3200.1};
        double[] vtotalsucursal = new double[4];
        double[] promedioventasucursal = new double[4];
        double sumatotal, promediototal, total = 0;
        String[] mes = {"AGOSTO", "OCTUBRE", "DICIEMBRE"};
        String[] sucursales = {"SUCURSAL NRO 1", "SUCURSAL NRO 2", "SUCURSAL NRO 3", "SUCURSAL NRO 4"};
        String reporteventas;

        reporteventas = String.format("Reporte Final:\n\n%-18s%-18s%-18s%-18s%-18s%-18s\n\n", "", mes[0], mes[1], mes[2], "Total", "Promedio");

        //El for a continuacion recorre,  suma e imprime todos los valores de nuestras listas.
        for (int contador = 0; contador < vtotalsucursal.length; contador++) {
            sumatotal = ventames1[contador] + ventames2[contador] + ventames3[contador];
            promediototal = sumatotal / mes.length;
            vtotalsucursal[contador] = sumatotal;
            promedioventasucursal[contador] = promediototal;
            reporteventas = reporteventas + String.format("%-18s%-18.2f%-18.2f%-18.2f%-18.2f%-18.2f\n", sucursales[contador], ventames1[contador], ventames2[contador], ventames3[contador], vtotalsucursal[contador], promedioventasucursal[contador]);
        }
        //El for siguiente sirve para obtener el total de ventas de las sucursales.
        for (int contador = 0; contador < vtotalsucursal.length; contador++) {
            total = vtotalsucursal[contador] + total;
        }

        reporteventas = reporteventas + String.format("\n\t El total de ventas de todas la sucursales es de: %.2f", total);
        System.out.println(reporteventas);
    }

}

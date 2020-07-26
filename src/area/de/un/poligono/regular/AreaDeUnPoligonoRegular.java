package area.de.un.poligono.regular;
import java.util.Scanner;
import java.text.DecimalFormat;
public class AreaDeUnPoligonoRegular {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        DecimalFormat dec = new DecimalFormat("#.000");
        int s = 0;
        int n = 0;
        
        System.out.println("Hola! Escribe la longitud de uno de los lados del poligono");
        s = entrada.nextInt();
        System.out.println("Ahora escribe la cantidad de lados que tiene el poligono");
        n = entrada.nextInt();
        double a = (double) (n*Math.pow(s, 2)/(4*Math.tan((Math.PI/n))));
        System.out.println("");
        System.out.println("El area del poligono es igual a" + " " + dec.format(a) + " " + "cm^3");
    }
    
}

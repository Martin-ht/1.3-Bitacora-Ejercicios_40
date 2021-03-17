/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericos;
import java.util.Scanner;
/**
 *
 * @author luordes
 */
public class MetodosNumericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
       double x11,x22;
        
       boolean salir = false; 
        int menu;
        do {
           System.out.println("==========================================");
        System.out.println("Introduce un número: ");
        System.out.println("1.Para calcular el valor de euler a la x");
        System.out.println("2.Para calcular el valor de euler a la -x");
        System.out.println("3.Para calcular ecuacion cuadrartica por formula general");
        System.out.println("4.Para calcular ecuacion cuadrartica por PoSheLoh");
        System.out.println("5.Para calcular ecuacion cuadrartica por factorización");
        System.out.println("6.salir");
            System.out.println("==========================================");
         menu = teclado .nextInt();
         System.out.println("==========================================");
         switch(menu){
                case 1:
                    System.out.println("==========================================");
                    System.out.println("APARTADO (1) EULER A LA X");
                    System.out.println("==========================================");
                System.out.println("Calcular e^x con la formula de: e^x=∑(n) x^j/j!");
               System.out.println("==========================================");
                System.out.println("introduce un valor para x");
                int x = teclado.nextInt();
                System.out.println("introduce un valor para j");
                int j = teclado.nextInt();
                double sumatoria = 0;
                for (int i = 0; i < j+1; i++) {
                    sumatoria = sumatoria + Math.pow(x, i) / (factorial(i));
                }
                System.out.println("==========================================");
                System.out.println("resultado: " + sumatoria); 
                System.out.println("==========================================");
                    break;
                
                case 2:
                    System.out.println("==========================================");
                    System.out.println("APARTADO (2) EULER A LA -X");
                    System.out.println("==========================================");
                System.out.println("Calcular e^-x con la formula de: e^-x=1/∑(n) (x^j/j!)");
                System.out.println("");
                System.out.println("introduzca X");
                int x2 = teclado.nextInt();
                System.out.println("introduzca j");
                int j2 = teclado.nextInt();
                double sumatoria2 = 0;

                for (int i = 0; i < j2 + 1; i++) {
                    sumatoria = sumatoria2 + 1 / (Math.pow(x2, i) / (factorial(i)));
                }
                System.out.println("==========================================");
                System.out.println("resultado: " + sumatoria2);  
                System.out.println("==========================================");
                    
                    break;
                    
                case 3:
                    System.out.println("==========================================");
                   System.out.println("APARTADO (3) FORMULA GENERAL PARA ECUACIONES CUADRATICAS");
                    double a,b,c;
                   System.out.println("cual es el valor de a (x cuadrada)");
        a = teclado.nextDouble();
        System.out.println("cual es el valor de b (x)");
        b = teclado.nextDouble();
        System.out.println("cual es el valor de c");
        c = teclado.nextDouble();
        Ecuaciones_cuadraticas xt=new Ecuaciones_cuadraticas();
        System.out.println("==========================================");
         xt.FormulaGeneral(a,b,c);
        System.out.println("==========================================");
      
                    break;

                case 4:
                    System.out.println("==========================================");
                    System.out.println("APARTADO (4) POSHENLOH PARA FUNCIONES CUADRADAS");
                 System.out.println("Calcular ecuación cuadratica por PoShenLoh ");
                 System.out.println("");
                   double a1,b1,c1;
                System.out.println("Introduce un valor para a(x^2)");
                a1=teclado.nextDouble();
                System.out.println("Introduce un valor para b(x)");
                b1=teclado.nextDouble();
                System.out.println("Introduce un valor para c(termino independiente)");
                c1=teclado.nextDouble();
                System.out.println("==========================================");
                Ecuaciones_cuadraticas metodos1 = new Ecuaciones_cuadraticas();
                metodos1.Metodo_PoShenLoh(a1,b1,c1);
                System.out.println("==========================================");
                      
                    break;
                    
                case 5:
                    System.out.println("==========================================");
                    System.out.println("APARTADO (5) PARA LA UNION O FACTORIZACION DE ECUACIONES CUADRADAS");
                     double a2,b2,c2;
                     double a11,b11,c11;
        System.out.println("cual es el valor de a");
        a2 = teclado.nextDouble();
        System.out.println("cual es el valor de b");
        b2 = teclado.nextDouble();
        System.out.println("cual es el valor de c");
        c2 = teclado.nextDouble();
        System.out.println("================================");
        System.out.println("valores de la segunda ecuacion");
        System.out.println("================================");
        System.out.println("cual es el valor de a");
        a11 = teclado.nextDouble();
        System.out.println("cual es el valor de b");
        b11 = teclado.nextDouble();
        System.out.println("cual es el valor de c");
        c11 = teclado.nextDouble();
        System.out.println("____________________________________________");
        Ecuaciones_cuadraticas metodos2 = new Ecuaciones_cuadraticas();
        
        metodos2.FactorizarLaEcuacion(a2, b2, c2, a11, b11, c11);
                
                    
                    break;
                    case 6:
                        salir = true;
                    break;   
                default:
     System.out.println("el numero que usted marco no esta disponible "
                        + "\no se encuentra fuera del area de servicio");
            }
        } while (menu!=6);
    System.out.println("==========================================");
       System.out.println("Fin del menu");
        System.out.println("QUE TENGA UN BUEN DIA :3");
        System.out.println("==========================================");

    }
    
     public static int factorial (int numero) {
        double factorial;
        if (numero==0)
        return 1;
        else
        return numero * factorial(numero-1);
    }
        
}

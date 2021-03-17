/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericos;

/**
 *
 * @author luordes
 */
public class Ecuaciones_cuadraticas {
    
    
    public static boolean discriminante(double a,double b,double c){
        double discriminante;
        discriminante=(Math.pow(b,2))-(4*(a)*(c));
        if(discriminante<0){
            return true;
        }
        else{
            return false;
        }
     }
    public static void FormulaGeneral(double a,double b,double c){
    double raiz= Math.sqrt ((Math.pow(b, 2))- 4*a*c);
        if(raiz<0){
            System.out.println("El problema no tiene solucion");
        }else{
            double x1,x2;
            x1 = (-b + raiz)/(2*a);
            x2 = (-b - raiz)/(2*a);
            System.out.println("x1 = " +x1);
            System.out.println("x2 = " +x2);
        }
}
   
     public static void Metodo_PoShenLoh(double a, double b, double c){
        double ac=(Math.pow(b,2))-(4*(a)*(c));
        if(ac<0){
            System.out.println("El problema no tiene solucion");
        }
        else{
            double b1=b/a;
            double c1=c/a;
            double t=-(b1)/2;
            double u=Math.sqrt((c1-(Math.pow(t, 2)))*-1);
            double x1=t+u;
            double x2=t-u;
            System.out.println("x1="+ x1);
            System.out.println("x2="+ x2); 
     }
   }
     
      public static void FactorizarLaEcuacion(double a, double b , double c,double a2,double b2,double c2){
        double aF, bF, cF;
        aF = a - a2;
        bF = b - b2;
        cF = c - c2;
        System.out.println("la factorizacion es = " + aF +"x´2 "+ bF + "x " + cF);
    }
     
}

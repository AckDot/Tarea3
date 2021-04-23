
/**
 * Write a description of class Calculadora here.
 *
 * @author José Roberto Vargas Orellana
 * @version (a version number or a date)
 */
public class Calculadora
{
    String solucionesMetodos;
   
    Calculadora(){
    }
   

    public String ObtenerValoresDeX(double a, double b , double c){
        double discriminante = Math.pow(b,2)- (4*a*c);
        if(discriminante >0){
            double xpositivo = ((-(b)+ Math.sqrt(discriminante))/ (2*a));
            double xnegativo = ((-(b) -Math.sqrt(discriminante))/ (2*a));
            this.solucionesMetodos = "SE OBTUVO LOS SIGUIENTES RESULTADOS x1:"+xpositivo+" Y x2: "+xnegativo;
            return this.solucionesMetodos;
        }else if(discriminante < 0){
            double x = ((-(b))/ (2*a));
            this.solucionesMetodos ="SE OBTUVO LOS SIGUIENTES RESULTADOS x1:"+x+"+raiz de("+discriminante+") Y x2: "+x+"+raiz de("+discriminante+")";
            return solucionesMetodos;
        }else if(discriminante ==0){
            double x = (-(b)/ (2*a));
            this.solucionesMetodos ="tiene una unica solucion : "+x;
            return solucionesMetodos;
        }else{
           
            return "DATOS INCORRECTOS";
        }
    }

    public String FormulaRecta(Punto pt1 , Punto pt2){
        double sumaX =pt1.getAbscisas()+pt2.getAbscisas();
        double sumaY=pt1.getOrdenadas()+pt2.getOrdenadas();
        double pendiente =(sumaX/sumaY);
        return "la formula es : "+"y -"+pt1.getOrdenadas()+" ="+pendiente+"(x -"+pt1.getAbscisas()+")";
    }

    public String BuscarCateto(double hip, double c1){
        double auxc2 = Math.pow(hip, 2)-Math.pow(c1,2);
        double c2 = Math.sqrt(auxc2);
        if(auxc2>=0){
        return "el cateto faltante es :"+c2;
    }
        else{
        return "es un numero imaginario raizcuadrada de:"+auxc2;
        }
      
    }
}

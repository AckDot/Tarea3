
/**
 * Write a description of class Calculadora here.
 *
 * @author José Roberto Vargas Orellana
 * @version (a version number or a date)
 */
public class Calculadora
{

    Calculadora(){

    }

    public String ObtenerValoresDeX(double a, double b , double c){
        double discriminante = Math.pow(b,2)- (4*a*c);
        if(discriminante >0){
            double xpositivo = ((-(b)+ Math.sqrt(discriminante))/ (2*a));
            double xnegativo = ((-(b) -Math.sqrt(discriminante))/ (2*a));
            return "SE OBTUVO LOS SIGUIENTES RESULTADOS x1:"+xpositivo+" Y x2: "+xnegativo;
        }else if(discriminante < 0){
            double x = ((-(b))/ (2*a));

            return "SE OBTUVO LOS SIGUIENTES RESULTADOS x1:"+x+"+raiz de("+discriminante+") Y x2: "+x+"+raiz de("+discriminante+")";
        }else if(discriminante ==0){
            double x = (-(b)/ (2*a));
            return"tiene una unica solucion : "+x;
        }else{
            return "DATOS INCORRECTOS";
        }
    }

    public String FormulaRecta(Punto pt1 , Punto pt2){
        double sumaX =pt1.getAbscisas()+pt2.getAbscisas();
        double sumaY=pt1.getOrdenadas()+pt2.getOrdenadas();
        double pendiente =(sumaX/sumaY);
        return "la formula es : "+"y -"+pt1.getOrdenadas()+"="+pendiente+"(x -"+pt1.getAbscisas()+")";
    }

    public String BuscarCateto(double hip, double c1){
        double c2 = Math.sqrt(Math.pow(hip, 2)-Math.pow(c1,2));
        return "el cateto faltante es :"+c2;
    }
}

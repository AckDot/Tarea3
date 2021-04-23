
/**
 * Write a description of class Punto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Punto
{
    double ordenadas;
    double abscisas;
    Punto(double x , double y){
        abscisas = x ;
        ordenadas = y ;
    }

    public double getAbscisas(){
        return this.abscisas;
    }

    public double getOrdenadas(){
        return this.ordenadas;
    }

}

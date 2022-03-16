public class Circulo extends Figura implements Comparable{
    double diametro;

    public Circulo ( double pDiametro){
        diametro = pDiametro;
    }

    public double calcularArea(){
        return (3.14 *((this.diametro/2)*(this.diametro/2)));
    }

    public double numeroLados(){
        return 0;
    }

    public int compareTo (Comparable otro){
        if (this.calcularArea() == ((Circulo)otro).calcularArea())
            if (this.numeroLados() == ((Circulo)otro).numeroLados())
                 return 1;
        else if (this.calcularArea() > ((Circulo)otro).calcularArea())
            return 0;
        return -1;
    }
}

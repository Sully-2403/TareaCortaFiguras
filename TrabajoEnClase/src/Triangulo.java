
public class Triangulo extends Figura implements Comparable {
    double altura;
    double base;

    public Triangulo (double paltura, double pbase){
        altura = paltura;
        base = pbase;
    }

    public double calcularArea(){
        return (base*altura)/2;
    }

    public double numeroLados(){
        return 3;
    }

    public int compareTo (Comparable otro){
        if (this.calcularArea() == ((Triangulo)otro).calcularArea())
            if (this.numeroLados() == ((Triangulo)otro).numeroLados())
                 return 1;
        else if (this.calcularArea() > ((Triangulo)otro).calcularArea())
            return 0;
        return -1;
    }
}



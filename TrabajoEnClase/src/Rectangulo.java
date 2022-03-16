public class Rectangulo extends Figura implements Comparable {
    private double base;
    private double altura;

    public Rectangulo (double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    public double calcularArea (){
        return base * altura;
    }

    public double numeroLados (){
        return 4;
    }

    public int compareTo (Comparable otro){
        if (this.calcularArea() == ((Rectangulo)otro).calcularArea())
            if (this.numeroLados() == ((Rectangulo)otro).numeroLados())
                 return 1;
        else if (this.calcularArea() > ((Rectangulo)otro).calcularArea())
            return 0;
        return -1;
    }

}


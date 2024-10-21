public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getbase() {
        return base;
    }

    public void setbase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public void calculararea() {
        System.out.println("El area del Rectanguloes:"+this.base*this.altura);
    }

    @Override
    public void calcularperimetro() {
        System.out.println("El perimetro del Rectangulo es:"+2*this.base*this.altura);
    }
}

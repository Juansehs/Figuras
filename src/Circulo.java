public class Circulo extends Figura{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularperimetro() {

        System.out.println("El perimetro del circulo es:"+3.14*radio);
    }

    @Override
    public void calculararea() {
        System.out.println("El area del circulo es:"+3.14*(radio*radio));
    }
}

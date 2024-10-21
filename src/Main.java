import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo();
        Rectangulo rectangulo3 = new Rectangulo();
        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo();
        Triangulo triangulo3 = new Triangulo();
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo();
        Circulo circulo3 = new Circulo();
        Scanner input = new Scanner(System.in);
        List<Triangulo> triangulos = new ArrayList<>();
        triangulos.add(triangulo1);
        triangulos.add(triangulo2);
        triangulos.add(triangulo3);
        List<Rectangulo> rectangulos = new ArrayList<>();
        rectangulos.add(rectangulo1);
        rectangulos.add(rectangulo2);
        rectangulos.add(rectangulo3);
        List<Circulo> circulos = new ArrayList<>();
        circulos.add(circulo1);
        circulos.add(circulo2);
        circulos.add(circulo3);


        while (true) {
            System.out.println(" ¿Bienvenido que deseas calcular?: \n(1)Perimetro \n(2)Area  ");
            switch (input.nextInt()) {

                case 1:
                    System.out.println("Elige la figura : \n(1) Rectangulo \n(2) Triangulo \n(3) Circulo");
                    Scanner opcion = new Scanner(System.in);
                    opcion.nextInt();
                    if (opcion==){



                    }


                    break;
                case 2:

                    break;
                default:
                    System.out.println("Opcion no permitida");
            }
        }

    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Juan Sebastian Hernandez Silva

public class Main {
    public static void main(String[] args) {


        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo();
        Triangulo triangulo3 = new Triangulo();


        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo();
        Circulo circulo3 = new Circulo();


        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo();
        Rectangulo rectangulo3 = new Rectangulo();

        List<Rectangulo> rectangulos = new ArrayList<>();
        rectangulos.add(rectangulo1);
        rectangulos.add(rectangulo2);
        rectangulos.add(rectangulo3);

        List<Circulo> circulos = new ArrayList<>();
        circulos.add(circulo1);
        circulos.add(circulo2);
        circulos.add(circulo3);

        List<Triangulo> triangulos = new ArrayList<>();
        triangulos.add(triangulo1);
        triangulos.add(triangulo2);
        triangulos.add(triangulo3);

        //Triangulos - Circulos - Rectangulos//
        int[] contadores = {0, 0, 0};
        int opcion;
        Scanner input = new Scanner(System.in);
        cicloi:
        while (true) {
            System.out.println("Bienvenido  \nEscoja lo que desee calcular:\n(1)Perimetro\n(2)Area\n(3)salir");
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Escoja la figura :\n(0)Triangulo\n(1)Circulo\n(2)Rectangulo");
                    opcion = input.nextInt();
                    if (opcion == 0) {
                        if (contadores[opcion] == 3) break;
                        System.out.println("ingrese la altura: ");
                        triangulos.get(contadores[opcion]).setAltura(input.nextDouble());
                        System.out.println("ingrese la base: ");
                        triangulos.get(contadores[opcion]).setBase(input.nextDouble());
                        System.out.println("ingrese el lado 1: ");
                        triangulos.get(contadores[opcion]).setLado1(input.nextDouble());
                        System.out.println("ingrese el lado 2: ");
                        triangulos.get(contadores[opcion]).setLado2(input.nextDouble());
                        System.out.println("ingrese el lado 3: ");
                        triangulos.get(contadores[opcion]).setLado3(input.nextDouble());
                        triangulos.get(contadores[opcion]).calcularperimetro();
                        contadores[opcion]++;

                    } else if (opcion == 1) {
                        if (contadores[opcion] == 3) break;
                        System.out.println("ingrese el radio del circulo: ");
                        circulos.get(contadores[opcion]).setRadio(input.nextDouble());
                        circulos.get(contadores[opcion]).calcularperimetro();
                        contadores[opcion]++;

                    } else if (opcion == 2) {
                        if (contadores[opcion] == 3) break;
                        System.out.println("ingrese la altura: ");
                        rectangulos.get(contadores[opcion]).setAltura(input.nextInt());
                        System.out.println("ingrese la base: ");
                        rectangulos.get(contadores[opcion]).setbase(input.nextInt());
                        rectangulos.get(contadores[opcion]).calcularperimetro();
                        contadores[opcion]++;
                    }

                    break;
                case 2:
                    System.out.println("Escoja la figura que desee:\n(0)Triangulo\n(1)Circulo\n(2)Rectanguo");
                    opcion = input.nextInt();
                    if (opcion == 0) {

                        //Triangulo//
                        if (contadores[opcion] == 3) break;
                        System.out.println("Ingrese la Altura: ");
                        triangulos.get(contadores[opcion]).setAltura(input.nextDouble());
                        System.out.println("Ingrese la Base: ");
                        triangulos.get(contadores[opcion]).setBase(input.nextDouble());
                        System.out.println("Ingrese el lado 1: ");
                        triangulos.get(contadores[opcion]).setLado1(input.nextDouble());
                        System.out.println("Ingrese el lado 2: ");
                        triangulos.get(contadores[opcion]).setLado2(input.nextDouble());
                        System.out.println("Ingrese el lado 3: ");
                        triangulos.get(contadores[opcion]).setLado3(input.nextDouble());
                        triangulos.get(contadores[opcion]).calculararea();
                        contadores[opcion]++;
                        //Circulo//
                    } else if (opcion == 1) {
                        if (contadores[opcion] == 3) break;
                        System.out.println("ingrese el radio del circulo: ");
                        circulos.get(contadores[opcion]).setRadio(input.nextDouble());
                        circulos.get(contadores[opcion]).calculararea();
                        contadores[opcion]++;
                        //Rectangulo
                    } else if (opcion == 2) {
                        if (contadores[opcion] == 3) break;
                        System.out.println("ingrese la altura: ");
                        rectangulos.get(contadores[opcion]).setAltura(input.nextInt());
                        System.out.println("ingrese la base: ");
                        rectangulos.get(contadores[opcion]).setbase(input.nextInt());
                        rectangulos.get(contadores[opcion]).calculararea();
                        contadores[opcion]++;
                    }
                    break;
                case 3:
                    System.out.println("Saliendo.....");
                    break cicloi;

                default:
                    System.out.println("Opcion no Valida....");
            }
        }

    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero = 10;

        //es lo mismo

        //combinacion de operadores
        numero += 5; //numero = numero + 5;
        numero -= 5;
        numero *= 5;
        numero /= 5;
        numero %= 5;

        System.out.println(numero);

        int x = 5;
        int y;
        x++;//x += 1;
        x--;

        //primero hace la asignacion de x a y, por eso y valdria 5
        //y = x++;
        //por eso ++ se pone como prefijo antes de la x
        y = ++x;
        y = --x; // y = x--;

        System.out.println(y);

        //Clase Math
                           //metodo de la clase math
        double raiz = Math.sqrt(9);
        //RAIZ
        int raiz1 =(int)Math.sqrt(10);
                        //siempre va a ser un metodo de la clase
        double raiz2 = Math.sqrt(9.76);
        System.out.println(raiz2);

        //potencias
        double base = 5, exponente = 2, resultado;
        resultado = Math.pow(base,exponente);
        System.out.println(resultado);

        //REDONDEAR
        double redondear = 4.56;
        double result = Math.round(redondear);
        System.out.println(result);

        double ramdom = Math.random();
        System.out.println(ramdom);

        //EJERCICIO Intercambio de valores
        int a = 35;
        int b = 20;
        int c; //variable auxiliar

        c = a;//c = 35
        a = b;//a = 20
        b = c;//b = 35

        System.out.println("el valor de a debe ser 20: " + a);
        System.out.println("el valor de b debe ser 35: " + b);

        //Ejercicio de suma de 3 calificaciones
        double calificacion1, calificacion2, calificacion3, sumaCalificacion;

        System.out.println("ingresa las 3 calificaciones: ");

        //Se declara el scanner y  se instancia a la clase scanner
        Scanner escanearCalificacion = new Scanner(System.in);

        //Guardamos las 3 calificaciones
        calificacion1 = escanearCalificacion.nextDouble();
        calificacion2 = escanearCalificacion.nextDouble();
        calificacion3 = escanearCalificacion.nextDouble();

        //sumamos las 3 calificaciones
        sumaCalificacion = calificacion1 + calificacion2 + calificacion3;
        System.out.println("La suma de las calificaciones es: " + sumaCalificacion); //imprimimos la suma

        int Guillermo, Luis, Juan, total;

        Scanner dineroGuillermo = new Scanner(System.in);
        System.out.println("El dinero que tiene Guillermo es: ");

        Guillermo = dineroGuillermo.nextInt();

        Luis = Guillermo/2;
        Juan = (Luis + Guillermo)/2;
        total = Guillermo + Luis + Juan;

        System.out.println("guillermo tiene: " + Guillermo);
        System.out.println("luis tiene: " + Luis);
        System.out.println("juan tiene: " + Juan);
        System.out.println("el dinero total es: " + total + " dolares");

        //Pago mensual
        double mensualidad = 1000;
        double comicion = 0.05;//5 % del carro, (precioCarro * .05)
        double sumaPrecios = 0, precioCarro =0;
        int numCarros;
        int comisionCarro = 150;

        Scanner datos = new Scanner(System.in);
        System.out.println("ingrese la cantidad de carros vendidos: ");
        numCarros = datos.nextInt();

        for(int i=0;i<numCarros;i++){
            System.out.println("precio del carro: " + (i+1));
            precioCarro = datos.nextDouble();
            sumaPrecios = precioCarro + sumaPrecios ;
        }

        comisionCarro = comisionCarro * numCarros;
        sumaPrecios = sumaPrecios * 0.05;
        mensualidad = mensualidad + comisionCarro + sumaPrecios;

        System.out.println("el total de la mensualidad del trabajador es = $" + mensualidad);

    }
}
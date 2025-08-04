package edu.aagustini;

public class App {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        System.out.println(c1.toString());

        System.out.println("Area do c1: "+ c1.area());


        
        Circulo c2 = new Circulo(3,4,2);
        System.out.println(c2.toString());

        c2.mover(5,2);
        System.out.println(c2.toString());

        c2.zoom(2);
        System.out.println(c2.toString());

        Circulo[] lista;
        lista = new Circulo[3];

        lista[0] = c1;
        lista[1] = c2;
        lista[2] = new Circulo(7,8,9);

        System.out.println("\nfor tradicional...");
        for(int i = 0; i < lista.length; i++ ){
            Circulo c = lista[i];
            System.out.println(c.toString());
        }

        System.out.println("\nfor cool, descolado, legal, que preciso aprender a usar...");
        for( Circulo c : lista ){
            System.out.println(c.toString());
        }



    }
}

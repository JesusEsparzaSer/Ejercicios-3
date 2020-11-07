package akinator;

import java.util.Scanner;

public class Akinator {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Akinator ak = new Akinator();
        boolean newGame = true;
        while (newGame) {
            ak.welcome();
            String start = sc.next();
            if (start.equals("no") || start.equals("n")) {
                newGame = false;
                continue;
            }

            Sql db = new Sql();
            String[][] datosAnimales = db.getMatriz();

            int sizeAnimales = datosAnimales.length;
            int sizeArbol = 0;

            Nodo nodo = new Nodo(datosAnimales[0][0], datosAnimales[0][1]);
            Nodo root = nodo;
            boolean victoria = false;
            while (sizeArbol < sizeAnimales && (!victoria)) {
                sizeArbol++;
                System.out.print("\n¿Tu animal " + nodo.getExtra() + "?\n> ");
                String respuesta = sc.next();

                if (respuesta.equals("si") || respuesta.equals("s")) {
                    System.out.print("\n¿Tu animal es " + nodo.getNombre() + "?\n> ");
                    respuesta = sc.next();
                    if (respuesta.equals("si") || respuesta.equals("s")) {
                        nodo.setNodoIzquierdo(nodo);
                        ak.Victoria();
                        victoria = true;
                    } else {
                        if (sizeArbol == sizeAnimales) {
                            String[] datos = ak.Derrota();
                            nodo.setNodoIzquierdo(new Nodo(datos[0], datos[1]));
                            nodo = nodo.getNodoIzquierdo();
                            db.insert(datos);
                            continue;
                        }

                        nodo.setNodoDerecho(new Nodo(datosAnimales[sizeArbol][0], datosAnimales[sizeArbol][1]));
                        nodo = nodo.getNodoDerecho();
                    }
                } else {
                    if (sizeArbol == sizeAnimales) {
                        String[] datos = ak.Derrota();
                        db.insert(datos);
                        continue;
                    }

                    nodo.setNodoDerecho(new Nodo(datosAnimales[sizeArbol][0], datosAnimales[sizeArbol][1]));
                    nodo = nodo.getNodoDerecho();
                }
            }
            //ak.printRecorrido(root, sizeArbol, victoria);
            String desicion = ak.StartAgain();
            if (desicion.equals("no") || desicion.equals("n")) {
                newGame = false;
            }
        }
        System.out.println("\nGracias por jugar\n");
    }

    public void welcome() {
        System.out.println("-----------------------------");
        System.out.println("|Instrucciones              |");
        System.out.println("|Verdadero = \'si\' o \'s\'     |");
        System.out.println("|Falso = \'no\' o \'n\'         |");
        System.out.println("-----------------------------\n");
        System.out.print("Piensa en un animal\ny yo tratare de adivinar cual es, ¿Estas listo?\n> ");
    }

    public void Victoria() {
        System.out.println("\n-------------");
        System.out.println("|VICTORIA!!!|");
        System.out.println("-------------");
    }

    public String[] Derrota() {
        System.out.println("\nMe rindo");
        System.out.print("\n¿Dime cual es el nombre de tu animal?\n> ");
        sc.nextLine();
        String animal = sc.nextLine();
        System.out.print("\n¿Dime cual es su cualidad?\n> ");
        String extra = sc.nextLine();
        return new String[]{animal, extra};
    }

    public String StartAgain() {
        System.out.print("\n¿Quieres jugar otra vez?\n> ");
        return sc.next();
    }

    public void printRecorrido(Nodo nodo, int size, boolean estado) {
        for (int i = 0; i < size; i++) {
            System.out.println(nodo.getNombre());
            if (nodo.getNodoIzquierdo() != null) {
                nodo = nodo.getNodoIzquierdo();
                System.out.println("  /");
            } else {
                nodo = nodo.getNodoDerecho();
                System.out.println("  \\");
            }
        }
        if (estado) {
            System.out.println("victoria");
        } else {
            System.out.println("derrota");
        }
    }
}

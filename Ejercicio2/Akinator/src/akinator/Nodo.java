package akinator;

public class Nodo {

    private String nombre;
    private String extra;
    private Nodo nodoIzquierdo;
    private Nodo nodoDerecho;

    public Nodo(String nombre, String extra) {
        this.nombre = nombre;
        this.extra = extra;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    
    public String getExtra() {
        return this.extra;
    }

    public void setNodoIzquierdo(Nodo nodo) {
        this.nodoIzquierdo = nodo;
    }

    public void setNodoDerecho(Nodo nodo) {
        this.nodoDerecho = nodo;
    }

    public Nodo getNodoIzquierdo() {
        return this.nodoIzquierdo;
    }

    public Nodo getNodoDerecho() {
        return this.nodoDerecho;
    }
}

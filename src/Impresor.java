public abstract class Impresor {

    protected String modelo;
    protected int resolucion; // en DPI

    public Impresor(String modelo, int resolucion) {
        this.modelo = modelo;
        this.resolucion = resolucion;
    }

    public String getModelo() {
        return modelo;
    }

    public int getResolucion() {
        return resolucion;
    }

    // Cada tecnología define cómo imprime y cuándo falla
    public abstract boolean imprimirDocumento(String documento);

    // Cada una informa su propio estado de consumibles
    public abstract void mostrarEstado();
}
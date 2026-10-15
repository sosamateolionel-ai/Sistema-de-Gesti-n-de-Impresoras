public class ImpresoraLaser extends Impresor {

    private int nivelToner; // 0 a 100 (%)
    private boolean color;

    public ImpresoraLaser(String modelo, int resolucion, int nivelToner, boolean color) {
        super(modelo, resolucion);
        this.nivelToner = nivelToner;
        this.color = color;
    }

    @Override
    public boolean imprimirDocumento(String documento) {

        if (nivelToner <= 0) {
            System.out.println("[Láser " + modelo + "] Error: tóner agotado, no se puede imprimir.");
            return false;
        }

        nivelToner = nivelToner - 10; // cada trabajo consume 10%

        if (nivelToner < 0) {
            nivelToner = 0;
        }

        String modo = color ? "a color" : "en blanco y negro";
        System.out.println("[Láser " + modelo + "] Imprimiendo \"" + documento + "\" " + modo
                + " a " + resolucion + " DPI.");
        return true;
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Láser " + modelo + " | " + resolucion + " DPI | Tóner: " + nivelToner + "%");
    }
}
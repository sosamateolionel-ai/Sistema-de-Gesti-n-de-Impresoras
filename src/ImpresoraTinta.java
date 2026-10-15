public class ImpresoraTinta extends Impresor {

    private int nivelTintaNegra; // 0 a 100 (%)
    private int nivelTintaColor; // 0 a 100 (%)

    public ImpresoraTinta(String modelo, int resolucion, int nivelTintaNegra, int nivelTintaColor) {
        super(modelo, resolucion);
        this.nivelTintaNegra = nivelTintaNegra;
        this.nivelTintaColor = nivelTintaColor;
    }

    @Override
    public boolean imprimirDocumento(String documento) {

        if (nivelTintaNegra <= 0) {
            System.out.println("[Tinta " + modelo + "] Error: cartucho negro agotado, no se puede imprimir.");
            return false;
        }

        if (nivelTintaColor <= 0) {
            System.out.println("[Tinta " + modelo + "] Error: cartucho de color agotado, no se puede imprimir.");
            return false;
        }

        nivelTintaNegra = Math.max(0, nivelTintaNegra - 15);
        nivelTintaColor = Math.max(0, nivelTintaColor - 5);

        System.out.println("[Tinta " + modelo + "] Imprimiendo \"" + documento + "\" a "
                + resolucion + " DPI con inyección de tinta.");
        return true;
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Tinta " + modelo + " | " + resolucion + " DPI | Negro: "
                + nivelTintaNegra + "% | Color: " + nivelTintaColor + "%");
    }
}
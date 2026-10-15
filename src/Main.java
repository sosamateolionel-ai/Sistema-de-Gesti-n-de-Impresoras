//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    List<Impresor> impresoras = new ArrayList<>();

    impresoras.add(new ImpresoraLaser("HP LaserJet", 1200, 20, false));
    impresoras.add(new ImpresoraTinta("Epson EcoTank", 4800, 30, 10));

    System.out.println("=== Estado inicial ===");
    for (Impresor i : impresoras) {
        i.mostrarEstado();
    }

    System.out.println("\n=== Ronda de impresión 1 ===");
    for (Impresor i : impresoras) {
        i.imprimirDocumento("Informe.pdf");
    }

    System.out.println("\n=== Ronda de impresión 2 ===");
    for (Impresor i : impresoras) {
        i.imprimirDocumento("Contrato.pdf");
    }

    System.out.println("\n=== Ronda de impresión 3 (consumibles al límite) ===");
    for (Impresor i : impresoras) {
        i.imprimirDocumento("Factura.pdf");
    }

    System.out.println("\n=== Estado final ===");
    for (Impresor i : impresoras) {
        i.mostrarEstado();
    }

}

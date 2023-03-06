public class Main {
    // en Argentina el IVA es del 21%
    public static void main(String[] args) {
        double precio = 100;
        System.out.println("Precio = " + precio);
        System.out.println("Precio + IVA 21% = " + precioMasIva(precio));
    }
    static double precioMasIva (double precio) {
        double iva = precio * 0.21;
        return precio + iva;
    }
}
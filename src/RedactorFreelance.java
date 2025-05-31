public class RedactorFreelance extends Freelancer implements Facturable {
    private double tarifaPorHora;

    public RedactorFreelance(String nombre, String id, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, id, horasTrabajadas);
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String generarFactura() {
        return "Factura Redactor: " + nombre + " - Total: $" + calcularPago();
    }
}
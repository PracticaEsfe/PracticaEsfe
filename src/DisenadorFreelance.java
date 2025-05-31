public class DisenadorFreelance extends Freelancer implements Facturable {
    private double tarifaPorHora;

    public DisenadorFreelance(String nombre, String id, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, id, horasTrabajadas);
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String generarFactura() {
        return "Factura Diseñador: " + nombre + " - Total: $" + calcularPago();
    }
}
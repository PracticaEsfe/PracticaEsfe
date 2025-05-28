public abstract class Freelancer {
    protected String nombre;
    protected String id;
    protected int horasTrabajadas;

    public Freelancer(String nombre, String id, int horasTrabajadas) {
        this.nombre = nombre;
        this.id = id;
        this.horasTrabajadas = horasTrabajadas;
    }

    public abstract double calcularPago();

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Pago: $" + calcularPago());
    }
}
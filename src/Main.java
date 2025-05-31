import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Freelancer> freelancers = new ArrayList<>();

        // Crear ejemplos de freelancers
        freelancers.add(new ProgramadorFreelance("Juan", "P001", 40, 15));
        freelancers.add(new DisenadorFreelance("Ana", "D001", 30, 20));
        freelancers.add(new RedactorFreelance("Carlos", "R001", 25, 10));

        double totalPago = 0;

        // Mostrar información y calcular total
        for (Freelancer f : freelancers) {
            f.mostrarInformacion();
            if (f instanceof Facturable) {
                totalPago += f.calcularPago();
            }
            System.out.println();
        }

        System.out.println("Pago total a todos los freelancers: $" + totalPago);

        // Mostrar facturas
        System.out.println("\nFacturas:");
        for (Freelancer f : freelancers) {
            if (f instanceof Facturable) {
                System.out.println(((Facturable) f).generarFactura());
            }
        }
    }
}
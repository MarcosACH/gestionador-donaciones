import java.time.LocalDate;

public class AppDonaciones {
    public static void main(String[] args) throws Exception {
        ONG org = new ONG("Codigo Verde");

        // Registro de Donantes
        Donante dt1 = org.registrarDonante("Wiley", "Wesley");
        Donante dt2 = org.registrarDonante("Chandler", "Stephens");
        Donante dt3 = org.registrarDonante("Keeley", "Sherman");
        Donante dt4 = org.registrarDonante("Keiran", "Raines");
        Donante dt5 = org.registrarDonante("Brendon", "Boothman");

        // Carga de Donaciones
        Donacion dc1 = org.cargarDonacion(dt1, LocalDate.of(2023, 10, 26), 50);
        Donacion dc2 = org.cargarDonacion(dt2, LocalDate.of(2023, 10, 22), 100);
        Donacion dc3 = org.cargarDonacion(dt3, LocalDate.of(2023, 10, 22), 60);
        Donacion dc4 = org.cargarDonacion(dt4, LocalDate.of(2023, 10, 31), 40);
        Donacion dc5 = org.cargarDonacion(dt5, LocalDate.of(2023, 10, 15), 30);
        Donacion dc6 = org.cargarDonacion(dt1, LocalDate.of(2023, 11, 7), 100);
        Donacion dc7 = org.cargarDonacion(dt2, LocalDate.of(2023, 11, 2), 100);
        Donacion dc8 = org.cargarDonacion(dt3, LocalDate.of(2023, 11, 9), 60);
        Donacion dc9 = org.cargarDonacion(dt4, LocalDate.of(2023, 11, 10), 50);
        Donacion dc10 = org.cargarDonacion(dt5, LocalDate.of(2023, 11, 11), 90);

        // Actualizacion de Donaciones
        dc1.setCobrada();
        dc2.setCobrada();
        dc3.setCobrada();
        dc4.setRechazada();
        dc5.setCobrada();
        dc6.setCobrada();
        dc7.setRechazada();
        dc8.setCobrada();
        dc9.setCobrada();
        dc10.setRechazada();

        // Mostrar Donantes
        org.mostrarDonantes();

        // Mostrar Donaciones ordenadas por fecha
        org.mostrarDonaciones();

        // Mostrar Resultado desde la fecha 10/11/2023
        org.mostrarResultadoFecha(LocalDate.of(2023, 11, 10));
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionhotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class sistemaGestionHotel {
    private Hotel hotel;

    public sistemaGestionHotel() {
        // Aquí debes crear las listas de habitaciones y reservas
        List<Habitacion> habitaciones = new ArrayList<>();
        List<Reserva> reservas = new ArrayList<>();
        
        // Luego, pasas estas listas al constructor de Hotel
        this.hotel = new Hotel(habitaciones, reservas);
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        while (true) {
            System.out.println("**********************************");
            System.out.println("1. Iniciar sesion como usuario");
            System.out.println("2. Iniciar sesion como administrador");
            System.out.println("3. Registrarse como usuario");
            System.out.println("4. Salir");
            System.out.println("**********************************");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (choice) {
                case 1:
                    User user = userLogin(scanner);
                    if (user != null) {
                        loggedIn = true;
                        UserMenu.userMenu(scanner, user);
                    }
                    break;
                case 2:
                    Admin admin = adminLogin(scanner);
                    if (admin != null) {
                        loggedIn = true;
                        adminMenu(scanner, admin);
                    }
                    break;
                case 3:
                    registerUser(scanner);
                    break;
                case 4:
                    System.out.println("**********************************");
                    System.out.println("Saliendo del sistema...");
                    System.out.println("**********************************");
                    return;
                default:
                    System.out.println("**********************************");
                    System.out.println("Opción inválida, por favor ingresa nuevamente.");
                    System.out.println("**********************************");
            }
        }
    }

    // Método para que un usuario inicie sesión
    public User userLogin(Scanner scanner) {
        System.out.println("**********************************");
        System.out.println("Ingrese su nombre de usuario:");
        System.out.println("**********************************");
        String username = scanner.nextLine();
        System.out.println("**********************************");
        System.out.println("Ingrese su contraseña:");
        System.out.println("**********************************");
        String password = scanner.nextLine();

        // Aquí iría la lógica para verificar las credenciales del usuario
        // Por simplicidad, aquí simplemente se crea un nuevo usuario
        return new User(username, password);
    }

    // Método para que un administrador inicie sesión
    public Admin adminLogin(Scanner scanner) {
        System.out.println("**********************************");
        System.out.println("Ingrese su nombre de usuario como administrador:");
        System.out.println("**********************************");
        String username = scanner.nextLine();
        System.out.println("**********************************");
        System.out.println("Ingrese su contraseña como administrador:");
        System.out.println("**********************************");
        String password = scanner.nextLine();

        // Aquí iría la lógica para verificar las credenciales del administrador
        // Por simplicidad, aquí simplemente se crea un nuevo administrador
        return new Admin(username, password);
    }

    // Método para registrar un nuevo usuario
    public void registerUser(Scanner scanner) {
        System.out.println("**********************************");
        System.out.println("Registrarse como nuevo usuario:");
        System.out.println("**********************************");
        System.out.println("Ingrese un nombre de usuario:");
        String username = scanner.nextLine();
        System.out.println("**********************************");
        System.out.println("Ingrese una contraseña:");
        String password = scanner.nextLine();

        // Aquí iría la lógica para registrar el nuevo usuario en el sistema
        // Por simplicidad, aquí simplemente se muestra un mensaje de éxito
        System.out.println("**********************************");
        System.out.println("Registro exitoso! Ahora puedes iniciar sesion como " + username);
        System.out.println("**********************************");
    }

    // Método para mostrar el menú de opciones para un usuario
    public class UserMenu {
    
    public static void userMenu(Scanner scanner, User user) {
        System.out.println("**********************************");
        System.out.println("Bienvenido, " + user.getUsername() + "!");
        System.out.println("**********************************");
        while (true) {
            System.out.println("**********************************");
            System.out.println("Menu de opciones:");
            System.out.println("1. Buscar habitaciones disponibles por fechas");
            System.out.println("2. Reservar una habitacion");
            System.out.println("3. Cancelar sus propias reservas");
            System.out.println("4. Ver detalles de sus reservas pasadas y activas");
            System.out.println("5. Salir");
            System.out.println("**********************************");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (choice) {
                case 1:
                    buscarHabitacionesDisponibles(scanner);
                    break;
                case 2:
                    reservarHabitacion(scanner, user);
                    break;
                case 3:
                    cancelarReservas(scanner, user);
                    break;
                case 4:
                    verDetallesReservas(user);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("**********************************");
                    System.out.println("Opción invalida, por favor ingresa nuevamente.");
                    System.out.println("**********************************");
            }
        }
    }
}
    // Método para buscar habitaciones disponibles por fechas
    private static void buscarHabitacionesDisponibles(Scanner scanner) {
        System.out.println("**********************************");
        System.out.println("Ingrese las fechas para buscar habitaciones disponibles:");
        System.out.println("**********************************");
        String fechas = scanner.nextLine();
        // Aquí iría la lógica para buscar habitaciones disponibles por fechas
        // Por ejemplo, mostrar habitaciones disponibles
        System.out.println("**********************************");
        System.out.println("Habitaciones disponibles para las fechas " + fechas + ":");
        System.out.println("1. Habitacion individual - Precio: $100/noche");
        System.out.println("2. Habitacion doble - Precio: $150/noche");
        System.out.println("**********************************");
    }

    // Método para reservar una habitación
    private static void reservarHabitacion(Scanner scanner, User user) {
        System.out.println("**********************************");
        System.out.println("Ingrese el numero de habitacion que desea reservar:");
        System.out.println("**********************************");
        int roomNumber = scanner.nextInt();
        // Aquí iría la lógica para reservar una habitación
        // Por ejemplo, registrar la reserva en el sistema
        
        System.out.println("**********************************");
        System.out.println("¡Reserva de habitacion #" + roomNumber + " realizada con exito para " + user.getUsername() + "!");
        System.out.println("**********************************");
    }

    // Método para cancelar reservas
    private static void cancelarReservas(Scanner scanner, User user) {
        System.out.println("**********************************");
        System.out.println("Sus reservas activas son:");
        // Aquí iría la lógica para mostrar las reservas activas del usuario
        // Por ejemplo, obtener las reservas del usuario y mostrarlas en pantalla
        System.out.println("Ingrese el numero de reserva que desea cancelar:");
        System.out.println("**********************************");
        int reservationNumber = scanner.nextInt();
        // Aquí iría la lógica para cancelar la lía reserva seleccionada
        // Por ejemplo, eliminar la reserva del sistema
        System.out.println("**********************************");
        System.out.println("Reserva #" + reservationNumber + " cancelada con exito para " + user.getUsername() + "!");
        System.out.println("**********************************");
    }

    // Método para ver detalles de reservas pasadas y activas
    private static void verDetallesReservas(User user) {
        System.out.println("**********************************");
        System.out.println("Mostrando detalles de las reservas de " + user.getUsername() + ":");
        // Aquí iría la lógica para mostrar los detalles de las reservas pasadas y activas del usuario
        // Por ejemplo, obtener las reservas del usuario y mostrar los detalles de cada una
        System.out.println("Reserva #1 - Fecha: 2024-04-25, Habitación: 101, Precio: $100");
        System.out.println("Reserva #2 - Fecha: 2024-04-28, Habitación: 205, Precio: $150");
        System.out.println("**********************************");
    }


    // Método para mostrar el menú de opciones para un administrador
    public void adminMenu(Scanner scanner, Admin admin) {
        System.out.println("**********************************");
        System.out.println("Bienvenido, " + admin.getUsername() + "!");
        System.out.println("**********************************");
        while (true) {
            System.out.println("**********************************");
            System.out.println("Menu de opciones:");
            System.out.println("1. Añadir o eliminar habitaciones");
            System.out.println("2. Cambiar detalles de las habitaciones");
            System.out.println("3. Ver listas de todas las reservas");
            System.out.println("4. Salir");
            System.out.println("**********************************");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (choice) {
                case 1:
                    // Lógica para añadir o eliminar habitaciones
                    addOrRemoveRooms(scanner);
                    break;
                case 2:
                    // Lógica para cambiar detalles de las habitaciones
                    changeRoomDetails(scanner);
                    break;
                case 3:
                    // Lógica para ver listas de todas las reservas
                    viewAllReservations();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("**********************************");
                    System.out.println("Opcion inválida, por favor ingresa nuevamente.");
                    System.out.println("**********************************");
            }
        }
    }

    private void addOrRemoveRooms(Scanner scanner) {
    System.out.println("**********************************");
    System.out.println("Añadir o eliminar habitaciones...");
    System.out.println("**********************************");
    System.out.println("1. Añadir habitacion");
    System.out.println("2. Eliminar habitacion");
    System.out.println("**********************************");
    int choice = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer

    switch (choice) {
        case 1:
            System.out.println("**********************************");
            System.out.println("Ingrese los detalles de la nueva habitacion:");
            System.out.println("**********************************");
            System.out.println("Numero de habitacion:");
            int roomNumber = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.println("Tipo de habitacion:");
            String roomType = scanner.nextLine();
            System.out.println("Precio por noche:");
            double pricePerNight = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
            System.out.println("Número maximo de huespedes:");
            int maxGuests = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.println("Comodidades:");
            String amenities = scanner.nextLine();
            // Aquí iría la lógica para añadir la nueva habitación al sistema
            break;
        case 2:
            System.out.println("**********************************");
            System.out.println("Ingrese el numero de la habitacion que desea eliminar:");
            System.out.println("**********************************");
            int roomNumberToDelete = scanner.nextInt();
            // Aquí iría la lógica para eliminar la habitación del sistema
            break;
        default:
            System.out.println("**********************************");
            System.out.println("Opción invalida, por favor ingresa nuevamente.");
            System.out.println("**********************************");
    }
    
}
    // Lógica para cambiar detalles de las habitaciones
private void changeRoomDetails(Scanner scanner) {
    System.out.println("**********************************");
    System.out.println("Cambiar detalles de las habitaciones...");
    System.out.println("**********************************");
    System.out.println("Ingrese el número de habitacion que desea editar:");
    System.out.println("**********************************");
    int roomNumber = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer

    // Aquí iría la lógica para buscar la habitación y permitir al usuario editar sus detalles
    Habitacion habitacion = hotel.buscarHabitacionPorNumero(roomNumber);
    if (habitacion != null) {
        System.out.println("Detalles actuales de la habitacion:");
        System.out.println(habitacion);

        System.out.println("Ingrese los nuevos detalles de la habitacion:");
        System.out.println("Tipo de habitacion:");
        String roomType = scanner.nextLine();
        System.out.println("Precio por noche:");
        double pricePerNight = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer
        System.out.println("Numero maximo de huespedes:");
        int maxGuests = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.println("Comodidades:");
        String amenities = scanner.nextLine();

        // Actualizar los detalles de la habitación
        habitacion.setTipo(roomType);
        habitacion.setPrecioPorNoche(pricePerNight);
        habitacion.setMaxHuespedes(maxGuests);
        habitacion.setComodidades(amenities);

        System.out.println("Detalles de la habitación actualizados correctamente.");
    } else {
        System.out.println("No se encontro ninguna habitación con el número ingresado.");
    }
}

// Lógica para ver listas de todas las reservas
private void viewAllReservations() {
    System.out.println("**********************************");
    System.out.println("Ver listas de todas las reservas...");
    System.out.println("**********************************");
    // Aquí iría la lógica para obtener y mostrar todas las reservas almacenadas en el sistema
    List<Reserva> reservas = hotel.getTodasReservas();
    if (reservas.isEmpty()) {
        System.out.println("No hay reservas registradas en el sistema.");
    } else {
        System.out.println("Listado de todas las reservas:");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionhotel;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Hotel {
    private final List<Habitacion> habitaciones;
    private final List<Reserva> reservas;

    public Hotel(List<Habitacion> habitaciones, List<Reserva> reservas) {
        this.habitaciones = habitaciones;
        this.reservas = reservas;
    }

    public Habitacion buscarHabitacionPorNumero(int roomNumber) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == roomNumber) {
                return habitacion;
            }
        }
        return null; // Devuelve null si no se encuentra ninguna habitación con ese número
    }

    public List<Reserva> getTodasReservas() {
        return reservas; // Devuelve la lista de todas las reservas
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_agendmiento_citas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author Alexis Chapal
 */
public class cita {

    int idCita;
    LocalDate fecha;
    LocalTime hora;
    int idCliente;
    int idBarbero;

    public int getId() {
        return idCita;
    }

    public void setId(int id) {
        this.idCita = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdBarbero() {
        return idBarbero;
    }

    public void setIdBarbero(int idBarbero) {
        this.idBarbero = idBarbero;
    }

    public void crearCita(int idCliente, int idBarbero, LocalDate fecha, LocalTime hora, String servicio, int precioServicio) {

        conectar_bd conexion = new conectar_bd();

        String insertar = "INSERT INTO Cita (fecha, hora, idCliente, idBarbero, servicio, precioServicio) VALUES (?,?,?,?,?,?)";

        try {
            //enlazo la conexion a la bd con la informacion a insertar
            PreparedStatement cs = conexion.conectar().prepareCall(insertar);

            //convierto los datos de fecha y hora de java a datos de sql
            Date sqlFecha = Date.valueOf(fecha);
            Time sqlHora = Time.valueOf(hora);

            //ingreso los datos de la cita a la bd
            cs.setDate(1, sqlFecha);
            cs.setTime(2, sqlHora);
            cs.setInt(3, idCliente);
            cs.setInt(4, idBarbero);
            cs.setString(5, servicio);
            cs.setInt(6, precioServicio);

            cs.execute();
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");

        } catch (Exception e) {
            System.out.println(e);
            
        }
    }
    
    public double obtenerTotalGanancias(){
        double total = 0;
        
        Connection conexion= conectar_bd.conectar();
        if (conexion != null) {
            try {
                String query = "select SUM(precioServicio) AS GananciaTotal from Cita";
                PreparedStatement preparedStatement = conexion.prepareStatement(query);  
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                   total = resultSet.getDouble("GananciaTotal");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return total; 
    }
}

    


















































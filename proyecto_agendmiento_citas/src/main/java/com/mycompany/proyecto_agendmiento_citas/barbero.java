/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_agendmiento_citas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis Chapal
 */
public class barbero {

    int id;
    String nombre;
    String apellido;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void registrar_barbero(String nombre, String apellido) {

        conectar_bd conexion = new conectar_bd();
        String insertar = "INSERT INTO barbero (nombre, apellido) VALUES (?,?)";
        try {
            //enlazo la conexion a la bd con la informacion a insertar
            PreparedStatement cs = conexion.conectar().prepareCall(insertar);
            cs.setString(1, nombre);
            cs.setString(2, apellido);

            cs.execute();
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e);
        }
    }

    public boolean validar_registro_barbero(String nombre, String apellido) {
        boolean isValid = false;
        Connection conexion = conectar_bd.conectar();

        if (conexion != null) {
            try {
                String query = "SELECT * FROM barbero WHERE nombre = ? AND apellido = ?";
                PreparedStatement preparedStatement = conexion.prepareStatement(query);
                preparedStatement.setString(1, nombre);
                preparedStatement.setString(2, apellido);

                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    isValid = true;
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
        return isValid;
    }

}

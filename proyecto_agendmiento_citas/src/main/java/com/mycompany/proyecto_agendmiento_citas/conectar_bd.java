/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_agendmiento_citas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis Chapal
 */
public class conectar_bd {
    
    public static Connection conectar() {
        Connection connection = null;
        try {
            // se configura la URL, usuario y contraseña de la bd, datos necesarios para hacer la conexión
            String url = "jdbc:mysql://localhost:3306/agendamiento";
            String usuario = "root";
            String contraseña = "Alexischapal12+";
            
            // aqui establezco la conexión
            connection = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("CONEXION A LA BASE DE DATOS ESTABLECIDA CON EXITO");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    
}
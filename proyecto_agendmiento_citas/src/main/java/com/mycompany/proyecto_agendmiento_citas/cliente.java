/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_agendmiento_citas;


import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
/**
 *
 * @author Alexis Chapal
 */
public class cliente {
    int id;
    String nombre;
    String apellido;
    String nombre_usuario;
    String contraseña;

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

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
    
    public void registrar_usuario(String nombre, String apellido, String contraseña, String nombre_usuario){
        //voy a crear una conexion con la bd
        conectar_bd conexion= new conectar_bd();
        
        //se crea una insersion
        
        String insertar= "INSERT INTO cliente (nombre, apellido, contraseña, nombre_usuario ) VALUES (?,?,?,?)";
        try {
            //enlazo la conexion a la bd con la informacion a insertar
            PreparedStatement cs= conexion.conectar().prepareCall(insertar);
            cs.setString(1,nombre);
            cs.setString(2, apellido);
            cs.setString(3,contraseña);
            cs.setString(4,nombre_usuario);
            
            cs.execute();
            JOptionPane.showMessageDialog(null,"REGISTRO EXITOSO");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR: "+e);
        }
        
    }
    
    public boolean validar_registro(String usuario, String contraseña){    

   
        boolean isValid = false;
        Connection conexion = conectar_bd.conectar();
        
        if (conexion != null) {
            try {
                String query = "SELECT * FROM cliente WHERE nombre_usuario = ? AND contraseña = ?";
                PreparedStatement preparedStatement = conexion.prepareStatement(query);
                preparedStatement.setString(1, usuario);
                preparedStatement.setString(2, contraseña);

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
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_agendmiento_citas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
        String insertar = "INSERT INTO barbero (nombre,apellido) VALUES (?,?)";
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
    
    public String buscarPorId(int id){
        String nBarbero="";
        Connection conexion = conectar_bd.conectar();

        if (conexion != null) {
            try {
                String query = "SELECT * FROM barbero WHERE id = ?";
                PreparedStatement preparedStatement = conexion.prepareStatement(query);
                preparedStatement.setInt(1, id);
               
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                   nBarbero = resultSet.getString("nombre");
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
        return nBarbero;
         
    }
    public int obtenerId(String nombre){
        
        int id=0;
        
        Connection conexion= conectar_bd.conectar();
        if (conexion != null) {
            try {
                String query = "SELECT * FROM barbero WHERE nombre = ?";
                PreparedStatement preparedStatement = conexion.prepareStatement(query);
                preparedStatement.setString(1, nombre);
               
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                   id = resultSet.getInt("id");
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
        return id;
        
    }
    
    public void mostrarHistorialCitas(JTable TablaMostrarCitas){
        
        conectar_bd conexion = new conectar_bd ();
        DefaultTableModel modelo = new DefaultTableModel();
        
        String consultaSql = "";
        
        modelo.addColumn("id");
        modelo.addColumn("fecha");
        modelo.addColumn("hora");
        modelo.addColumn("idCliente");
        modelo.addColumn("idBarbero");
        modelo.addColumn("servicio");
        modelo.addColumn("precioServicio");
        
        TablaMostrarCitas.setModel(modelo);
        
        consultaSql = "select * from Cita;	";
        
        String[] datosCitas = new String[7];
        Statement st; 
        try{
            st = conexion.conectar().createStatement();
            ResultSet ts = st.executeQuery(consultaSql);
            
            while(ts.next()){
                
                datosCitas[0]= ts.getString(1);
                datosCitas[1]= ts.getString(2);
                datosCitas[2]= ts.getString(3);
                datosCitas[3]= ts.getString(4);
                datosCitas[4]= ts.getString(5);
                datosCitas[5]= ts.getString(6);
                datosCitas[6]= ts.getString(7);
                
                modelo.addRow(datosCitas); 
            }
        }
        catch(Exception e){  
            JOptionPane.showMessageDialog(null, "no se pudo mostrar los registros. error" + e.toString());
        }
    }
    }


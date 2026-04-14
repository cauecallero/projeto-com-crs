/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.callero.gerenciamento.repository;

/**
 *
 * @author Aluno
 */
public class conexao {
    public static final String url = "jdbc:mysql://localhost:3307/empresa_db";
    public static final String user = "root";
    public static final String senha = "1234";
    private static Conecction conn = null;
    
    private Conexao (){
    }
    
    public static synchonized Connection conectar () {
        try {
           if(conn == null || conn.isClosed()) {
               conn = DriverManafer.getConecction(url, user, senha);
           } 
    } catch (SQLException e) {
        e.printStrackTrace();
    }
        return conn;
    }
}

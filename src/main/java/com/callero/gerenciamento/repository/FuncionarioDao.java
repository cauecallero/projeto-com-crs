/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.callero.gerenciamento.repository;

import com.callero.gerenciamento.model.FuncionarioBean;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class FuncionarioDao {
    public List<FuncionarioBean> lerTodos() {
        List<FuncionarioBean> dados = new ArrayList();
        try {
            Conecction conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStratement("SELECT * FROM funcionario");
              rs = stmt.executeQuery();
              while (rs.next()) {
                  FuncionarioBean funcionario = new FuncionarioBean();
                  Funcionario.setId(rs.getString("id"));
                  Funcionario.setnome(rs.getString("nome"));
                  Funcionario.set(rs.getString
              }
              catch(SQLException e) {
                      e.printStrackTrace();
 }
        }
        
        return dados;
    }
    
}

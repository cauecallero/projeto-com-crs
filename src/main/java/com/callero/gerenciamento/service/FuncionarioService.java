/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.callero.gerenciamento.service;

import com.callero.gerenciamento.repository.FuncionarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aluno
 */
@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioDao repository;
    
    public List<FuncionarioBean> lerTodos() {
            return repository.lerTodos();
    }
   
}

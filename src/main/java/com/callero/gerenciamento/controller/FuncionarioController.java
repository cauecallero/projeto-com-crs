/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.callero.gerenciamento.controller;

import ch.qos.logback.core.model.Model;
import com.callero.gerenciamento.service.FuncionarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Aluno
 */
@Controller
public class FuncionarioController {
    
    @Autowired
    private FuncionarioService service;
    
    @GetMapping("/funcionarios")
    public String GetFuncionarios(Model model) {
        List<FuncionarioBean> lista = service.lerTodos();
        model.addAttribute("lista", lista);
        return "funcionarios";
        
    }  
}

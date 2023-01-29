package com.handson3.ms.funcionario.controller;

import com.handson3.ms.funcionario.domain.model.dto.FuncionarioDTO;
import com.handson3.ms.funcionario.domain.model.entity.FuncionarioEntity;
import com.handson3.ms.funcionario.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
@RequiredArgsConstructor
@Slf4j
@Validated
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<List<FuncionarioDTO>> getAllFuncionarios() {
        var response = funcionarioService.getAllFuncionarios();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<FuncionarioEntity> createOrUpdateFuncionario(@RequestBody FuncionarioDTO funcionario) {
        var response = funcionarioService.saveFuncionario(funcionario);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public void deleteFuncionario(@PathVariable String id) {
        funcionarioService.deleteFuncionario(id);
    }
}

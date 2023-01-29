package com.handson3.ms.funcionario.service;

import com.handson3.ms.funcionario.domain.model.dto.FuncionarioDTO;
import com.handson3.ms.funcionario.domain.model.entity.FuncionarioEntity;
import com.handson3.ms.funcionario.repository.FuncionarioRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRespository funcionarioRespository;

    public List<FuncionarioDTO> getAllFuncionarios() {
        var funcionarios = this.funcionarioRespository.findAll();

        return funcionarios.stream().map(f ->
                new FuncionarioDTO(f.getId(), f.getName(), null)
        ).collect(Collectors.toList());
    }

    public FuncionarioEntity saveFuncionario(FuncionarioDTO funcionario) {
        var id = Objects.isNull(funcionario.getId()) ? UUID.randomUUID() : funcionario.getId();
        var entity = new FuncionarioEntity(id, funcionario.getName());
        return this.funcionarioRespository.save(entity);
    }

    public void deleteFuncionario(String id) {
        this.funcionarioRespository.deleteById(UUID.fromString(id));
    }
}

package com.handson3.ms.funcionario.repository;

import com.handson3.ms.funcionario.domain.model.entity.FuncionarioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface FuncionarioRespository extends MongoRepository<FuncionarioEntity, UUID> {
}

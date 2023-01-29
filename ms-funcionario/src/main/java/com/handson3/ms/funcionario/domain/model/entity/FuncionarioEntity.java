package com.handson3.ms.funcionario.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("funcionario")
public class FuncionarioEntity {

    private UUID id;
    private String name;
}

package com.handson3.ms.funcionario.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("agendamentos")
public class AgendaEntity {
    private UUID id;
    private UUID idFuncionario;
    private LocalDateTime horarioInicio;
    private LocalDateTime horarioFim;
}

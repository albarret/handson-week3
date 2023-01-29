package com.handson3.ms.funcionario.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgendaDTO {
    private UUID id;
    private UUID idFuncionario;
    private LocalDateTime horarioInicio;
    private LocalDateTime horarioFim;
}

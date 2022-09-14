package br.com.alura.tdd.modelo;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Funcionario {

    private String nome;
    private LocalDate dataAdmissao;
    private BigDecimal salario;

}

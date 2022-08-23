package br.com.alura.tdd.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {

    private String nome;
    private LocalDate dataAdmissao;
    private Long salario;

}

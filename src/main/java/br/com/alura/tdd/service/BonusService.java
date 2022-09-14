package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {

    public BigDecimal calcularBonus(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();

        BigDecimal valor = salario.multiply(new BigDecimal("0.1"));
        if (salario.compareTo(new BigDecimal("10000")) > 0) {
            throw new IllegalArgumentException("Funcionario com salario maior que 10mil não pode receber bônus.");
        }
        return valor.setScale(2, RoundingMode.HALF_UP);
    }
}

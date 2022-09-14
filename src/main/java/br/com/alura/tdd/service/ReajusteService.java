package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.EnumDesempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteService {
    public BigDecimal concederReajuste(Funcionario funcionario, EnumDesempenho desempenho) {
        try {
            BigDecimal percentual = desempenho.percentualReajuste();
            return percentual.multiply(funcionario.getSalario()).setScale(2, RoundingMode.HALF_UP);
        } catch (Exception e) {
            throw new IllegalArgumentException("Problema ao conceder reajuste.");
        }
    }
}


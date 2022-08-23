package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.EnumDesempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, EnumDesempenho desempenho) {
        double reajuste = desempenho.percentualReajuste();
        funcionario.setSalario((long) (funcionario.getSalario() * reajuste));
    }
}


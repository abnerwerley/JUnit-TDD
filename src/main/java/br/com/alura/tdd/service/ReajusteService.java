package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        if (desempenho.equals(Desempenho.A_DESEJAR)) {
            funcionario.setSalario((long) (funcionario.getSalario() * 1.03));
        }
        if(desempenho.equals(Desempenho.BOM)){
            funcionario.setSalario((long) (funcionario.getSalario() * 1.15));
        }
        if(desempenho.equals(Desempenho.OTIMO)){
            funcionario.setSalario((long) (funcionario.getSalario() * 1.2));
        }
    }
}


package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

    public double calcularBonus(Funcionario funcionario) {
        double valor = funcionario.getSalario() * 0.1;
        if (valor > 1000) {
            valor = 0;
        }
        return valor;
    }

}

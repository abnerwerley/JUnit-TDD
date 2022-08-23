package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

    public double calcularBonus(Funcionario funcionario) {
        double salario = funcionario.getSalario();
        double bonus = (salario > 10000) ? 0 : 0.1;

        return salario * bonus;
    }

}

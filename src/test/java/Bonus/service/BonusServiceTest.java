package Bonus.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BonusServiceTest {

    @Test
    void bonusDeveriaSer0ParaFuncionarioComSalarioMuitoAlto() {
        BonusService service = new BonusService();
        double bonus = service.calcularBonus(new Funcionario("Gabriel", LocalDate.now(), (long) 25000.0));

        assertEquals(0.0, bonus);
    }

    @Test
    void bonusDeveriaSer10PorCentoDoSalario() {
        BonusService service = new BonusService();
        double bonus = service.calcularBonus(new Funcionario("Gabriel", LocalDate.now(), 2500L));

        assertEquals(250, bonus);
    }

    @Test
    void bonusDeveSer10PorCentoParaSalarioDe10Mil() {
        BonusService service = new BonusService();
        double bonus = service.calcularBonus(new Funcionario("Gabriel", LocalDate.now(), 10000L));

        assertEquals(1000, bonus);
    }


}

package Reajuste.service;

import br.com.alura.tdd.modelo.EnumDesempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReajusteServiceTest {

    @Test
    void reajusteDeveSer3PorcentoQuandoDesempenhoADesejar() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Aninha", LocalDate.now(), 1000L);

        service.concederReajuste(funcionario, EnumDesempenho.A_DESEJAR);

        assertEquals(1030, funcionario.getSalario());
    }

    @Test
    void reajusteDeveSer15PorcentoQuandoDesempenhoBom() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Joana", LocalDate.now(), 1000L);

        service.concederReajuste(funcionario, EnumDesempenho.BOM);

        assertEquals(1150, funcionario.getSalario());
    }

    @Test
    void reajusteDeveSer20PorcentoQuandoDesempenhoOtimo() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Joana", LocalDate.now(), 1000L);

        service.concederReajuste(funcionario, EnumDesempenho.OTIMO);

        assertEquals(1200, funcionario.getSalario());
    }

    @Test
    void reajusteDeveDar2300ParaSalario200DesempenhoBom() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Arthur", LocalDate.now(), 2000L);

        service.concederReajuste(funcionario, EnumDesempenho.BOM);

        assertEquals(2300, funcionario.getSalario());
    }

}

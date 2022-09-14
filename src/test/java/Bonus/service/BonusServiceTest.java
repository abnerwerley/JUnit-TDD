package Bonus.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class BonusServiceTest {

    private static final String NOME = "Joãozinho";
    private static final BigDecimal SALARIO = new BigDecimal("1000");

    private static final BigDecimal SALARIO_10K = new BigDecimal("10000");
    private static final BigDecimal SALARIO_ALTO = new BigDecimal("25000");

    private static final LocalDate DATA = LocalDate.now();
    private BonusService service;

    @BeforeEach
    public void inicializar() {
        this.service = new BonusService();
    }


    @Test
    void calcularBonusException() {
        assertThrows(IllegalArgumentException.class, () ->
                service.calcularBonus(getFuncionarioSalarioAlto())
        );
    }

    @Test
    void bonusDeveriaSer10PorCentoDoSalario() {
        BigDecimal bonus = service.calcularBonus(getFuncionario());
        assertEquals(new BigDecimal("100.00"), bonus);
    }

    @Test
    void bonusDeveSer10PorCentoParaSalarioDe10Mil() {
        BigDecimal bonus = service.calcularBonus(getFuncionarioSalario10mil());
        assertEquals(new BigDecimal("1000.00"), bonus);
    }

    private Funcionario getFuncionario() {
        return Funcionario.builder()
                .nome(NOME)
                .dataAdmissao(DATA)
                .salario(SALARIO)
                .build();
    }

    private Funcionario getFuncionarioSalarioAlto() {
        return Funcionario.builder()
                .nome(NOME)
                .dataAdmissao(DATA)
                .salario(SALARIO_ALTO)
                .build();
    }

    private Funcionario getFuncionarioSalario10mil() {
        return Funcionario.builder()
                .nome(NOME)
                .dataAdmissao(DATA)
                .salario(SALARIO_10K)
                .build();
    }

}

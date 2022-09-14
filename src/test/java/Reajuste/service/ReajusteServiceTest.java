package Reajuste.service;

import br.com.alura.tdd.modelo.EnumDesempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReajusteServiceTest {

    private static final String NOME = "Aninha";
    private static final BigDecimal SALARIO = new BigDecimal("1000");
    private static final LocalDate DATA = LocalDate.now();
    private static final BigDecimal SALARIO2K = new BigDecimal("2000");


    private ReajusteService service;

    @BeforeEach
    public void inicializar() {
        this.service = new ReajusteService();
    }

    @Test
    void reajusteDeveSer3PorcentoQuandoDesempenhoADesejar() {
        BigDecimal reajuste = service.concederReajuste(getFuncionario(), EnumDesempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), reajuste);
    }

    @Test
    void reajusteDeveSer15PorcentoQuandoDesempenhoBom() {
        BigDecimal reajuste = service.concederReajuste(getFuncionario(), EnumDesempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), reajuste);
    }

    @Test
    void reajusteDeveSer20PorcentoQuandoDesempenhoOtimo() {
        BigDecimal reajuste = service.concederReajuste(getFuncionario(), EnumDesempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), reajuste);
    }

    @Test
    void reajusteDeveDar2300ParaSalario200DesempenhoBom() {
        getFuncionario().setSalario(new BigDecimal("2000"));
        BigDecimal reajuste = service.concederReajuste(getFuncionarioSalario2k(), EnumDesempenho.BOM);
        assertEquals(new BigDecimal("2300.00"), reajuste);
    }

    @Test
    void concederReajusteSemSalarioException(){
        assertThrows(IllegalArgumentException.class, () ->
                service.concederReajuste(getFuncionarioSemSalario(),  EnumDesempenho.A_DESEJAR));
    }

    private Funcionario getFuncionario() {
        return Funcionario.builder()
                .nome(NOME)
                .dataAdmissao(DATA)
                .salario(SALARIO)
                .build();
    }

    private Funcionario getFuncionarioSalario2k() {
        return Funcionario.builder()
                .nome(NOME)
                .dataAdmissao(DATA)
                .salario(SALARIO2K)
                .build();
    }

    private Funcionario getFuncionarioSemSalario() {
        return Funcionario.builder()
                .nome(NOME)
                .dataAdmissao(DATA)
                .build();
    }


}

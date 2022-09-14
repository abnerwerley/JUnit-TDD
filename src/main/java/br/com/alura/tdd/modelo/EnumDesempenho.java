package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum EnumDesempenho {
    A_DESEJAR {
        public BigDecimal percentualReajuste() {
            return new BigDecimal("1.03");
        }
    },
    BOM {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("1.15");
        }
    },
    OTIMO {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("1.2");
        }
    };

    public abstract BigDecimal percentualReajuste();

}

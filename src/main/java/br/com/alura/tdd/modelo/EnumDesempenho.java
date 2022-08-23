package br.com.alura.tdd.modelo;

public enum EnumDesempenho {
    A_DESEJAR {
        public double percentualReajuste() {
            return 1.03;
        }
    },
    BOM {
        @Override
        public double percentualReajuste() {
            return 1.15;
        }
    },
    OTIMO {
        @Override
        public double percentualReajuste() {
            return 1.2;
        }
    };

    public abstract double percentualReajuste();

}

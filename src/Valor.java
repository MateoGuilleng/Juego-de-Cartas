public enum Valor {
    DOS("2", 2),
    TRES("3", 3),
    CUATRO("4", 4),
    CINCO("5", 5),
    SEIS("6", 6),
    SIETE("7", 7),
    OCHO("8", 8),
    NUEVE("9", 9),
    DIEZ("10", 10),
    J("J", 11),
    Q("Q", 12),
    K("K", 13),
    A("A", 14);

    private final String simbolo;
    private final int valor;

    Valor(String simbolo, int valor) {
        this.simbolo = simbolo;
        this.valor = valor;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public int getValor() {
        return valor;
    }
} 
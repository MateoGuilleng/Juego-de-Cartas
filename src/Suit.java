public enum Suit {
    TREBOL("T"),
    DIAMANTES("D"),
    CORAZONES("C"),
    ESPADAS("E");

    private final String simbolo;

    Suit(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
} 
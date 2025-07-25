public final class Card {
    private final Suit suit;
    private final Valor valor;

    public Card(Suit suit, Valor valor) {
        this.suit = suit;
        this.valor = valor;
    }

    public Suit getSuit() {
        return suit;
    }

    public Valor getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return suit.getSimbolo() + valor.getSimbolo();
    }
} 
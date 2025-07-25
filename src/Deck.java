import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private final List<Card> cartas;
    private int indiceActual = 0;

    public Deck() {
        cartas = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Valor valor : Valor.values()) {
                cartas.add(new Card(suit, valor));
            }
        }
        Collections.shuffle(cartas, new Random());
    }

    public Card sacarCarta() {
        if (indiceActual < cartas.size()) {
            return cartas.get(indiceActual++);
        } else {
            throw new IllegalStateException("No hay más cartas en el mazo");
        }
    }
} 
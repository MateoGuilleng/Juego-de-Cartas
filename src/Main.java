import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck mazo = new Deck();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al reto de cartas. Pulsa Enter para sacar tus cartas...");
        sc.nextLine();

        Card cartaPC = mazo.sacarCarta();
        Card cartaUsuario = mazo.sacarCarta();

        System.out.println("La computadora saca: " + cartaPC);
        System.out.println("Tu carta es:         " + cartaUsuario);

        int valorPC = cartaPC.getValor().getValor();
        int valorUsuario = cartaUsuario.getValor().getValor();

        if (valorPC == valorUsuario) {
            System.out.println("¡Vaya! Es un empate, nadie gana esta vez.");
        } else if (valorPC > valorUsuario) {
            System.out.println("La computadora gana esta ronda. ¡Suerte para la próxima!");
        } else {
            System.out.println("¡Felicidades! Tu carta es mayor, ganaste.");
        }

        System.out.println("¿Te animas a jugar otra vez? (Reinicia el programa)");
    }
}
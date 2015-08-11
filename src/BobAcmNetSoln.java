import java.util.BitSet;
import java.util.Scanner;

/**
 * 2015 - Bob's Bingo Bonanza [http://livearchive.onlinejudge.org]
 *
 * @author BreakDark
 * @version 1.1 beta
 */
// ACEPTADO!!! xD
public class BobAcmNetSoln {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        BitSet modTarjeta = new BitSet(25); // para el modelo de la tarjeta
        byte n; // para el numero de tarjetas
        int game = 1; // para el numero de juego
        BitSet[] tarjeta = new BitSet[100];
        byte i, j; // para los bucles
        String linea; // para leer una linea

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        for(i = 0; i < 100; i++)
            tarjeta[i] = new BitSet(76);
        do{
            // leemos el modelo
            j = 0;
            linea = "";
            modTarjeta.clear();
            for(i = 0; i < 5; i++)
                linea += Lee.next();
            for(i = 0; i < linea.length(); i++){
                if(linea.charAt(i) == 'X')
                    modTarjeta.set(i);
            }
            // leemos n
            n = Lee.nextByte();
            if(n > 0){
                if(game > 1)
                    System.out.println(); // linea en blanco
                // llenamos las tarjetas
                for(i = 0; i < n; i++){
                    tarjeta[i].clear();
                    for(j = 0; j < 25; j++){
                        if(modTarjeta.get(j))
                            tarjeta[i].set(Lee.nextByte());
                        else
                            Lee.nextByte();
                    }
                }
                System.out.println("Game " + game++);
                // procesamos la informacion
                procesar(tarjeta, n);
            }
        } while(n > 0);
    }
    /** procedimiento que hace todo el trabajo */
    private static void procesar(BitSet[] tarjeta, byte n) {
        byte i, j;
        // buscamos en todos los juegos de tarjetas
        for(i = 1; i < n; i++){
            // recorremos las tarjetas
            for(j = 0; j < i; j++){
                // preguntamos si tienen numeros comunes
                if(tarjeta[i].equals(tarjeta[j])){
                    System.out.println("Card " + (i + 1) + " is equivalent to card " + (j + 1));
                    break;
                }
            }
        }
    }
}


//Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0 e gestista sia l'eccezione della divisione che quella di
// indice non presente nell'array, leggendone il messaggio. Eseguire sempre un blocco di codice scrivendo un messaggio in console.

public class Main {
    public static void main(String[] args) {
        int[] arrayTest = {1, 3, 5, 6, 7};
        dividiIndexPerZero(arrayTest, 7);

    }

    public static void dividiIndexPerZero(int[] array, int index) {
        try {
            int div = array[index] / 0;
            System.out.println("divisione" + div);
        } catch (ArithmeticException e) {
            System.out.println("Indice dell'array non divisibile per 0" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Non è presente l'indice nell'array" + e);
        }
    }
}

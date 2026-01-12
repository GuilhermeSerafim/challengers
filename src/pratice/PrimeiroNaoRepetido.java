package pratice;
import java.util.HashMap;
import java.util.Map;

public class PrimeiroNaoRepetido {

    public static Character primeiroCaractereUnico(String s) {
        Map<Character, Integer> frequencias = new HashMap<>();

        // 1ª passada: contar frequências
        for (char c : s.toCharArray()) {
            frequencias.put(c, frequencias.getOrDefault(c, 0) + 1);
        }

        // 2ª passada: achar o primeiro com frequência 1
        for (char c : s.toCharArray()) {
            if (frequencias.get(c) == 1) {
                return c;
            }
        }

        return null; // se não existir
    }

    public static void main(String[] args) {
        String texto = "aabbcddee";
        System.out.println(primeiroCaractereUnico(texto)); // c
    }
}

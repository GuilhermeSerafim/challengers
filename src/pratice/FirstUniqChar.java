package pratice;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
public static void main(String[] args) {
        System.out.println(firstUniqChar("swiss"));      // Saída esperada: 1 (índice do 'w')
        System.out.println(firstUniqChar("aabbcc"));     // Saída esperada: -1
        System.out.println(firstUniqChar(""));           // Saída esperada: -1
    }

    public static int firstUniqChar(String s) {
        // 1. Sanity Check: Tratar entradas nulas ou vazias (Robustez)
        if (s == null || s.length() == 0) {
            return -1;
        }

        // 2. Criar o Mapa de Frequência
        // Chave: o caractere | Valor: quantas vezes ele apareceu
        Map<Character, Integer> countMap = new HashMap<>();
        
        // 3. Primeira passada: Alimentar o mapa (O(n))
        for (char c : s.toCharArray()) {
            // Uso do getOrDefault para sintaxe limpa e eficiente
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        // 4. Segunda passada: Encontrar o primeiro caractere com contagem 1
        // Percorremos a string original para garantir a ordem de aparição
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i; // Encontramos o primeiro único!
            }
        }
        
        return -1; // Caso todos se repitam
    }
}

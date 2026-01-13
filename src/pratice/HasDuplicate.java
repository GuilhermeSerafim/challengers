package pratice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HasDuplicate {
    public static void main(String[] args) {
        System.out.println(hasDuplicate(List.of(1, 2, 3, 4, 5)));       // Saída esperada: false
        System.out.println(hasDuplicate(List.of(1, 2, 3, 4, 5, 3)));    // Saída esperada: true
        System.out.println(hasDuplicate(List.of()));                    // Saída esperada: false
    }
    public static boolean hasDuplicate(List<Integer> nums) {
        // 1. Sanity Check (Sempre trate entradas nulas/vazias)
        if (nums == null || nums.isEmpty()) {
            return false;
        }

        // 2. Criar o Set para rastrear o que já vimos
        Set<Integer> seen = new HashSet<>();

        // 3. Percorrer a lista uma única vez (O(n))
        for (Integer num : nums) {
            // Se o .add() retornar false, significa que o número já estava no Set
            if (!seen.add(num)) {
                return true; // Duplicata encontrada!
            }
        }

        // 4. Se o loop terminar, todos os números são distintos
        return false;
    }
}

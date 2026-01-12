package pratice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuscaEficiente {

    public static void main(String[] args) {

        // Lista original
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        // Conversão para HashSet (custo O(n) uma única vez)
        Set<Integer> numerosSet = new HashSet<>(numeros);

        // Buscas repetidas (O(1) cada)
        System.out.println(numerosSet.contains(30)); // true
        System.out.println(numerosSet.contains(99)); // false
        System.out.println(numerosSet.contains(10)); // true
    }
}

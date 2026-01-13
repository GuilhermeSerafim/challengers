package pratice;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(List.of(1, 2, 3));

        arr.add(List.of(4, 5, 6));

        arr.add(List.of(7, 8, 9));
        int sumDiagonalRight = 0;
        int sumDiagonalLeft = 0;
        for (int i = 0; i < arr.size(); i++) {
            sumDiagonalRight += arr.get(i).get(i);
            sumDiagonalLeft += arr.get(i).get(arr.size() - 1 - i);
        }

        System.out.println("Sum Diagonal Right: " + sumDiagonalRight);
        System.out.println("Sum Diagonal Left: " + sumDiagonalLeft);
    }
}

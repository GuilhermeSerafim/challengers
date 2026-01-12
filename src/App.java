import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int [] numbersNotOrdered = {34, 2, 23, 67, 4, 89, 1, 5};
        Arrays.sort(numbersNotOrdered);
        System.out.println(Arrays.toString(numbersNotOrdered));
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длинну массива: ");
        int length = in.nextInt();
        System.out.println("Введите элементы массива: ");

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = in.nextInt();
        }

        System.out.println("Введите коэффициент мажоритарности: ");
        double coefMajority = in.nextDouble();

        HashMap<Integer,Integer> uniqueElements = new HashMap<>();

        double majority = length * coefMajority;
        for (int n : array){
            uniqueElements.put(n, uniqueElements.getOrDefault(n, 0) + 1);
        }

        System.out.println("Мажоритарные элементы массива: ");
        for (Map.Entry<Integer, Integer> entry : uniqueElements.entrySet()) {
            if(entry.getValue() >= Math.ceil(majority)){
                System.out.println(entry.getKey());
            }
        }
    }
}
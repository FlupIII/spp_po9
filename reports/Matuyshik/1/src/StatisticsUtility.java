import java.util.Arrays;
import java.util.Scanner;

public class StatisticsUtility {
    // Задание 1
    public static double calculateMean(int[] sequence) {
        int sum = 0;
        for (int num : sequence) {
            sum += num;
        }
        return (double) sum / sequence.length;
    }

    public static double calculateVariance(int[] sequence) {
        double mean = calculateMean(sequence);
        double sumSquaredDiff = 0;
        for (int num : sequence) {
            sumSquaredDiff += Math.pow(num - mean, 2);
        }
        return sumSquaredDiff / sequence.length;
    }

    // Задание 2
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Swap elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            // Move towards the center
            left++;
            right--;
        }
    }

    // Задание 3
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Обращение массива, переданного в аргументах командной строки
        if (args.length > 0) {
            int[] argSequence = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                argSequence[i] = Integer.parseInt(args[i]);
            }
            System.out.println("Исходная последовательность из аргументов командной строки: " + Arrays.toString(argSequence));
            reverse(argSequence);
            System.out.println("Обращенная последовательность из аргументов командной строки: " + Arrays.toString(argSequence));
        } else {
            System.out.println("Пожалуйста, введите последовательность чисел в качестве аргументов командной строки.");
        }

        // Ввод последовательности из N целых чисел
        System.out.print("Введите размер последовательности: ");
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        System.out.println("Введите последовательность из " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        // Вычисление среднего значения и выборочной дисперсии
        double mean = calculateMean(sequence);
        double variance = calculateVariance(sequence);
        System.out.println("Среднее значение: " + mean);
        System.out.println("Выборочная дисперсия: " + variance);

        // Обращение массива
        System.out.println("Исходная последовательность: " + Arrays.toString(sequence));
        reverse(sequence);
        System.out.println("Обращенная последовательность: " + Arrays.toString(sequence));

        // Проверка на палиндром
        System.out.print("Введите строку для проверки на палиндром: ");
        String str = scanner.next();
        System.out.println("Строка является палиндромом: " + isPalindrome(str));

        scanner.close();
    }
}

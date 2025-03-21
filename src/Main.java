import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] salary = {21_900, 22_000, 11_120, 14_190, 11_900};
        int totalSalary = Arrays.stream(salary).sum();
        System.out.println("Сумма зарплат за месяц составила " + totalSalary + " рублей");
        System.out.println("Задание 2");
        int[] salaryComp = {39_900, 29_000, 19_120, 19_190, 9_900};
        int minSalary = 99999999;
        int maxSalary = 0;
        for (int i = 0; i < salaryComp.length; i++) {
            if (salaryComp[i] > maxSalary) {
                maxSalary = salaryComp[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxSalary + " рублей");
        for (int i = 0; i < salaryComp.length; i++) {
            if (salaryComp[i] < minSalary) {
                minSalary = salaryComp[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSalary + " рублей");
        System.out.println("Задание 3");
        int[] salaryPipls = {56_900, 45_000, 34_120, 12_190, 159_900};
        double sumPipl = Arrays.stream(salaryPipls).sum();
        double average = sumPipl / salaryPipls.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println(" "); // новый вывод кода с новой строки

    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] monthlyPayments = {1, 2, 3, 4, 5};
        int monthlyExpenses = 0;
        for (int i = 0; i < monthlyPayments.length; i++) {
            monthlyExpenses = monthlyExpenses + monthlyPayments[i];
        }
        System.out.println("Сумма трат за месяц составила " + monthlyExpenses + " рублей");
        System.out.println("Задача 2");
        int weeklyExpensesMin = monthlyPayments[0];
        int weeklyExpensesMax = -1;
        for (int i = 0; i < monthlyPayments.length; i++) {
            if (monthlyPayments[i] > weeklyExpensesMax){
                weeklyExpensesMax = monthlyPayments[i];
            }
            if (weeklyExpensesMin > monthlyPayments[i]) {
                weeklyExpensesMin = monthlyPayments[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + weeklyExpensesMin + " рублей. Максимальная сумма трат за неделю составила " + weeklyExpensesMax + " рублей");
        System.out.println("Задача 3");
        float monthAmountExpenses = (float) monthlyExpenses / monthlyPayments.length;
        System.out.println(monthAmountExpenses);
        System.out.println("Задача 4");
        char [] reversFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reversFullName.length; i != 0; i--) {
            System.out.print(reversFullName[i - 1]);
        }

    }
}
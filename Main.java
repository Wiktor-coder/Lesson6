
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] products = {"Хлеб", "Яблоки", "Молоко", "Греча", "Рис"};
        int[] prices = {40, 135, 80, 75, 78};

        //масив для хранения корзины
        int[] cart = new int[products.length];
        int sumProducts = 0;

        Scanner sc = new Scanner(System.in);

        //Вывод списка товаров
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб/шт");
        }
        System.out.println("Выберите товар и количество или введите `end`");

        while (true) {
            String input = sc.nextLine();

            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);

            // Добавляем товар в корзину
            cart[productNumber] += productCount;

            System.out.println("Выберите товар и количество или введите `end`");
        }
        //Выводим корзину
        System.out.println("Ваша корзина:");
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] > 0) {
                int productSum = cart[i] * prices[i];
                System.out.println(products[i] + " " + cart[i] + " шт " +
                        prices[i] + " руб/шт " + productSum + " руб в сумме");
                sumProducts += productSum;
            }
        }
        System.out.println("Итого " + sumProducts + " руб");
    }
}
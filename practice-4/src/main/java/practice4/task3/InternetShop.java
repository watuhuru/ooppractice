package practice4.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternetShop {
    private static final String DEMO_LOGIN = "student";
    private static final String DEMO_PASSWORD = "java123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!authenticate(scanner)) {
            System.out.println("Вход не выполнен.");
            return;
        }

        List<Product> cart = new ArrayList<>();
        while (true) {
            printCategories();
            System.out.print("Выберите категорию или 0 для перехода к покупке: ");
            int categoryId = readInt(scanner);
            if (categoryId == 0) {
                break;
            }

            ProductCategory category = ProductCategory.findById(categoryId);
            if (category == null) {
                System.out.println("Такой категории нет.");
                continue;
            }

            printProducts(category);
            System.out.print("Введите номер товара или 0, чтобы вернуться к категориям: ");
            int productId = readInt(scanner);
            if (productId == 0) {
                continue;
            }

            Product product = Product.findById(productId);
            if (product == null || product.getCategory() != category) {
                System.out.println("Товар не найден в этой категории.");
                continue;
            }

            cart.add(product);
            System.out.println("Добавлено в корзину: " + product.getTitle());
        }

        checkout(scanner, cart);
    }

    private static boolean authenticate(Scanner scanner) {
        System.out.println("Вход в интернет-магазин");
        System.out.print("Логин: ");
        String login = scanner.nextLine();
        System.out.print("Пароль: ");
        String password = scanner.nextLine();
        return DEMO_LOGIN.equals(login) && DEMO_PASSWORD.equals(password);
    }

    private static void printCategories() {
        System.out.println("\nКатегории товаров:");
        for (ProductCategory category : ProductCategory.values()) {
            System.out.println(category);
        }
    }

    private static void printProducts(ProductCategory category) {
        System.out.println("\nКаталог: " + category.getTitle());
        for (Product product : Product.values()) {
            if (product.getCategory() == category) {
                System.out.println(product);
            }
        }
    }

    private static void checkout(Scanner scanner, List<Product> cart) {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста. Покупок нет.");
            return;
        }

        int total = 0;
        System.out.println("\nКорзина:");
        for (Product product : cart) {
            System.out.println(product.getTitle() + " — " + product.getPrice() + " руб.");
            total += product.getPrice();
        }
        System.out.println("Итого: " + total + " руб.");
        System.out.print("Подтвердить покупку? (1 — да, 0 — нет): ");
        if (readInt(scanner) == 1) {
            System.out.println("Покупка оформлена. Спасибо за заказ!");
        } else {
            System.out.println("Покупка отменена.");
        }
    }

    private static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Введите целое число: ");
            scanner.nextLine();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
}

package seminars.seminar01.task4;


/*
Задача: Создание класса "Товар"

Создайте класс Product для представления товара в интернет-магазине. Каждый товар должен иметь следующие характеристики:

Название товара (name).
Цена товара (price).
Количество товара в наличии (quantity).
Класс Product должен обеспечивать следующую функциональность:

Конструктор, который принимает название, цену и количество товара и инициализирует соответствующие поля класса.
Методы get и set для каждой из характеристик товара (название, цена, количество).
Метод calculateTotalPrice, который будет вычислять общую стоимость товара на основе цены и количества.
Метод displayProductInfo, который будет выводить информацию о товаре (название, цена, количество) на экран.
Создайте несколько объектов класса Product и продемонстрируйте работу методов.
 */
public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setName("Груша");
        product.setPrice(500.50);
        product.setQuantity(10);

        Product product2 = new Product();
        product2.setName("Груша");
        product2.setPrice(700);
        product2.setQuantity(5);

        System.out.println(calculateTotalPrice(product2));
        displayProductInfo(product2);
    }

    static double calculateTotalPrice(Product product) {
        return product.getPrice() * product.getQuantity();
    }

    static void displayProductInfo(Product product) {
        System.out.println(product.getName() + " " + product.getPrice() + " " + product.getQuantity());
    }
}

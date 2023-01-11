public class Main {
    public static void main(String[] args) {
        int amountTicket = 100; // стоимость билета в рублях
        int mileAmount = 20; // стоимость мили в рублях

        int miles; // объявление переменной для количества миль
        if (amountTicket < 0) {
            System.out.println("Стоимость билета не может быть отрицательной!"); // проверка неверных входных данных
        } else {
            miles = amountTicket / mileAmount; // подсчет кол-ва миль
            System.out.println("Ваше количество миль: " + miles + ". Спасибо за покупку!"); // вывод результата
        }
    }
}
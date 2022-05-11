public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService(); //Создаем метод
        int price = 10_000;
        int miles = service.calculate(price); // Определяем метод calculate
        System.out.println(miles); // вывод итогового значения
    }
}
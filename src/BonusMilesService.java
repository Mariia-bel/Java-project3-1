public class BonusMilesService {
    public int calculate(int price) {
        int rub = 20;    // рублей для одной бонусной милли
        int miles = price / rub;  // Рассчёт количества бонусных милль
        return miles;
    }
}

package ru.netology.Bonus;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long BonusBelowLimitForRegistered = service.calculate(1000_60, true);
        System.out.println(BonusBelowLimitForRegistered);
    }
}

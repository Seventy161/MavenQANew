public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int bonus = service.calcBonus(amount: 5_000, isRegistered: true);
        System.out.println(bonus);
    }
}

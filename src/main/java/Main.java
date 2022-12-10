public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 5_000;
        boolean registered = true;
        long expected = 150;
        long actual = service.calculate(amount, registered);

        boolean passed = expected == actual;

        System.out.println(passed);

    }
}


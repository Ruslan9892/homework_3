
public class Main {
static double telescopePrise = 14_000;
    static double account = 1000;
    static double stipend = 2500;
    static double percentBank = 5;
    static int countMonth = 0;
    public static void main(String[] args) {
        while (account < telescopePrise) {
            countMonth++; // countMonth = countMonth + 1;
            account += (account * percentBank / 12) / 100; //увеличиваем на проценты от вклада
            account += stipend;
        }
        System.out.println("кол-во месяцев потребовалось " + countMonth);
        System.out.println(" кол-во средств на момент покупки телескопа" + account);
    }
}
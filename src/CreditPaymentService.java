public class CreditPaymentService {
    public int calculate(int loan, int years, double interest) {

        double monthlyPayment;
        double month = years * 12 * (-1); // количество месяцев
        double monthlyPercent = interest / (100 * 12); // % каждый месяц
        monthlyPayment = (loan * (monthlyPercent / (1 - Math.pow(1 + monthlyPercent, month))));

        return (int) monthlyPayment;
    }

}

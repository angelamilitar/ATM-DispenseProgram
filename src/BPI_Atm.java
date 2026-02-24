public class BPI_Atm {
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        int[] testAmounts = {2970, 270, 250};
        for (int amount : testAmounts) {
            System.out.println("\n=============================");
            System.out.println("Requesting Amount: " + amount);
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiples of 10.");
            } else {
                atmDispenser.dispense(new Currency(amount));
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Система расчёта стоимости топлива");

        int fuelTipe = 92;
        int amout = 15;
        boolean hasDiscount = amout > 10;

        double fuel92price = 60.2;
        double fuel95price = 67.33;

        double fuelPrice = 0;
        double discount = 0.1;

        String wrongFuelTypeMessage = "Указан неверный тип топлива";
        String fuelPriceMessage;

        if (fuelTipe == 92) {
            fuelPrice = fuel92price;
        } else if (fuelTipe == 95){
            fuelPrice = fuel95price;
        } else {
            System.out.println(wrongFuelTypeMessage);
        }

        if (hasDiscount) {
            fuelPrice = (1 - discount)* fuelPrice;
        }

        if (amout < 1) {
            System.out.println("Указано слишком малое колличество топлива!");
            amout = 0;
        }

        fuelPriceMessage = "Цена выбранного топлива: " + fuelPrice + "руб.";
        System.out.println(fuelPriceMessage);

        double totalPrice = fuelPrice * amout;
        System.out.println("Общая стоимость заправки:" + totalPrice + "руб.");

    }
}
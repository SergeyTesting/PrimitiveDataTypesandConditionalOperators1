public class Main {
    public static void main(String[] args) {

        int price = 12_600; //стоимость билета
        int bonusPerMile = 20; //колличество рублей для одной бонусной мили
        int bonusMiles = price / bonusPerMile; //количество бонусных миль
        System.out.println(" Вы заработали " + bonusMiles + " бонусных миль ");


    }
}

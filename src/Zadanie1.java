public class Zadanie1 {

    public static void main(String[] args) {
        int zmienna1 = 24432;
        int zmienna2 = 82334;
        int zmienna3 = 2444;
        int zmienna4 = 634554;

        int sum1 = zmienna1 + zmienna2;
        int sum2 = zmienna3 + zmienna4;
        int sum3 = sum1 + sum2;

        if (sum1 % 2 == 0) {
            System.out.println("Suma zmienej 1 i 2 jest parzysta");
        } else {
            System.out.println("Suma1 nie jest parzysta");
        }

        if (sum2 % 2 == 0) {
            System.out.println("Suma zmeinej 3 i 4 jest parzysta");
        } else {
            System.out.println("Suma 2 nie jest parzysta");
        }

        if (sum3 % 2 == 0){
            System.out.println("Wszystkie liczby są parzyste");
        }else {
            System.out.println("Suma nie jest parzysta");
        }

    }
}

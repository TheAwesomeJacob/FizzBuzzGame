package FizzBuzzGame;

import java.util.Scanner;

public class FizzBuzzLogic {

    private int x;
    Scanner scanner = new Scanner(System.in);

    FizzBuzzLogic(int x){
        this.x = x;
    }

    public void game() {

        do{
            System.out.println("Wpisz liczbę do sprawdzenia czy jest podzielna przez 3 lub 5");
            x = scanner.nextInt();

            if (x % 15 == 0) {
                System.out.println("FizzBuzz " + x);
            } else if (x % 5 == 0) {
                System.out.println("Buzz " + x);
            } else if (x % 3 == 0) {
                System.out.println("Fizz " + x);
            } else {
                System.out.println(x);
            }

        }while(x != 0);
    }
}



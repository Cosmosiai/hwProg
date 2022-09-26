package hw4.n11;

import java.util.Scanner;

public class Contract {
    Scanner s = new Scanner(System.in);
    String text;

    public Contract(String text) {
        this.text = text;
    }

    public Contract(){
        System.out.println("Введите текст контракта");
        this.text = s.nextLine();
    }
}

package hw1.oop;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Methods {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void userMenu() {
        System.out.printf("Здравствуйте\n1) найти по критериям\n2) показать всё\n3) Закончить выбор");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.printf("");
            case 2:
                System.out.printf("");
            default:
                break;
        }
    }

    public static LinkedList<Relax> filter(LinkedList<Relax> rel) {
        System.out.printf("в каждом из следующих пунктов цифра 0 обозначает пропуск, а цифра -1 выход  в главное меню\nвыберите вид отдыха\n" +
                "1)Отдых" +
                "\n2)Экскурсия" +
                "\n3)Шоппинг" +
                "\n4)Лечение" +
                "\n5)Круиз\n");
        int typee = sc.nextInt();

        System.out.printf("на сколько дней собираетесь выезжать:");
        int dayss = sc.nextInt();
        if (dayss == -1) userMenu();
        boolean food = false;
        if (typee != 3 && typee != 5) {
            System.out.println("с питанием?" +
                    "\n1) Да" +
                    "\n2) Нет");
            int foodd = sc.nextInt();
            if (foodd == 1) food = true;
            else if (foodd == -1) {
                userMenu();
            }
        }
        System.out.println("укажите примерную оплату за ночь");
        int commission = sc.nextInt();
        if (commission == -1) {
            userMenu();
        }
        String transport = "";
        if (typee != 5) {
            System.out.println("here is transport which you can choose");
            String[] trans = {"Metro", "U-Bahn", "S-Bahn", "Metrotram", "Auto", "Bus", "taxi", "Flugzeug", "Zug", "Schiff"};
            System.out.println(Arrays.toString(trans));
            sc.nextLine();
            transport = sc.nextLine();
            if (transport.equals("-1")) {
                userMenu();
            }
        }

        LinkedList<Relax> relax = new LinkedList<>();
        Relax r = null;
        switch (typee) {
            case 1 -> {
                r = new Holidays(commission, dayss, food, transport);
                for (Relax i : rel) {
                    if (i.getType().equals(r.getType()) && i.getDays() <= dayss && i.getCommission() <= commission && i.getTransport().equals(transport) && food == i.isFood())
                        relax.add(i);
                }
            }
            case 2 -> {
                r = new Excursion(commission, dayss, food, transport);
                for (Relax i : rel) {
                    if (i.getType().equals(r.getType()) && i.getDays() <= dayss && i.getCommission() <= commission && i.getTransport().equals(transport) && food == i.isFood())
                        relax.add(i);
                }
            }
            case 3 -> {
                r = new Shoping(commission, dayss, transport);
                for (Relax i : rel) {
                    if (i.getType().equals(r.getType()) && i.getDays() <= dayss && i.getCommission() <= commission && i.getTransport().equals(transport))
                        relax.add(i);
                }
            }
            case 4 -> {
                r = new Treatment(commission, dayss, food, transport);
                for (Relax i : rel) {
                    if (i.getType().equals(r.getType()) && i.getDays() <= dayss && i.getCommission() <= commission && i.getTransport().equals(transport) && food == i.isFood())
                        relax.add(i);
                }
            }
            case 5 -> {
                r = new Cruise(commission, dayss);
                for (Relax i : rel) {
                    if (i.getType().equals(r.getType()) && i.getDays() <= dayss && i.getCommission() <= commission)
                        relax.add(i);
                }
            }
        }
        return relax;
    }

    public static void listSout(LinkedList<Relax> r) {
        for (Relax rel : r) {
            System.out.println(rel.toString());
        }
    }

    public static LinkedList<Relax> rand(int a) {
        LinkedList<Relax> relaxesList = new LinkedList<>();
        for (int i = 0; i < a; i++){
            switch (random.nextInt(5)) {
                case 0 -> {
                    Holidays h = Holidays.random();
                    relaxesList.add(h);
                }
                case 1 -> {
                    Excursion e = Excursion.random();
                    relaxesList.add(e);
                }
                case 2 -> {
                    Shoping s = Shoping.random();
                    relaxesList.add(s);
                }
                case 3 -> {
                    Cruise c = Cruise.random();
                    relaxesList.add(c);
                }
                case 4 -> {
                    Treatment t = Treatment.random();
                    relaxesList.add(t);
                }
                default -> throw new IllegalStateException("Unexpected value: " + random.nextInt(5));
            }
        }
        return relaxesList;
    }

}

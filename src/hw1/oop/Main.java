package hw1.oop;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Relax> rel = Methods.rand(100);
        Methods.listSout(rel);
        Methods.listSout(Methods.filter(rel));
    }
}
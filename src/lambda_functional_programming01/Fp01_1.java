package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.List;

public class Fp01_1 {
    /*
        1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
        2) Functional Programming'de "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
           Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğunlaşılır.
        3) Functional Programming, Arrays ve Collections ile kullanılır.
        4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.

     */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);

        System.out.println(liste);

        System.out.println("\nStructured");
        listElemanlariniYazdirStructured(liste);

        System.out.println("\nFunctional");
        listElemanlariniYazdirFunctional(liste);

    }

    //1)Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> liste) {

        liste.stream().forEach(t -> System.out.print(t + " "));

    }

    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void listElemanlariniYazdirStructured(List<Integer> liste) {
        for (int i = 0; i < liste.size(); i++) {
            System.out.print(liste.get(i) + " ");
        }
        System.out.println("\n----- VEYA -----");
        for (Integer w : liste) {
            System.out.print(w + " ");
        }
    }


}
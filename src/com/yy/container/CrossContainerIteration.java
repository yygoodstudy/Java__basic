package com.yy.container;

import java.util.*;

/**
 * @Date 2021/6/6 16:08
 */
public class CrossContainerIteration {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet pet = it.next();
            System.out.print(pet);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        Pet rat = new Pet("Rat", 1);
        Pet manx = new Pet("Manx", 2);
        Pet cymric = new Pet("Cymric", 3);
        Pet mutt = new Pet("Mutt", 4);
        Pet pug = new Pet("Pug", 5);
        Pet cymric2 = new Pet("Cymric", 6);
        Pet pug2 = new Pet("Pug", 7);
        Pet manx2 = new Pet("Manx", 8);

        ListIterator<Pet> listIterator = pets.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().name.equals("Mutt")) {
                System.out.println("listIterator.previous() = " + listIterator.previous());
                System.out.println("listIterator.next() = " + listIterator.next());
            }
        }


        pets.add(rat);
        pets.add(manx);
        pets.add(cymric);
        pets.add(mutt);
        pets.add(pug);
        pets.add(cymric2);
        pets.add(pug2);
        pets.add(manx2);
        List<Pet> petsLL = new LinkedList<>(pets);
        HashSet<Pet> petsHS = new HashSet<>(pets);
//        TreeSet<Pet> petsTS = new TreeSet<>(pets);

        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
//        display(petsTS.iterator());
    }
}

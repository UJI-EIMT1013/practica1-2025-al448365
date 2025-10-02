package practica1;

import java.util.*;

public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (ListIterator<Integer> it) {
        Set<Integer> resultado = new HashSet<>();
        Set<Integer> sinMúltiplos = new HashSet<>();

        //Ponemos al iterador al principio de la colección (HashSet<>);
        while(it.hasPrevious()) {
            it.previous();
        }

        int i = 0;
        while(it.hasNext()) {

        }
        return null;
    }

    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {
        //TODO

    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        //TODO
        return null;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}

package practica1;

import java.util.*;

import static java.lang.Math.sqrt;

public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        Set<Integer> resultado = new HashSet<>();
        Set<Integer> pasados = new HashSet<>();

        while(it.hasNext()) {
            Integer n = it.next();

            if(n != 0) {
                for(Integer m : pasados) {
                    if( m != 0) {
                        if(n % m == 0) {
                            resultado.add(n);
                        }
                        else if(m % n == 0) {
                            resultado.add(m);
                        }
                    }
                }
            }
            if(!pasados.contains(n))
                pasados.add(n);
        }
        return resultado;
    }

    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados) {
        Set<Integer> pasados = new HashSet<>();
        Iterator<Integer> it1 = cuadrados.iterator();
        Iterator<Integer> it2 = noCuadrados.iterator();

        while (it1.hasNext()) {
            Integer n = it1.next();

            if (n != 0) {
                for (Integer m : pasados) {
                    if (m != 0) {
                        if (sqrt(n) == m) {
                            if (!cuadrados.contains(n)) {
                                cuadrados.add(n);
                                noCuadrados.remove(n);
                            }
                        } else {
                            if (cuadrados.contains(n)) {
                                cuadrados.remove(n);
                                noCuadrados.add(n);
                            }
                        }
                    }
                }
            }
        }
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

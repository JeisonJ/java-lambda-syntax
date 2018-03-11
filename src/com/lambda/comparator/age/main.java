package com.lambda.comparator.age;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.lambda.comparator.pojo.Persona;
import com.lambda.comparator.pojo.ComparadorEdad;

public class main {
  public static void main(String[] args) {

    Persona personaA = new Persona("Juan   ", "Antonio  ", 25);
    Persona personaB = new Persona("Andrea ", "Fernandez", 72);
    Persona personaC = new Persona("Gabriel", "Ricaurte ", 12);

    List<Persona> personas = Arrays.asList(personaA, personaB, personaC);

    // InnerClass.
    ordenarPorEdadUno(personas);
    // Clase anonima.
    ordenarPorEdadDos(personas);
    // Bloque lambda.
    ordenarPorEdadTres(personas);
    // Lambda - inferencia de tipos.
    ordenarPorEdadCuatro(personas);
    // Lambda - Sin paréntesis y return.
    ordenarPorEdadCinco(personas);
  }

  public static void ordenarPorEdadUno(List<Persona> personas) {

    personas.sort(new ComparadorEdad());
    System.out.println("--- Opción uno! --- \n");
    personas.forEach(System.out::println);
  }

  public static void ordenarPorEdadDos(List<Persona> personas) {
    System.out.println("\n--- Opción dos! --- \n");
    personas.sort(
        new Comparator<Persona>() {

          @Override
          public int compare(Persona p1, Persona p2) {
            return p1.getEdad() > p2.getEdad() ? 1 : -1;
          }
        });

    personas.forEach(System.out::println);
  }

  private static void ordenarPorEdadTres(List<Persona> personas) {
    System.out.println("\n--- Opción Tres! --- \n");
    personas.sort(
        (Persona p1, Persona p2) -> {
          return p1.getEdad() < p2.getEdad() ? 1 : -1;
        });

    personas.forEach(System.out::println);
  }

  private static void ordenarPorEdadCuatro(List<Persona> personas) {
    System.out.println("\n--- Opción Cuatro! --- \n");
    personas.sort(
        (p1, p2) -> {
          return p1.getEdad() > p2.getEdad() ? 1 : -1;
        });

    personas.forEach(System.out::println);
  }

  private static void ordenarPorEdadCinco(List<Persona> personas) {
    System.out.println("\n--- Opción Cinco! --- \n");
    personas.sort((p1, p2) -> p1.getEdad() < p2.getEdad() ? 1 : -1);
    personas.forEach(System.out::println);
  }

}

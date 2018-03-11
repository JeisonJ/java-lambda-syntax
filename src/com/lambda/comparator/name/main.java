package com.lambda.comparator.name;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.lambda.comparator.pojo.Persona;
import com.lambda.comparator.pojo.ComparadorApellido;
import com.lambda.comparator.pojo.ComparadorNombre;

public class main {
  public static void main(String[] args) {

    Persona personaA = new Persona("Andrea ", "Fernandez", "Bolivar ", 21);
    Persona personaB = new Persona("Gabriel", "Gimenez  ", "Lopez   ", 44);
    Persona personaC = new Persona("Ana    ", "Sainz    ", "Ponte   ", 38);
    Persona personaD = new Persona("Ana    ", "Perez    ", "Ponte   ", 18);

    List<Persona> personas = Arrays.asList(personaA, personaB, personaC, personaD);

    // InnerClass.
    ordenarPorNombreUno(personas);
    ordenarPorApellidoUno(personas);
    
    // Bloque lambda - inferencia de tipos.
    ordenarPorNombreDos(personas);
    ordenarPorApellidoDos(personas);
    
    ordenarPorApellidos(personas);
  }

  public static void ordenarPorNombreUno(List<Persona> personas) {

    personas.sort(new ComparadorNombre());
    System.out.println("--- Opción uno! --- \n");
    personas.forEach(System.out::println);
  }

  public static void ordenarPorApellidoUno(List<Persona> personas) {

    personas.sort(new ComparadorApellido());
    System.out.println("\n--- Opción uno! --- \n");
    personas.forEach(System.out::println);
  }

  /*
   * Todo funciona , ahora bien si queremos realizar una
   * ordenación por otro campo?
   * ¿Construir un nuevo Comparator?
   */

  public static void ordenarPorNombreDos(List<Persona> personas) {
    System.out.println("\n--- Opción Cinco! --- \n");
    personas.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
    personas.forEach(System.out::println);
  }

  private static void ordenarPorApellidoDos(List<Persona> personas) {
    System.out.println("\n--- Opción Cinco! --- \n");
    personas.sort((p1, p2) -> p1.getApellido().compareTo(p2.getApellido()));
    personas.forEach(System.out::println);
  }

  /*
   * Encadenar expresiones lamdba a través del método thenComparing del 
   * interface Comparator.
   * 
   * Ordenar por Primer Apellido y luego Por Segundo Apellido.
   */
  private static void ordenarPorApellidos(List<Persona> personas) {
    System.out.println("\n--- Opción Cinco! --- \n");
    Comparator<Persona> comparatorA = (pa, pb) -> pa.getApellido().compareTo(pa.getApellido());
    Comparator<Persona> comparatorB = comparatorA.thenComparing((pa, pb) -> pa.getApellido2().compareTo(pa.getApellido2()));
    personas.sort(comparatorB);
    
    personas.forEach(System.out::println);
  }
}

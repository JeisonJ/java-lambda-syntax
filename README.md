# Implementación de Lambda Syntax

Simplificando nuestro código gracias a  las nuevas características en Java SE 8 haciendo uso de Lambda Syntax, diseñada para soportar un desarrollo más rápido y fácil.


Ejemplo sencillo usando un [Java Comparator](https://www.arquitecturajava.com/java-comparator-interface-y-lambdas/). 

## InnerClass
```Java
public class ComparadorEdad implements Comparator<Persona> {

  @Override
  public int compare(Persona p1, Persona p2) {
    return p1.getEdad() > p2.getEdad() ? 1:-1;
  }
}

public static void ordenarPorEdad(List<Persona> personas) {
    personas.sort(new ComparadorEdad());
    personas.forEach(System.out::println);
  }
```
## Clase anónima
```Java
public static void ordenarPorEdad(List<Persona> personas) {
    personas.sort(
        new Comparator<Persona>() {
		 @Override
          public int compare(Persona p1, Persona p2) {
            return p1.getEdad() > p2.getEdad() ? 1 : -1;
          }
    });
	personas.forEach(System.out::println);
  }
 ```

## Lambda 
```Java
private static void ordenarPorEdadCinco(List<Persona> personas) {
    personas.sort((p1, p2) -> p1.getEdad() < p2.getEdad() ? 1 : -1);
    personas.forEach(System.out::println);
  }
 ```


### Pre-Requisites

- JDK8+

## Links

> Más ejemplos [arquitecturajava - Blog sobre Java EE](https://www.arquitecturajava.com/java-8-lambda-syntax/)
> Written with [StackEdit](https://stackedit.io/).
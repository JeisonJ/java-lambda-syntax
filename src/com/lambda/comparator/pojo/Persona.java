package com.lambda.comparator.pojo;

public class Persona {

  private String nombre;
  private String apellido;
  private String apellido2;
  private int edad;

  public Persona(String nombre, String apellido, int edad) {
    this.nombre   = nombre;
    this.apellido = apellido;
    this.edad 	  = edad;
  }

  public Persona(String nombre, String apellido, String apellido2, int edad) {
    this.nombre    = nombre;
    this.apellido  = apellido;
    this.apellido2 = apellido2;
    this.edad 	   = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getApellido2() {
    return apellido2;
  }

  public void setApellido2(String apellido2) {
    this.apellido2 = apellido2;
  }

  @Override
  public String toString() {
    return this.getNombre() + " " + this.getApellido() +" "+ this.getApellido2() + " " + this.getEdad();
  }
}

package org.gex.v1
import groovy.transform.*
/**
 *A cat from Atoms catalog
 **/
@CompileStatic
@Canonical
public class Cat implements Serializable {

  /* The unique identifier for a cat */
  Long id

  /* Name of the cat */
  String name

  /* Something to play */
  Map toy

  /* friends */
  List friends

  /* characteristics */
  Map sings

  /* The age of the cat */
  Long age

  /* The weight of the cat */
  BigDecimal weight

  /* Something to eat */
  Food food

  /* The owner of the cat. */
  Owner owner

  /* Errores al procesar la petición */
  List<Error> errors

  static class Food implements Serializable {

    /* what the cat eats */
    String name

    /* Something nested to eat */
    Description description

    static class Description implements Serializable {

      /* what the cat eats */
      String name

    }
  }
}

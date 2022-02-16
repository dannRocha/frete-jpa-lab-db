package frete;

import jakarta.persistence.Persistence;

public class Main {
  public static void main(String[] args) {
    var factory = Persistence
        .createEntityManagerFactory ("frete");
    var manager = factory.createEntityManager ();
  }
}

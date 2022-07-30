package com.trybe.acc.java.estadosbrasileiros;

import java.util.Random;

/**
 * Classe Estado Brasileiro.
 *
 */
public class EstadosBrasileiros {
  /**
   * Método principal para a execução do código.
   * 
   */
  public static void main(String[] args) {
    // Sorteia uma UF.
    String[] siglas = {"CE", "SC", "AM"};
    int pos = new Random().nextInt(siglas.length);

    // Mostra o nome do estado.
    mostraNomeEstado(siglas[pos]);
  }

  static String estadoBrasileiro = "";
  
  static void mostraNomeEstado(String uf) {
    switch (uf) {
      case "CE":
        estadoBrasileiro = "CEARA";
        break;
      case "SC":
        estadoBrasileiro = "SANTA CATARINA";
        break;
      case "AM":
        estadoBrasileiro = "AMAZONAS";
        break;
      default:
        System.out.print("Defina um estado do brasil.");
    }
    
    System.out.println(estadoBrasileiro);
  }

  // Chame a função escrevendo `imprime()`.
  static void imprime(String nomeEstado) {
    System.out.println(nomeEstado);
  }
}

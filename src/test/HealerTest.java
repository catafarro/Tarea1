package test;


import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

import heartstone.*;
/**
 * Clase que implementa los tests de Healer del paquete heartStone
 * 
 * @author Catalina Contreras
 */
public class HealerTest {
  Assassin asesino1;
  Assassin asesino2;
  Druid druid1;
  Healer healer;
  Hunter hunter;
  Knight knight;
  Mage mage;
  Paladin paladin;
  Shaman shaman;
  Warlock warlock;
  Druid druid2;
  Healer healer2;
  Hunter hunter2;
  Knight knight2;
  Mage mage2;
  Paladin paladin2;
  Shaman shaman2;
  Warlock warlock2;



  @Before
  public void setUp() throws Exception {
    asesino1 = new Assassin("canela", 3, 10);
    asesino2 = new Assassin("Catalina", 5, 10);
    druid2 = new Druid("bella", 2, 10);
    healer = new Healer("Rocco", 4, 10);
    hunter = new Hunter("Chimu", 2, 10);
    knight = new Knight("Consuelo", 3, 10);
    mage = new Mage("Coni", 7, 10);
    paladin = new Paladin("Camila", 4, 10);
    shaman = new Shaman("Carolina", 8, 10);
    warlock = new Warlock("Martin", 5, 10);
    druid1 = new Druid("Catalina", 5, 10);
    healer2 = new Healer("Rocco", 4, 10);
    hunter2 = new Hunter("Chimu", 10, 10);
    knight2 = new Knight("Consuelo", 10, 10);
    mage2 = new Mage("Coni", 10, 10);
    paladin2 = new Paladin("Camila", 9, 10);
    shaman2 = new Shaman("Carolina", 9, 10);
    warlock2 = new Warlock("Martin", 10, 10);
  }
  @Test
  public void testAtacarOtroIgualHealer() {
    asesino1.atacar(healer);
    healer2.atacar(healer);
    assertEquals(healer.damage(), 4, 0.01);

  }

  @Test
  public void testNoAtacarsinVidaHealer() {
    asesino2.atacar(asesino1);
    asesino1.atacar(healer);
    asesino1.atacar(healer);
    assertEquals(healer.damage(), 12, 0.01);
    healer.atacar(asesino1);
    assertEquals(asesino1.damage(), 5, 0.01);

  }

  @Test
  public void testNoRevivirConHealer() {
    hunter2.atacar(hunter);
    assertEquals(hunter.damage(), 10, 0.01);
    healer.atacar(hunter);
    assertEquals(hunter.damage(), 10, 0.01);

  }

  @Test
  public void testAtacarcontodosHealer() {
    asesino1.atacar(druid1);
    asesino1.atacar(hunter);
    asesino1.atacar(knight);
    asesino1.atacar(mage);
    asesino1.atacar(paladin);
    asesino1.atacar(shaman);
    asesino1.atacar(warlock);
    asesino1.atacar(asesino2);
    healer.atacar(druid1);
    healer.atacar(mage);
    healer.atacar(hunter);
    healer.atacar(paladin);
    healer.atacar(shaman);
    healer.atacar(knight);
    healer.atacar(asesino2);
    healer.atacar(warlock);
    assertEquals(warlock.damage(), 7, 0.01);
    assertEquals(asesino2.damage(), 1, 0.01);
    assertEquals(mage.damage(), 4, 0.01);
    assertEquals(hunter.damage(), 1, 0.01);
    assertEquals(paladin.damage(), 1, 0.01);
    assertEquals(shaman.damage(), 1, 0.01);
    assertEquals(knight.damage(), 0, 0.01);
    assertEquals(druid1.damage(), 1, 0.01);
  }

}

package test;


import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

import heartstone.*;

/**
 * Clase que implementa los tests de Knight del paquete heartStone
 * 
 * @author Catalina Contreras
 */
public class KnightTest {
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
  public void testAtacarOtroIgualKnight() {
    knight.atacar(knight2);
    assertEquals(knight2.damage(), knight.ataque(), 0.01);

  }

  @Test
  public void testNoAtacarsinVidaKnight() {
    knight2.atacar(knight);
    assertEquals(knight.damage(), 10, 0.01);
    knight.atacar(knight2);
    assertEquals(knight2.damage(), 0, 0.01);

  }

  @Test
  public void testAtacarcontodosKnight() {
    knight.atacar(druid1);
    knight.atacar(asesino1);
    knight.atacar(mage);
    knight.atacar(hunter);
    knight.atacar(paladin);
    knight.atacar(shaman);
    knight.atacar(warlock);
    knight.atacar(healer);
    assertEquals(healer.damage(), 3, 0.01);
    assertEquals(asesino1.damage(), 3, 0.01);
    assertEquals(mage.damage(), 3, 0.01);
    assertEquals(hunter.damage(), 3, 0.01);
    assertEquals(paladin.damage(), 1.5, 0.01);
    assertEquals(shaman.damage(), 3, 0.01);
    assertEquals(warlock.damage(), 3, 0.01);
    assertEquals(druid1.damage(), 3, 0.01);
  }


}

package test;


import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

import heartstone.*;
/**
 * Clase que implementa los tests de el paquete heartStone
 * 
 * @author Catalina Contreras
 */
public class HeartstoneTest {
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
  public void testAtacarOtroIgualHunter() {
    hunter.atacar(hunter2);
    hunter2.atacar(hunter);
    assertEquals(hunter.damage(), hunter2.ataque(), 0.01);
    assertEquals(hunter2.damage(), hunter.ataque(), 0.01);

  }

  @Test
  public void testNoAtacarsinVidaHunter() {
    hunter2.atacar(hunter);
    assertEquals(hunter.damage(), 10, 0.01);
    hunter.atacar(hunter2);
    assertEquals(hunter2.damage(), 0, 0.01);

  }

  @Test
  public void testAtacarcontodosHunter() {
    hunter.atacar(druid1);
    hunter.atacar(asesino1);
    hunter.atacar(knight);
    hunter.atacar(mage);
    hunter.atacar(paladin);
    hunter.atacar(shaman);
    hunter.atacar(warlock);
    hunter.atacar(healer);
    assertEquals(healer.damage(), 2, 0.01);
    assertEquals(asesino1.damage(), 2, 0.01);
    assertEquals(knight.damage(), 4, 0.01);
    assertEquals(mage.damage(), 2, 0.01);
    assertEquals(paladin.damage(), 2, 0.01);
    assertEquals(shaman.damage(), 4, 0.01);
    assertEquals(warlock.damage(), 2, 0.01);
    assertEquals(druid1.damage(), 2, 0.01);
  }

  @Test
  public void testAtacarOtroIgualMage() {
    mage.atacar(mage2);
    mage2.atacar(mage);
    assertEquals(mage.damage(), mage2.ataque(), 0.01);
    assertEquals(mage2.damage(), mage.ataque(), 0.01);

  }

  @Test
  public void testNoAtacarsinVidaMage() {
    mage2.atacar(mage);
    assertEquals(mage.damage(), 10, 0.01);
    mage.atacar(mage2);
    assertEquals(mage2.damage(), 0, 0.01);

  }

  @Test
  public void testAtacarcontodosMage() {
    mage.atacar(druid1);
    mage.atacar(asesino1);
    mage.atacar(knight);
    mage.atacar(hunter);
    mage.atacar(paladin);
    mage.atacar(shaman);
    mage.atacar(warlock);
    mage.atacar(healer);
    assertEquals(healer.damage(), 7, 0.01);
    assertEquals(asesino1.damage(), 7, 0.01);
    assertEquals(knight.damage(), 7, 0.01);
    assertEquals(hunter.damage(), 14, 0.01);
    assertEquals(paladin.damage(), 14, 0.01);
    assertEquals(shaman.damage(), 7, 0.01);
    assertEquals(warlock.damage(), 7, 0.01);
    assertEquals(druid1.damage(), 7, 0.01);
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

  @Test
  public void testAtacarOtroIgualWarlock() {
    warlock.atacar(warlock2);
    assertEquals(warlock2.damage(), warlock.ataque(), 0.01);

  }

  @Test
  public void testNoAtacarsinVidaWarlock() {
    warlock2.atacar(warlock);
    assertEquals(warlock.damage(), 10, 0.01);
    warlock.atacar(warlock2);
    assertEquals(warlock2.damage(), 0, 0.01);

  }

  @Test
  public void testAtacarcontodosWarlock() {
    warlock.atacar(druid1);
    warlock.atacar(asesino1);
    warlock.atacar(mage);
    warlock.atacar(hunter);
    warlock.atacar(paladin);
    warlock.atacar(shaman);
    warlock.atacar(knight);
    warlock.atacar(healer);
    assertEquals(healer.damage(), 5, 0.01);
    assertEquals(asesino1.damage(), 10, 0.01);
    assertEquals(mage.damage(), 2.5, 0.01);
    assertEquals(hunter.damage(), 5, 0.01);
    assertEquals(paladin.damage(), 5, 0.01);
    assertEquals(shaman.damage(), 5, 0.01);
    assertEquals(knight.damage(), 5, 0.01);
    assertEquals(druid1.damage(), 5, 0.01);
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

  @Test
  public void testAtacarOtroIgualPaladin() {
    asesino1.atacar(paladin);
    paladin2.atacar(paladin);
    assertEquals(paladin.damage(), 0, 0.01);
    assertEquals(paladin.ataque(), 7, 0.01);
  }

  @Test
  public void testNoAtacarsinVidaPaladin() {
    asesino2.atacar(asesino1);
    asesino1.atacar(healer);
    asesino1.atacar(healer);
    assertEquals(healer.damage(), 12, 0.01);
    healer.atacar(asesino1);
    assertEquals(asesino1.damage(), 5, 0.01);

  }


  @Test
  public void testAtacarcontodosPaladin() {
    asesino1.atacar(druid1);
    paladin2.atacar(druid1);
    assertEquals(druid1.damage(), 0, 0.01);
    assertEquals(druid1.ataque(), 11, 0.01);
    asesino1.atacar(hunter);
    paladin2.atacar(hunter);
    assertEquals(hunter.damage(), 0, 0.01);
    assertEquals(hunter.ataque(), 5, 0.01);
    asesino1.atacar(knight);
    paladin2.atacar(knight);
    assertEquals(knight.damage(), 0, 0.01);
    assertEquals(knight.ataque(), 6, 0.01);
    asesino1.atacar(mage);
    paladin2.atacar(mage);
    assertEquals(mage.damage(), 3, 0.01);
    assertEquals(mage.ataque(), 10, 0.01);
    asesino1.atacar(healer);
    paladin2.atacar(healer);
    assertEquals(healer.damage(), 0, 0.01);
    assertEquals(healer.ataque(), 10, 0.01);
    asesino1.atacar(shaman);
    paladin2.atacar(shaman);
    assertEquals(shaman.damage(), 0, 0.01);
    assertEquals(shaman.ataque(), 11, 0.01);
    asesino1.atacar(warlock);
    paladin2.atacar(warlock);
    assertEquals(warlock.damage(), 0, 0.01);
    assertEquals(warlock.ataque(), 8, 0.01);
    asesino1.atacar(asesino2);
    paladin2.atacar(asesino2);
    assertEquals(asesino2.damage(), 0, 0.01);
    assertEquals(asesino2.ataque(), 8, 0.01);
  }

  @Test
  public void testAtacarOtroIgualShaman() {
    shaman2.atacar(shaman);
    assertEquals(shaman.damage(), 3, 0.01);
    assertEquals(shaman.ataque(), 5, 0.01);
  }

  @Test
  public void testNoAtacarsinVidaShaman() {
    asesino2.atacar(shaman);
    asesino2.atacar(shaman);
    assertEquals(shaman.damage(), 10, 0.01);
    shaman.atacar(asesino2);
    assertEquals(asesino2.damage(), 0, 0.01);

  }


  @Test
  public void testAtacarcontodosShaman() {
    shaman2.atacar(druid1);
    assertEquals(druid1.damage(), 6, 0.01);
    assertEquals(druid1.ataque(), 0, 0.01);
    shaman2.atacar(hunter);
    assertEquals(hunter.damage(), 3, 0.01);
    assertEquals(hunter.ataque(), 0, 0.01);
    shaman2.atacar(knight);
    assertEquals(knight.damage(), 3, 0.01);
    assertEquals(knight.ataque(), 0, 0.01);
    shaman2.atacar(mage);
    assertEquals(mage.damage(), 3, 0.01);
    assertEquals(mage.ataque(), 4, 0.01);
    shaman2.atacar(healer);
    assertEquals(healer.damage(), 3, 0.01);
    assertEquals(healer.ataque(), 1, 0.01);
    shaman2.atacar(paladin);
    assertEquals(paladin.damage(), 3, 0.01);
    assertEquals(paladin.ataque(), 1, 0.01);
    shaman2.atacar(warlock);
    assertEquals(warlock.damage(), 6, 0.01);
    assertEquals(warlock.ataque(), 0, 0.01);
    shaman2.atacar(asesino1);
    assertEquals(asesino1.damage(), 3, 0.01);
    assertEquals(asesino1.ataque(), 0, 0.01);
  }

}

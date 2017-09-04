package heartstone;

/**
 * Clase Druid que implementa a la interface Carta y estiende a clase abstracta. Define los
 * metodos requeridos para la implementacion del juego heartstone.
 * 
 * @author Catalina Contreras
 */
public class Druid extends AbstractCartas implements Carta {
  /**
   * Constructor de la clase Druid.
   * 
   * @param nombre String que indica el nombre de la carta.
   * @param ataque double que indica el ataque que posee una carta.
   * @param vida double que indica la cantidad de vida que posee una carta.
   */
  public Druid(String nombre, int ataque, int vida) {
    super(nombre, ataque, vida);

  }

  /**
   * Metodo que realiza una accion u otra frente a la carta atacada X. Utiliza double dispatch.
   * 
   * @param Carta que será atacada
   */
  @Override
  public void atacar(Carta X) {
    if (this.Vida > this.Damage)
      X.jugarconDruid(this);
  }

  /**
   * Derivacion del metodo que ejecuta la accion de atacar una carta Druid con una carta Paladin.
   * 
   * @param Paladin Una carta de la clase Paladin cualquiera.
   */
  @Override
  public void jugarconPaladin(Paladin X) {
    this.Ataque = this.Ataque + 2 * (X.Ataque / 3);
    this.Damage = Math.max(this.Damage - 2 * (X.Ataque / 3), 0);

  }

  /**
   * Derivacion del metodo que ejecuta la accion de atacar una carta Druid con una carta Shaman.
   * 
   * @param Paladin Una carta de la clase Shaman cualquiera.
   */
  @Override
  public void jugarconShaman(Shaman X) {
    this.Ataque = Math.max(this.Ataque - 2 * (X.Ataque / 3), minimo);
    this.Damage = this.Damage + 2 * (X.Ataque / 3);

  }

}

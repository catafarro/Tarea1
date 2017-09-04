package heartstone;

/**
 * Clase Paladin que implementa a la interface Carta y estiende a clase abstracta. Define los
 * metodos requeridos para la implementacion del juego heartstone.
 * 
 * @author Catalina Contreras
 */
public class Paladin extends AbstractCartas implements Carta {
  /**
   * Constructor de la clase Paladin.
   * 
   * @param nombre String que indica el nombre de la carta.
   * @param ataque double que indica el ataque que posee una carta.
   * @param vida double que indica la cantidad de vida que posee una carta.
   */
  public Paladin(String nombre, int ataque, int vida) {
    super(nombre, ataque, vida);
  }

  /**
   * Metodo que realiza una accion u otra frente a la carta atacada X. Utiliza double dispatch.
   * 
   * @param Carta que ser� atacada
   */
  @Override
  public void atacar(Carta X) {
    if (this.Vida > this.Damage)
      X.jugarconPaladin(this);
  }

  /**
   * Derivacion del metodo que ejecuta la accion de atacar una carta Paladin con una carta Knight.
   * 
   * @param Knight Una carta de la clase Knight cualquiera.
   */
  @Override
  public void jugarconKnight(Knight X) {
    this.Damage = this.Damage + X.Ataque / 2;

  }

  /**
   * Derivacion del metodo que ejecuta la accion de atacar una carta Paladin con una carta Mage.
   * 
   * @param Mage Una carta de la clase Mage cualquiera.
   */
  public void jugarconMage(Mage X) {
    this.Damage = this.Damage + X.Ataque * 2;

  }


}

package heartstone;

/**
 * Clase Healer que implementa a la interface Carta y estiende a clase abstracta. Define los metodos
 * requeridos para la implementacion del juego heartstone.
 * 
 * @author Catalina Contreras
 */
public class Healer extends AbstractCartas implements Carta {
  /**
   * Constructor de la clase Healer.
   * 
   * @param nombre String que indica el nombre de la carta.
   * @param ataque double que indica el ataque que posee una carta.
   * @param vida double que indica la cantidad de vida que posee una carta.
   */
  public Healer(String nombre, int ataque, int vida) {
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
      X.jugarconHealer(this);
  }

  /**
   * Derivacion del metodo que ejecuta la accion de atacar una carta Healer con una carta Assassin.
   * 
   * @param Assassin Una carta de la clase Assassin cualquiera.
   */
  @Override
  public void jugarconAssassin(Assassin X) {
    this.Damage = this.Damage + 2 * X.Ataque;
  }

  /**
   * Derivacion del metodo que ejecuta la accion de atacar una carta Healer con una carta Paladin.
   * 
   * @param Paladin Una carta de la clase Paladin cualquiera.
   */
  @Override
  public void jugarconPaladin(Paladin X) {
    this.Ataque = this.Ataque + 2 * (X.Ataque / 3);
    this.Damage = Math.max(this.Damage - 2 * (X.Ataque / 3), 0);

  }
}

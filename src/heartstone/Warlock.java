package heartstone;

/**
 * Clase Warlock que implementa a la interface Carta y estiende a clase abstracta. Define los
 * metodos requeridos para la implementacion del juego heartstone.
 * 
 * @author Catalina Contreras
 */
public class Warlock extends AbstractCartas implements Carta {
  /**
   * Constructor de la clase Warlock.
   * 
   * @param nombre String que indica el nombre de la carta.
   * @param ataque double que indica el ataque que posee una carta.
   * @param vida double que indica la cantidad de vida que posee una carta.
   */
  public Warlock(String nombre, int ataque, int vida) {
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
      X.jugarconWarlock(this);
  }

  /**
   * Derivacion del metodo que ejecuta la accion de atacar una carta Warlock con una carta Healer.
   * 
   * @param Healer Una carta de la clase Healer cualquiera.
   */
  @Override
  public void jugarconHealer(Healer X) {
    if (this.Vida > this.Damage)
      this.Damage = this.Damage + X.Ataque;
  }

  /**
   * Derivacion del metodo que ejecuta la accion de atacar una carta Warlock con una carta Shaman.
   * 
   * @param Shaman Una carta de la clase Shaman cualquiera.
   */
  @Override
  public void jugarconShaman(Shaman X) {
    this.Ataque = Math.max(this.Ataque - 2 * (X.Ataque / 3), minimo);
    this.Damage = this.Damage + 2 * (X.Ataque / 3);

  }


}

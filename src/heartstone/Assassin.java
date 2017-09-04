package heartstone;

/**
 * Clase Assasin que implementa a la interface Carta y estiende a clase abstracta. Define los
 * metodos requeridos para la implementacion del juego heartstone.
 * 
 * @author Catalina Contreras
 */
public class Assassin extends AbstractCartas implements Carta {
  /**
   * Constructor de la clase Assasin.
   * 
   * @param nombre String que indica el nombre de la carta.
   * @param ataque double que indica el ataque que posee una carta.
   * @param vida double que indica la cantidad de vida que posee una carta.
   */
  public Assassin(String nombre, int ataque, int vida) {
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
      X.jugarconAssassin(this);
  }

  /**
   * Derivacion del metodo que ejecuta la accion de atacar una carta Assasin con una carta Druid.
   * 
   * @param Druid Una carta de la clase Druid cualquiera.
   */
  @Override
  public void jugarconDruid(Druid X) {
    this.Ataque = this.Ataque + (X.Ataque / 2);

  }

  /**
   * Derivacion del metodo que ejecuta la accion de atacar una carta Assasin con una carta Warlock.
   * 
   * @param Warlock Una carta de la clase Warlock cualquiera.
   */
  @Override
  public void jugarconWarlock(Warlock X) {
    this.Damage = this.Damage + 2 * X.Ataque;

  }



}

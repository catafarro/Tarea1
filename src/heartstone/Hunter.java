package heartstone;

/**
 * Clase Hunter que implementa a la interface Carta y estiende a clase abstracta. Define los metodos
 * requeridos para la implementacion del juego heartstone.
 * 
 * @author Catalina Contreras
 */
public class Hunter extends AbstractCartas implements Carta {
  /**
   * Constructor de la clase Hunter.
   * 
   * @param nombre String que indica el nombre de la carta.
   * @param ataque double que indica el ataque que posee una carta.
   * @param vida double que indica la cantidad de vida que posee una carta.
   */
  public Hunter(String nombre, int ataque, int vida) {
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
      X.jugarconHunter(this);
  }

  /**
   * Derivacion del metodo que ejecuta la accion de atacar una carta Hunter con una carta Druid.
   * 
   * @param Druid Una carta de la clase Druid cualquiera.
   */
  @Override
  public void jugarconDruid(Druid X) {
    this.Damage = this.Damage + (X.Ataque / 2);

  }

  /**
   * Derivacion del metodo que ejecuta la accion de atacar una carta Hunter con una carta Mage.
   * 
   * @param Mage Una carta de la clase Mage cualquiera.
   */
  @Override
  public void jugarconMage(Mage X) {
    this.Damage = this.Damage + X.Ataque * 2;

  }


}

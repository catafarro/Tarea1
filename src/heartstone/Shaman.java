package heartstone;

/**
 * Clase Shaman que implementa a la interface Carta y estiende a clase abstracta. Define los metodos
 * requeridos para la implementacion del juego heartstone.
 * 
 * @author Catalina Contreras
 */
public class Shaman extends AbstractCartas implements Carta {
  /**
   * Constructor de la clase Shaman.
   * 
   * @param nombre String que indica el nombre de la carta.
   * @param ataque double que indica el ataque que posee una carta.
   * @param vida double que indica la cantidad de vida que posee una carta.
   */
  public Shaman(String nombre, int ataque, int vida) {
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
      X.jugarconShaman(this);
  }

  /**
   * Derivacion del metodo que ejecuta la accion de atacar una carta Shaman con una carta Hunter.
   * 
   * @param Hunter Una carta de la clase Hunter cualquiera.
   */
  @Override
  public void jugarconHunter(Hunter X) {
    this.Damage = this.Damage + 2 * X.Ataque;

  }
}

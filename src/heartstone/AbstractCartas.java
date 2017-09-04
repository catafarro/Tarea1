package heartstone;

/**
 * Clase Abstracta AbstractCartas que implementa a la interface Carta. Define los metodos requeridos
 * para la implementacion del juego heartstone.
 * 
 * @author Catalina Contreras
 */
public abstract class AbstractCartas implements Carta {
  /**
   * String Nombre que recibira la Carta.
   */
  String Nombre;
  /**
   * double Vida que describira la vida inicial tiene la Carta.
   */
  double Vida;
  /**
   * double Damage que describira el dano que ha recibido la Carta.
   */
  double Damage;
  /**
   * double Ataque que describira el ataque que tiene la Carta.
   */
  double Ataque;
  /**
   * double Minino, que establece la minima vida o ataque que se podrá tener.
   */
  double minimo = 0;

  /**
   * Constructor de la clase abstracta Abstract Class.
   * 
   * @param nombre String que indica el nombre de la carta.
   * @param ataque double que indica el ataque que posee una carta.
   * @param vida double que indica la cantidad de vida que posee una carta.
   */
  public AbstractCartas(String nombre, double ataque, double vida) {
    this.Damage = 0;
    this.Vida = vida;
    this.Ataque = ataque;
    this.Nombre = nombre;
  }


  /**
   * Metodo que permite visualizar la carasteristica damage de una carta
   * 
   * @return double Damage que indica el daño actual recibido por una carta
   */
  public double damage() {
    return this.Damage;
  }

  /**
   * Metodo que permite visualizar la carasteristica ataque de una carta.
   * 
   * @return double Ataque que indica el ataque actual que posee por carta.
   */
  public double ataque() {
    return this.Ataque;
  }

  /**
   * Metodo abstracto, que dependiendo de la clase de carta en la que se llame realiza una accion u
   * otra frente a la carta atacada X.Utiliza double dispatch en cada una de las clases aplicadas.
   * 
   * @param Carta que será atacada
   */
  public void atacar(Carta X) {}

  /**
   * Metodo que ejecuta la accion de atacar una carta X con una carta Healer, la cual restaura la
   * vida de X, restando al daño un 50% del ataque que Healer posea.
   * 
   * @param Healer Una carta de la clase Healer cualquiera.
   */
  public void jugarconHealer(Healer X) {
    if (this.Vida > this.Damage)
      this.Damage = Math.max(this.Damage - (X.Ataque / 2), minimo);
  }

  /**
   * Metodo que ejecuta la accion de atacar una carta X con una carta Assassin, la cual aumenta el
   * daño de X en el ataque que Assassin posea.
   * 
   * @param Assasin Una carta de la clase Assasin cualquiera.
   */
  public void jugarconAssassin(Assassin X) {
    this.Damage = this.Damage + X.Ataque;
  }


  /**
   * Metodo que ejecuta la accion de atacar una carta X con una carta Druid, la cual aumenta el
   * ataque de X en 50% del ataque que Druid posea pero aumenta el daño de X en un 50% de lo que
   * Druid posea.
   * 
   * @param Druid Una carta de la clase Druid cualquiera.
   */
  public void jugarconDruid(Druid X) {
    this.Ataque = this.Ataque + X.Ataque;
    this.Damage = this.Damage + (X.Ataque / 2);

  }

  /**
   * Metodo que ejecuta la accion de atacar una carta X con una carta Hunter, la cual aumenta el
   * daño de X en el ataque que Hunter posea.
   * 
   * @param Hunter Una carta de la clase Hunter cualquiera.
   */
  public void jugarconHunter(Hunter X) {
    this.Damage = this.Damage + X.Ataque;

  }

  /**
   * Metodo que ejecuta la accion de atacar una carta X con una carta Knight, la cual aumenta el
   * daño de X en el ataque que Knight posea.
   * 
   * @param Knight Una carta de la clase Knight cualquiera.
   */
  public void jugarconKnight(Knight X) {
    this.Damage = this.Damage + X.Ataque;

  }

  /**
   * Metodo que ejecuta la accion de atacar una carta X con una carta Mage, la cual aumenta el daño
   * de X en el ataque que Mage posea.
   * 
   * @param Mage Una carta de la clase Mage cualquiera.
   */
  public void jugarconMage(Mage X) {
    this.Damage = this.Damage + X.Ataque;

  }

  /**
   * Metodo que ejecuta la accion de atacar una carta X con una carta Paladin, la cual aumenta el
   * ataque de X en 1/3 del ataque que Paladin posea y disminuye el daño de X en un 1/3 de lo que
   * Paladin posea.
   * 
   * @param Paladin Una carta de la clase Paladin cualquiera.
   */
  public void jugarconPaladin(Paladin X) {
    this.Ataque = this.Ataque + (X.Ataque / 3);
    this.Damage = Math.max(this.Damage - (X.Ataque / 3), 0);

  }

  /**
   * Metodo que ejecuta la accion de atacar una carta X con una carta Shaman, la cual disminuye el
   * ataque de X en 1/3 del ataque que Shaman posea y aumenta el daño de X en un 1/3 de lo que
   * Shaman posea.
   * 
   * @param Shaman Una carta de la clase Shaman cualquiera.
   */
  public void jugarconShaman(Shaman X) {
    this.Ataque = Math.max(this.Ataque - (X.Ataque / 3), minimo);
    this.Damage = this.Damage + (X.Ataque / 3);

  }

  /**
   * Metodo que ejecuta la accion de atacar una carta X con una carta Warlock, la cual aumenta el
   * daño de X en el ataque que Warlock posea.
   * 
   * @param Warlock Una carta de la clase Warlock cualquiera.
   */
  public void jugarconWarlock(Warlock X) {
    this.Damage = this.Damage + X.Ataque;

  }

}

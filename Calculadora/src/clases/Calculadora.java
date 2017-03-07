package clases;

/**
 * Esta clase hace la funcion de una calculadora, sumas, restas...
 * @author David Calvo
 * @version 07/02/2017
 */
public class Calculadora {
	
	private int x, y;

	/**
	 * @param x primer operador
	 * @param y segundo operador
	 */
	public Calculadora(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * @return el valor del primer operador.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Establece el primer operador.
	 * @param x primer operador
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return el valor del segundo operador.
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Establece el primer operador.
	 * @param y segundo operador
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Este metodo realiza la suma de los operadores y la muestra por pantalla.
	 */
	public void suma(){
		System.out.println(this.getX() + this.getY());
	}
	
	/**
	 * Este metodo realiza la resta de los operadores y la muestra por pantalla.
	 */
	public void resta(){
		System.out.println(this.getX() - this.getY());
	}
}

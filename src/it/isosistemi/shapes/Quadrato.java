package it.isosistemi.shapes;


/**
 * @author thimo
 * @version 1.0
 * @created 30-mag-2017 16:14:58
 */
public class Quadrato implements Forma {

	private int lato;

	public Quadrato(){

	}

	public Quadrato(int lato) {
		this.lato = lato;
	}

	public void finalize() throws Throwable {

	}

	public int calcolaArea(){
		return lato*lato;
	}

	public int calcolaPerimetro(){
		return 0;
	}

}
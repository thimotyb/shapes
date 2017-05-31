package it.isosistemi.shapes;


/**
 * @author thimo
 * @version 1.0
 * @created 30-mag-2017 16:14:50
 */
public class Rettangolo implements Forma {

	private int larghezza;
	private int altezza;

	public Rettangolo(){

	}

	public Rettangolo(int height, int width) {
		this.larghezza = width;
		this.altezza = height;
	}

	public void finalize() throws Throwable {

	}

	public int calcolaArea(){
		return this.altezza*this.larghezza;
	}

	public int calcolaPerimetro(){
		return 0;
	}

}
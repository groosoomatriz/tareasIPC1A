public class Rectangulo {

	public static final float ALTURA = 15f;
	public static final float BASE = 20f;

	public float perimetro;
	public float area;

	public float calcularPerimetro() {
		return ALTURA * BASE;
	}

	public float calcularArea() {
		return BASE*2f + ALTURA*2f;
	}

	public void imprimirResultados() {
		System.out.printf("El perimetro es:  %f, el area es : %f\n", 
			calcularArea(), calcularPerimetro());
	}
}


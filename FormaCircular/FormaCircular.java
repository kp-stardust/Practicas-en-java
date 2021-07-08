package conClases;
/** Programa para calcular el area, circunferencia y diametro de un círculo
 * @author K.Villegas
 * @version 06 de Junio 2020
 * */
public class FormaCircular {
	
	private double radio;
	private final double PI = 3.1416;
	
	public FormaCircular (double radioIn) 
	{
		radio = radioIn;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcularArea () 
	{
		return PI * (radio * radio);
	}
	
	public double calcularCircunferencia() 
	{
		return (2 * PI * radio);
	}
	
	public double calcularDiametro()
	{
		return 2 * radio;
	}

}

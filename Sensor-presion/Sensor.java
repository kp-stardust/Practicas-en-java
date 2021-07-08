package conClases;
/** Clase que representa a un sensor de presión en un laboratorio 
 * @author K.Villegas
 * @version 25 de Junio de 2020
 * */
public class Sensor {
	
	protected double presion;
	
	public Sensor() 
	{
		presion = 0;
	}
	
	public Sensor(double valor) 
	{
		presion = valor;
	}

	public boolean setPresion(double valorIn) 
	{
		if (valorIn < 0) 
		{
			return false;
		}
		else 
		{
			presion = valorIn;
			return true;
		}
	}
	
	public double getPresion() {
		return presion;
	}

	
	
	
	
	

}

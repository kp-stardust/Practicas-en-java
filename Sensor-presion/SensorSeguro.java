package conClases;
/** Subclase de Sensor
 * @author K.Villegas
 * @version 25 de Junio de 2020*/
public class SensorSeguro extends Sensor{
	
	private double max;
	
	public SensorSeguro(double maxIn) 
	{	
		super(10);
		max = maxIn;
	}

	public SensorSeguro(double presionIn, double maxIn) 
	{
		super(presionIn);
		max = maxIn;
	}
	
	@Override
	public boolean setPresion(double presionIn) 
	{
		if ((presionIn > max) || (presionIn < 0))
		{
			return false;
		}
		else 
		{
			presion = presionIn;
			return true;
		}
	}

	@Override
	public String toString() {
		return "SensorSeguro [max=" + max + ", presion=" + presion + "]";
	}
	
	
}

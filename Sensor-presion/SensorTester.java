package conClases;

/** Clase de prueba Sensor
 * @author K.Villegas
 * @version 25 de Junio de 2020
 * */

public class SensorTester {

	public static void main(String[] args) {
		
		boolean testVal;
		
		Sensor sen1 = new Sensor();
		Sensor sen2 = new Sensor(52.5);
		Sensor sen3 = new Sensor();
		
		System.out.println("La presion del primer sensor es de: " + sen1.getPresion());
		System.out.println("La presion del segundo sensor es de: " + sen2.getPresion());
		System.out.println("La presion del tercer sensor es de: " + sen3.getPresion());
		
		testVal = sen1.setPresion(15.3);
		System.out.println(testVal);
		testVal = sen2.setPresion(-5);
		System.out.println(testVal);
		
		System.out.println("La presion del primer sensor es de: " + sen1.getPresion());
		System.out.println("La presion del tercer sensor es de: " + sen3.getPresion()); 
		
		SensorSeguro senSeg1 = new SensorSeguro(15);
		SensorSeguro senSeg2 = new SensorSeguro(25, 30);
		SensorSeguro senSeg3 = new SensorSeguro(30);
		
		testVal = senSeg1.setPresion(20);
		System.out.println(testVal);
		System.out.println(senSeg2);
		testVal = senSeg3.setPresion(22);
		System.out.println(testVal);
		System.out.println(senSeg3);
		
		

	}

}

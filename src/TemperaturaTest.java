
public class TemperaturaTest {

	public static void main(String[] args) {
		
		Temperatura Temp = new Temperatura (0, 0, 0, 0);
		
		
		Temperatura.konverzijaTemperatura(22, 3, 55);
		System.out.println(Temp.getKelvin());
		
		
	}

}


public class Temperatura {

	double temperatura;
	private double kelvin;
	private double celzijus;
	private double faranhajt;
	
	public Temperatura() {
	}

	public Temperatura(double temperatura, double kelvin, double celzijus,double faranhajt) {

		this.temperatura = temperatura;
		this.kelvin = kelvin;
		this.celzijus = celzijus;
		this.faranhajt = faranhajt;
	
	}
	
	public static  double konverzijaTemperatura(double kelvin, double celzijus,double faranhajt)	{
		
		if ()
		
		
		
		celzijus = (faranhajt -32) /1.8;
		faranhajt = (celzijus * 1.8)/1.8;
		kelvin = celzijus + 273.15;

		return celzijus;
		
		
		
	}
	
	
	
	
	public double getKelvin() {
		return kelvin;
	}

	public void setKelvin(double kelvin) {
		if ((kelvin >273.16)||(kelvin>0)){
			System.out.println("Vrijednost koju ste unijeli nije validna");
			return;
		} 
		this.kelvin = kelvin;
	}
	public double getCezijus(){
		return celzijus;
	}
	
	public void setCelzijus (double cezijus){
		if ((celzijus >273.13)||(celzijus<-273.13)){
			System.out.println("Vrijednost koju ste unijeli nije validna");
			return;
		}
		this.celzijus = celzijus;
	}
	
	public double getFaranhajt(){
		return faranhajt;
	}
	public void setFaranhajt(double faranhajt){
		if ((faranhajt >273.13)||(faranhajt<-273.13)){
			System.out.println("Vrijednost koju ste unijeli nije validna");
			return;
		}
		this.faranhajt = faranhajt;
			
	}
	
	public String toString() {
		return "Temperatura [kelvin=" + kelvin + ", celzijus=" + celzijus
				+ ", faranhajt=" + faranhajt + "]";
	}
	
}

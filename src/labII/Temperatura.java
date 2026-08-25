package labII;

public class Temperatura{
	private double temperatura;
	
	public double getTemperatura() {
		return this.temperatura;
	}
	
	public void setTemperatura(double value) {
		this.temperatura = value;
	}
	
	public Temperatura() {}
	
	public void aumentaTemperatura(double tempMais) {
		try {
			if(tempMais <= 0) {
				throw new IllegalArgumentException("Valor não pode ser menor ou igual a zero!");
			}
			this.temperatura += tempMais;			
		} catch (IllegalArgumentException e) {
			System.out.println("Temperatura inválida!");
		}
	}
	
	public void diminuiTemperatura(double tempMenos) {
		if(tempMenos <= 0) {
			throw new IllegalArgumentException("Valor não pode ser menor ou igual a zero!");
		}
		this.temperatura -= tempMenos;
	}
}

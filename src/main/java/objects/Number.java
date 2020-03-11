package objects;

import javax.ws.rs.Produces;

@Produces("application/json")
public class Number {
	private Integer numero;
	private Boolean primo;
	
	public Number(Integer number, Boolean isPrime) {
		this.numero = number;
		this.primo = isPrime;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer number) {
		this.numero = number;
	}
	public Boolean getPrimo() {
		return primo;
	}
	public void setPrimo(Boolean isPrime) {
		this.primo = isPrime;
	}
}

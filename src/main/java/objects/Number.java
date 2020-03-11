package objects;

import javax.ws.rs.Produces;

@Produces("application/json")
public class Number {
	private Integer number;
	private Boolean isPrime;
	
	public Number(Integer number, Boolean isPrime) {
		this.number = number;
		this.isPrime = isPrime;
	}
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Boolean getIsPrime() {
		return isPrime;
	}
	public void setIsPrime(Boolean isPrime) {
		this.isPrime = isPrime;
	}
}

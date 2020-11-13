import java.util.ArrayList;

public class Customer {
	String name;
	ArrayList<Book>bucher=new ArrayList<Book>();
	double geldSumme;
	
	public Customer(String name,double geldSumme) {
		this.name=name;
		this.geldSumme=geldSumme;
	}
	
	public double getGeldSumme() {
		return geldSumme;
	}

}

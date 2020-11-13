import java.util.ArrayList;

public class Book {
	String name;
	double price;
	int seitenAnzahl;
	int []ISBN;
	enum Genre{
		adventure,
		biography,
		comic,
		fantasy
	}
	
	
	public Book(String name,double price,int seitenAnzahl) {
		this.name=name;
		this.price=price;
		this.seitenAnzahl=seitenAnzahl;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean isGultig() {
		int sum=0;
		for(int i=0;i<(ISBN.length/2);i++) {
			sum+=ISBN[2*i]+(ISBN[2*i+1]*3);
		}
		sum=(sum%10);
		sum=(10-sum)%10;
		if(ISBN[12]==sum) {
			return true;
		}
		else {
			return false;
		}
	}
	public void setISBN(int[] ISBN) {
		this.ISBN=ISBN;
	}

	public int[] getISBN() {
		return ISBN;
	}
	
	public String getName() {
		return name;
	}
}

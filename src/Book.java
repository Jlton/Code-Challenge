import java.util.ArrayList;

public class Book {
	String name;
	double price;
	int seitenAnzahl;
	int []ISBN;
	String genre;
	
	
	public Book(String name,double price,int seitenAnzahl,String genre) {
		this.name=name;
		this.price=price;
		this.seitenAnzahl=seitenAnzahl;
		this.genre=genre;
	}
	
	public String getGenre() {
		return genre;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	//test ob ISBN-code is richtig oder falsch
	public boolean isGultig() {
		int sum=0;
		for(int i=0;i<(ISBN.length/2);i++) {
			//zwischen gerade Indexe und ungerade Indexe 
			sum+=ISBN[2*i]+(ISBN[2*i+1]*3);
		}
		sum=(sum%10);
		sum=(10-sum)%10;
		//die summ mit dem letzten index vergleichen
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

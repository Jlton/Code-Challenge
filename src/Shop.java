import java.util.ArrayList;

public class Shop {
	String name;
	ArrayList<Book>bucher=new ArrayList<Book>();
	ArrayList<Double>umstaz=new ArrayList<Double>();
	Customer customer;
	
	public Shop(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void verkauf(Book item,Customer client) {
		//ob client genug Geld hat
		if(client.getGeldSumme()<item.getPrice()) {
			System.out.println("sie haben kein genug Geld");
		}
		else {
			bucher.remove(item); //das buch von shop entfernen
			umstaz.add(item.getPrice()); //das geld preis zu den umsatz hinzufugen
			client.bucher.add(item); //das buch zu den bucher kollektion des clients
			double gesamteUmsatz=0;
			for(double i : umstaz) {
				gesamteUmsatz+=i;
			}
			System.out.println("Das Buch "+item.getName()+" wurde erfolgreich verkauft");
			//System.out.println(client.bucher);
		}
	}
	
	public void booksWithoutDuplicate() {
		ArrayList<String>bucherOhneDuplikate=new ArrayList<String>();
		for(Book i :bucher) {
			if(!bucherOhneDuplikate.contains(i.getName())) {
				bucherOhneDuplikate.add(i.getName());
			}
		}
		System.out.println("bucher ohne duplikate: "+bucherOhneDuplikate);
	}
	
	public void vergleich(Shop shop1,Shop shop2,Book item) {
		//test ob die zwei shops das gleiche Buch haben
		if(shop1.bucher.contains(item)&&shop2.bucher.contains(item) ) {
			for(Book i:shop1.bucher) {
				if(i==item) {
					System.out.println("shop "+shop1.getName()+" hat das Book "+item.getName()+" mit dem preis "+item.getPrice());
				}
			}
			for (Book i :shop2.bucher) {
				if(i==item) {
					System.out.println("shop "+shop2.getName()+"hat das Book "+item.getName()+" mit dem preis "+item.getPrice());
	 			}
			}
		}	
	}
	
	public void add(Book item) {
		//wenn ISBN-code richtig ist,addiere neues Buch
		if(item.isGultig()) {
			bucher.add(item);
			System.out.println("buch hinzugefugt: "+item.getName());
		}
		else {
			System.out.println("ISBN Code ist Falsch");
		}
	}
	
	
	public void filter(String genre) {
		genre.toLowerCase();
		for (Book i :bucher) {
			if(i.getGenre()==genre) {
				System.out.println("bucher mit genre "+genre+" sind: "+i.getName());
			}
		}
	}
}

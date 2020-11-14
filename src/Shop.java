import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Shop {
	String name;
	ArrayList<String>bucher=new ArrayList<String>();
	ArrayList<Double>umstaz=new ArrayList<Double>();
	Customer customer;
	Book book;
	
	public Shop(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void verkauf(Book item,Customer client) {
		if(client.getGeldSumme()<item.getPrice()) {
			System.out.println("sie haben kein genug Geld");
		}
		else {
			bucher.remove(item.getName());
			umstaz.add(item.getPrice());
			client.bucher.add(item);
			double gesamteUmsatz=0;
			for(double i : umstaz) {
				gesamteUmsatz+=i;
			}
			System.out.println("liste nach dem verkaufen des buches "+item.getName()+bucher);
			//System.out.println(client.bucher);
		}
	}
	
	public void booksWithoutDuplicate() {
		ArrayList<String>bucherOhneDuplikate=new ArrayList<String>();
		for(String i :bucher) {
			if(!bucherOhneDuplikate.contains(i)) {
				bucherOhneDuplikate.add(i);
			}
		}
		System.out.println("bucher ohne duplikate: "+bucherOhneDuplikate);
	}
	
	public void vergleich(Shop shop1,Shop shop2,Book item) {
		if(shop1.bucher.contains(item.getName())&&shop2.bucher.contains(item.getName()) ) {
			for(String i:shop1.bucher) {
				if(i==item.getName()) {
					System.out.println("shop "+shop1.getName()+"hat das Book "+item.getName()+" mit dem preis "+item.getPrice());
				}
			}
			for (String i :shop2.bucher) {
				if(i==item.getName()) {
					System.out.println("shop "+shop2.getName()+"hat das Book "+item.getName()+" mit dem preis "+item.getPrice());
	 			}
			}
		}	
	}
	
	public void add(Book item) {
		if(item.isGultig()) {
			bucher.add(item.getName());
			System.out.println("buch hinzugefugt: "+item.getName()+" ,liste nach dem hinzufugen "+bucher);
		}
		else {
			System.out.println("ISBN Code ist Falsch");
		}
	}
}

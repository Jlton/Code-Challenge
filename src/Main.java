
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hallo world");
		
		Shop shop1=new Shop("Saturn");
		Shop shop2=new Shop("babay");
		int[]array1=new int[] {9,7,8,3,6,0,8,9,6,3,7,6,2};
		int[]array2=new int[] {9,7,8,3,4,4,2,2,6,7,7,4,7};
		int[]array3=new int[] {9,7,8,3,1,2,7,3,2,3,2,0,7};
		int[]array4=new int[] {9,7,8,3,4,4,2,2,6,7,7,4,7};
		int[]array5=new int[] {9,7,8,3,8,4,1,3,3,5,1,8,0};


		Book book1=new Book("Kill the Witch",40,300);
		Book book3=new Book("Witch slayer",33,330);
		book3.setISBN(array3);
		book1.setISBN(array1);
		
		
		Book book2=new Book("One Piece",60,800);
		book2.setISBN(array2);
		
		Book book4=new Book("Harry Potter",130,1500);
		book4.setISBN(array4);
		
		Book book5=new Book("istansya",25,140);
		book5.setISBN(array5);
		
		Customer costumer1=new Customer("Ali",600);
		Customer costumer2=new Customer("Moayad",20);
		
		
		shop1.add(book1);
		shop1.add(book2);
		shop1.add(book2);
		shop1.add(book3);
		shop1.add(book4);
		shop1.add(book5);
		shop1.add(book5);
		
		shop2.add(book1);
		shop2.add(book3);
		
		shop1.vergleich(shop1, shop2, book1);
		shop1.vergleich(shop1, shop2, book2);
		shop1.vergleich(shop1, shop2, book3);
		shop1.vergleich(shop1, shop2, book4);
		shop1.vergleich(shop1, shop2, book5);
		
		shop1.booksWithoutDuplicate();
		shop2.booksWithoutDuplicate();
		
		shop1.verkauf(book1,costumer1);
		shop1.verkauf(book2,costumer1);
		shop1.verkauf(book3,costumer1);
		shop1.verkauf(book4,costumer1);
		shop1.verkauf(book5,costumer1);

		shop1.vergleich(shop1, shop2, book1);
		shop1.vergleich(shop1, shop2, book2);
		shop1.vergleich(shop1, shop2, book3);
		shop1.vergleich(shop1, shop2, book4);
		shop1.vergleich(shop1, shop2, book5);
	
	}

}

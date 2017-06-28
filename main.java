import java.text.BreakIterator;

public class main {

	public static void main(final String[] args) {
		Product product1 = new Product();
		product1.setName("wheat");
		product1.setPrice(6);
		product1.setQuantity(100);
		
		Product product2 = new Product();
		product2.setName("sweets");
		product2.setPrice(145);
		product2.setQuantity(5);
		
		Product product3 = new Product();
		product3.setName("nuts");
		product3.setPrice(125);
		product3.setQuantity(10);
		
		Product product4 = new Product();
		product4.setName("sausage");
		product4.setPrice(68);
		product4.setQuantity(1);
	
	
	if ((product1.getPrice() > product2.getPrice()) && (product1.getPrice() > product3.getPrice()) && (product1.getPrice() > product4.getPrice()))
	System.out.println("The most expensive product  is " + product1.getName() + ", its quantity is " +product1.getQuantity());
	else if ((product2.getPrice() > product1.getPrice()) && (product2.getPrice() > product3.getPrice()) && (product2.getPrice() > product4.getPrice()))
	System.out.println("The most expensive product  is " + product2.getName() + ", its quantity is " +product2.getQuantity() );
	else if ((product3.getPrice() > product2.getPrice()) && (product3.getPrice() > product1.getPrice()) && (product3.getPrice() > product4.getPrice()))
	System.out.println("The most expensive product  is " + product3.getName() + ", its quantity is " +product3.getQuantity() );
	else if ((product4.getPrice() > product2.getPrice()) && (product4.getPrice() > product3.getPrice()) && (product4.getPrice() > product1.getPrice()))
	System.out.println("The most expensive product  is " + product4.getName() + ", its quantity is " +product4.getQuantity() ); 
	
			
	if (product1.getQuantity() > product2.getQuantity() && product1.getQuantity() > product3.getQuantity() && product1.getQuantity() > product4.getQuantity())
		System.out.println( product1.getName()  +  " is the  product which has the biggest quantity" );
	else if (product2.getQuantity() > product1.getQuantity() && product2.getQuantity() > product3.getQuantity() && product2.getQuantity() > product4.getQuantity())
		System.out.println( product2.getName()  +  " is the  product which has the biggest quantity" );
	else if (product3.getQuantity() > product2.getQuantity() && product3.getQuantity() > product1.getQuantity() && product3.getQuantity() > product4.getQuantity())
		System.out.println( product3.getName()  +  " is the  product which has the biggest quantity" );
	else if (product4.getQuantity() > product2.getQuantity() && product4.getQuantity() > product3.getQuantity() && product4.getQuantity() > product1.getQuantity())
		System.out.println( product4.getName()  +  " is the product which has the biggest quantity" );
			
	}
}

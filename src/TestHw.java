import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHw {

	@Test
	void test() {
		ShoppingCart obj = new ShoppingCart();
		assertTrue(obj.getPcount()==0);
		
	}
	
	@Test
	void test1() {
		ShoppingCart obj1 = new ShoppingCart();
		obj1.AddBook("Java Book", 127, 1);
		assertTrue(obj1.getPcount()==1 && obj1.getPcost()==127);
		
	}
	
	@Test
	void test2() {
		ShoppingCart obj2 = new ShoppingCart();
		obj2.AddBook("Java Book", 127, 1);
		obj2.AddBook("Web design Book", 100, 1);
		assertTrue(obj2.getPcount()==2 && obj2.getPcost()==227);
		
	}

}

/*
 * Test file for Product Class
 * @author Dhruv Lakhiani
 */
package eStoreSearch;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {
    @Test public void testProduct() {
      try {
        Product testP = new Book();
        assertNotNull(testP);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }

    @Test public void testSetProductID() {
      try {
        Product testP = new Electronics();
        testP.setProductID(100100);
        assertEquals("testP's productID should be 100100", 100100, testP.getProductID());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    
    @Test public void testSetDesc() {
      try {
        Product testP = new Book();
        testP.setDesc("Java Programming");
        assertEquals("testP's description should be Java Programming", "Java Programming", testP.getDesc());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    
    @Test public void testSetPrice() {
      try {
        Product testP = new Electronics();
        testP.setPrice(10.5f);
        assertEquals("testP's price should be 10.5", 10.5f, testP.getPrice(), 0.0);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    
    @Test public void testSetYear() {
      try {
        Product testP = new Book();
        testP.setYear("2020");
        assertEquals("testP's year should be 2020", "2020", testP.getYear());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    
    @Test public void testToString() {
      try {
        Product testP = new Electronics();
        testP.setProductID(100100);
        testP.setDesc("Java Programming");
        testP.setPrice(10.5f);
        testP.setYear("2020");
        assertEquals("100100\nJava Programming\n10.5\n2020\nnull", testP.toString());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    
    @Test public void testEquals() {
      try {
        Product [] testP = new Product[2];
        for (int i=0;i<2;i++) {
          testP[i] = new Book();
          testP[i].setProductID(100100);
          testP[i].setDesc("Java Programming");
          testP[i].setPrice(10.5f);
          testP[i].setYear("2020");
        }
        assertEquals("the retVal should be true", true, testP[0].equals(testP[1]));
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }

    @Test public void testPrintToFile() {
      try {
        Product testP = new Electronics();
        testP.setProductID(100100);
        testP.setDesc("Java Programming");
        testP.setPrice(10.5f);
        testP.setYear("2020");
        assertEquals("type = \"electronics\""+
                     "\nproductID = \"100100\""+
                     "\ndescription = \"Java Programming\""+
                     "\nprice = \"10.5\""+
                     "\nyear = \"2020\""+
                     "\nmaker = \"null\"", testP.printToFile());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
}
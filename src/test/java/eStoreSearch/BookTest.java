/*
 * Test file for Book Class
 * @author Dhruv Lakhiani
 */
package eStoreSearch;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {
    @Test public void testBook() {
      try {
        Book testBook = new Book();
        assertNotNull(testBook);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    
    @Test public void testSetAuthors() {
      try {
        Book testBook = new Book();
        testBook.setAuthors("Dhruv");
        assertEquals("testBook's description should be Dhruv", "Dhruv", testBook.getAuthors());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    
    @Test public void testSetPublisher() {
      try {
        Book testBook = new Book();
        testBook.setPublisher("Lakhiani");
        assertEquals("testBook's description should be Lakhiani", "Lakhiani", testBook.getPublisher());
      } catch (Exception e) {
        System.out.println(e.getMessage()); 
      }
    }
    
    @Test public void testToString() {
      try {
        Book testBook = new Book();
        testBook.setProductID(100100);
        testBook.setDesc("Java Programming");
        testBook.setPrice(10.5f);
        testBook.setYear("2020");
        testBook.setAuthors("Dhruv");
        testBook.setPublisher("Lakhiani");
        assertEquals("100100\nJava Programming\n10.5\n2020\nDhruv\nLakhiani",
                      testBook.toString());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    
    @Test public void testEquals() {
      try {
        Book [] testBook = new Book[2];
        for (int i=0;i<2;i++) {
          testBook[i] = new Book();
          testBook[i].setProductID(100100);
          testBook[i].setDesc("Java Programming");
          testBook[i].setPrice(10.5f);
          testBook[i].setYear("2020");
          testBook[i].setAuthors("Dhruv");
          testBook[i].setPublisher("Lakhiani");
        }
        assertEquals("the retVal should be true", true, testBook[0].equals(testBook[1]));
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }

    @Test public void testPrintToFile() {
      try {
        Book testBook = new Book();
        testBook.setProductID(100100);
        testBook.setDesc("Java Programming");
        testBook.setPrice(10.5f);
        testBook.setYear("2020");
        testBook.setAuthors("Dhruv");
        testBook.setPublisher("Lakhiani");
        assertEquals("type = \"book\""+
                     "\nproductID = \"100100\""+
                     "\ndescription = \"Java Programming\""+
                     "\nprice = \"10.5\""+
                     "\nyear = \"2020\""+
                     "\nauthors = \"Dhruv\""+
                     "\npublisher = \"Lakhiani\"", testBook.printToFile());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
}
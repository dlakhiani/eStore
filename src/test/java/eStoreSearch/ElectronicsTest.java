/*
 * Test file for Electronics Class
 * @author Dhruv Lakhiani
 */
package eStoreSearch;

import org.junit.Test;
import static org.junit.Assert.*;

public class ElectronicsTest {
    @Test public void testE() {
      try {
        Electronics testE = new Electronics();
        assertNotNull(testE);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    
    @Test public void testSetMaker() {
      try {
        Electronics testE = new Electronics();
        testE.setMaker("Lakhiani");
        assertEquals("testE's description should be Lakhiani", "Lakhiani", testE.getMaker());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    
    @Test public void testToString() {
      try {
        Electronics testE = new Electronics();
        testE.setProductID(100100);
        testE.setDesc("Java Programming");
        testE.setPrice(10.5f);
        testE.setYear("2020");
        testE.setMaker("Lakhiani");
        assertEquals("100100\nJava Programming\n10.5\n2020\nLakhiani", testE.toString());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    
    @Test public void testEquals() {
      try {
        Electronics [] testE = new Electronics[2];
        for (int i=0;i<2;i++) {
          testE[i] = new Electronics();
          testE[i].setProductID(100100);
          testE[i].setDesc("Java Programming");
          testE[i].setPrice(10.5f);
          testE[i].setYear("2020");
          testE[i].setMaker("Lakhiani");
        }
        assertEquals("the retVal should be true", true, testE[0].equals(testE[1]));
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }

    @Test public void testPrintToFile() {
      try {
        Electronics testE = new Electronics();
        testE.setProductID(100100);
        testE.setDesc("Java Programming");
        testE.setPrice(10.5f);
        testE.setYear("2020");
        testE.setMaker("Lakhiani");
        assertEquals("type = \"electronics\""+
                     "\nproductID = \"100100\""+
                     "\ndescription = \"Java Programming\""+
                     "\nprice = \"10.5\""+
                     "\nyear = \"2020\""+
                     "\nmaker = \"Lakhiani\"", testE.printToFile());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
}
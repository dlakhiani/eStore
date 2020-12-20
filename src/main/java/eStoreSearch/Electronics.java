/*
 * Electronics Subclass (of Product): holds attribute of maker.
 * @author Dhruv Lakhiani
 */
package eStoreSearch;

public class Electronics extends Product {
  private static final long serialVersionUID = 1L;
  //Declarations
  private String maker;
  
  /**
  * This method returns the Electronics's maker
  * @return String: maker is a String.
  */
  public String getMaker() {
    return maker;
  }
  
  /**
  * This method sets the maker of the Electronics.
  * @param m is the maker String
  * @return boolean: the String is accepted = true.
  */
  public boolean setMaker(String m) {
    if (m.equals("")) {
      m = null;
    }
    maker = m;
    return true;
  }

  /**
   * Is a copy constructor for Electronics given
   * @param e is the Electronics being copied
   * @throws Exception
   */
  public Electronics(Electronics e) throws Exception {
    this(e.getProductID(), e.getDesc(), e.getPrice(), e.getYear(), e.maker);
  }

  /**
  * This method creates a Electronics object.
  */
  public Electronics() throws Exception {
    this( 0, "", 0.0f, "1000", null);
  }

  public Electronics( int newProductID, String newDesc, Float newPrice, 
                      String newYear, String newMaker) throws Exception {
    super( newProductID, newDesc, newPrice, newYear);
    maker = newMaker;
  }
  
  /**
  * This method prints the instance variables of the Electronics.
  * @return String: all instance variables of the Electronics are concatenated to String.
  */
  @Override
  public String toString() {
    return super.toString() +
    "\n" + getMaker();
  }
  
  /**
  * This method compares 2 Electronics objects.
  * @param other is the second "Electronics"
  * @return boolean: if Electronicss are equal = true, else false.
  */
  @Override
  public boolean equals(Object other) {
    if (other == null) {
      return false;
    } else if (getClass() != other.getClass()) {
      return false;
    } else {
      Electronics otherE = (Electronics)other;
      return super.equals(otherE) &&
             maker.equalsIgnoreCase(otherE.maker);
    }
  }

  /**
   * This method prints to the output file.
   */
  @Override
  public String printToFile() {
  return  "type = \"electronics\"" +
          "\n" + super.printToFile() +
          "\nmaker = \"" + getMaker() + "\"";
  }

  /**
   * This method creates a Electronics object clone
   */
  @Override
  public Electronics clone() {
    try {
      return new Electronics(this);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return null;
  }
}
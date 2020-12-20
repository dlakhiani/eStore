/*
 * Product Superclass: holds attributes of productID, description, price, year.
 * @author Dhruv Lakhiani
 */
package eStoreSearch;

public abstract class Product extends Exception {
  private static final long serialVersionUID = 1L;
  //Declarations
  private int productID; //must be present - 6 digits
  private String desc; //must be present
  private float price;
  private String year; //must be present - between 1000, 9999

  //getters
  /**
  * This method returns the Product's productID
  * @return int: productID is an integer.
  */
  public int getProductID() {
    return productID;
  }
  
  /**
   * This method returns the Product's description
   * @return String: desc is a String.
   */
  public String getDesc() {
    return desc;
  }
  
  /**
   * This method returns the Product's price
   * @return float: price is a float.
   */
  public float getPrice() {
    return price;
  }
  
  /**
   * This method returns the Product's year
   * @return String: year is a String.
   */
  public String getYear() {
    return year;
  }

  //setters
  /**
   * This method sets the productID of the Product.
   * @param id is the productID integer
   * @return boolean: if the is positive and in the range of 6 digits = true, else false.
   * @throws Exception when not in range.
   */
  public boolean setProductID(int id) throws Exception {
    if (id >= 0 && id <= 999999) {
      productID = id;
      return true;
    } else
      throw new Exception("\nError: Product ID is not 6 digits.");
  }
  
  /**
   * This method sets the description of the Product.
   * @param d is the description String
   * @return boolean: the String is accepted = true.
   */
  public boolean setDesc(String d) {
    if (d==null || d.length() == 0 || d.trim().isEmpty() || d.equals("[\\s]")) {
      desc = "none";
    }
    desc = d;
    return true;
  }
  
  /**
   * This method sets the price of the Product.
   * @param p is the price float
   * @return boolean: the float is positive = true, else false.
   */
  public boolean setPrice(float p) {
    if (p >= 0) {
      price = p;
      return true;
    } else {
      price = 0.0f;
      return false;
    }
  }
  
  /**
   * This method sets the year of the Product.
   * @param y is the year String
   * @return boolean: the String is accepted and within the range = true, else false.
   * @throws Exception when not in range.
   */
  public boolean setYear(String y) throws Exception {
    int yInt = Integer.parseInt(y);
    if (yInt >= 1000 && yInt <= 9999) {
      year = y;
      return true;
    } else
      throw new Exception("\nError: Year is not within 1000 and 9999.");
  }

  /**
   * Is a copy constructor for Product given
   * @param p is the Product being copied
   * @throws Exception
   */
  public Product(Product p) throws Exception {
    this( p.productID, p.desc, p.price, p.year);
  }

  /**
   * This method creates Product object.
   */
  public Product() throws Exception {
    this( 0, "", 0.0f, "1000");
  }

  /**
   * This method creates Product object using passed parameters.
   * @param newProductID is the productID integer.
   * @param newDesc is the description String.
   * @param newYear is the year String.
   */
  public Product( int newProductID, String newDesc, float newPrice, String newYear) 
    throws Exception {
    int yInt = Integer.parseInt(newYear);
    if ( (newProductID < 0 && newProductID > 999999) || (yInt < 1000 && yInt > 9999) ) {
      throw new Exception("\nError: Product object failed.");
    } else {
      productID = newProductID;
      desc = newDesc;
      price = newPrice;
      year = newYear; 
    }
  }

  /**
  * This method prints the instance variables of the Product.
  * @return String: all instance variables of the Product are concatenated to String.
  */
  public String toString() {
    String formatID = String.format("%06d", getProductID());
    return "" + formatID +
    "\n" + getDesc() +
    "\n" + getPrice() +
    "\n" + getYear();
  }

  /**
  * This method compares 2 Product objects.
  * @param other is the Object to compare.
  * @return boolean: if Products are equal = true, else false.
  */
  public boolean equals(Object other) {
    if (other == null) {
      return false;
    } else if (getClass() != other.getClass()) {
      return false;
    } else {
      Product otherProduct = (Product)other;
      return ((productID == otherProduct.productID) &&
              (desc.equalsIgnoreCase(otherProduct.desc)) &&
              (price == otherProduct.price) &&
              (year.equalsIgnoreCase(otherProduct.year)));
    }
  }

  /**
   * This method prints to the output file.
   * @return String: all instance variables of the Product are concatenated to String.
   */
  public String printToFile() {
    String formatID = String.format("%06d", getProductID());
    return "productID = \"" + formatID + "\"" +
           "\ndescription = \"" + getDesc() + "\"" +
           "\nprice = \""+ getPrice() + "\"" +
           "\nyear = \"" + getYear() + "\"";
   }

   /**
    * This method creates a Product object clone
    */
   public abstract Product clone();
}